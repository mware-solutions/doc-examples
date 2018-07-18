package com.mware.examples.activity;

import com.google.inject.Inject;
import com.mware.core.model.longRunningProcess.LongRunningProcessRepository;
import com.mware.core.user.User;
import com.mware.ge.Authorizations;
import com.mware.web.clientapi.model.ClientApiLongRunningProcessSubmitResponse;
import com.mware.web.framework.ParameterizedHandler;
import com.mware.web.framework.annotations.Handle;
import com.mware.web.framework.annotations.Required;

public class StartExample implements ParameterizedHandler {

    private final LongRunningProcessRepository longRunningProcessRepository;

    @Inject
    public StartExample(LongRunningProcessRepository longRunningProcessRepository) {
        this.longRunningProcessRepository = longRunningProcessRepository;
    }
    @Handle
    public ClientApiLongRunningProcessSubmitResponse start(
            User user,
            Authorizations authorizations,
            @Required(name = "propertyA") String propertyA
    ) {
        ExampleQueueItem exampleQueueItem = new ExampleQueueItem(propertyA);
        String id = this.longRunningProcessRepository.enqueue(exampleQueueItem.toJson(), user, authorizations);

        return new ClientApiLongRunningProcessSubmitResponse(id);
    }
}
