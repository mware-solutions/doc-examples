package com.mware.examples.activity;

import com.mware.core.model.Description;
import com.mware.core.model.Name;
import com.mware.web.BcCsrfHandler;
import com.mware.web.WebApp;
import com.mware.web.WebAppPlugin;
import com.mware.web.framework.Handler;
import com.mware.web.privilegeFilters.ReadPrivilegeFilter;

import javax.servlet.ServletContext;

@Name("Activity")
@Description("Custom activity rows based on events or long running processes")
public class ActivityWebAppPlugin implements WebAppPlugin {

    public void init(WebApp app, ServletContext servletContext, Handler authenticationHandler) {
        Class<? extends Handler> authenticator = authenticationHandler.getClass();
        Class<? extends Handler> csrfProtector = BcCsrfHandler.class;

        app.registerJavaScript("/com/mware/examples/activity/plugin.js", true);
        app.registerWebWorkerJavaScript("/com/mware/examples/activity/service.js");

        app.registerJavaScriptComponent("/com/mware/examples/activity/Finished.jsx");

        app.registerResourceBundle("/com/mware/examples/activity/messages.properties");

        app.post("/com/mware/examples/activity/start", authenticator, csrfProtector, ReadPrivilegeFilter.class, StartExample.class);
    }

}
