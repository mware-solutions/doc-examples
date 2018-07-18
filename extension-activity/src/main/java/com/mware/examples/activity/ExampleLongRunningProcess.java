package com.mware.examples.activity;

import com.google.inject.Inject;
import com.mware.core.model.longRunningProcess.LongRunningProcessRepository;
import com.mware.core.model.longRunningProcess.LongRunningProcessWorker;
import com.mware.core.util.ClientApiConverter;
import org.json.JSONObject;


public class ExampleLongRunningProcess extends LongRunningProcessWorker {

    private LongRunningProcessRepository longRunningProcessRepository;

    @Override
    public boolean isHandled(JSONObject jsonObject) {
        return jsonObject.getString("type").equals(ExampleQueueItem.TYPE);
    }

    @Override
    protected void processInternal(JSONObject jsonObject) {
        ExampleQueueItem queueItem = ClientApiConverter.toClientApi(jsonObject.toString(), ExampleQueueItem.class);

        for (int p = 0; p < 100; p++) {
            delay();
            longRunningProcessRepository.reportProgress(jsonObject, (double)p / 100.0, "Processing " + p);
        }

        jsonObject.put("output", "finished with " + queueItem.getPropertyA());
    }

    @Inject
    public void setLongRunningProcessRepository(LongRunningProcessRepository longRunningProcessRepository) {
        this.longRunningProcessRepository = longRunningProcessRepository;
    }

    private void delay() {
       try {
           Thread.sleep(30);
       } catch (InterruptedException e) { }
    }
}
