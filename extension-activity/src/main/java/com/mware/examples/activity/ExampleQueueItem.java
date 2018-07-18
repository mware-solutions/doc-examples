package com.mware.examples.activity;

import com.mware.core.util.ClientApiConverter;
import org.json.JSONObject;

public class ExampleQueueItem {
    public static String TYPE = "com-mware-examples-activity";

    private String propertyA;

    public ExampleQueueItem() {
    }

    public ExampleQueueItem(String propertyA) {
        this.propertyA = propertyA;
    }

    public String getPropertyA() {
        return propertyA;
    }

    public String getType() {
        return TYPE;
    }

    public JSONObject toJson() {
        return new JSONObject(ClientApiConverter.clientApiToString(this));
    }
}
