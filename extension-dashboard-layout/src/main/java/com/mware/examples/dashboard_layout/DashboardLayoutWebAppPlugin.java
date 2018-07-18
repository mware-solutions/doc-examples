package com.mware.examples.dashboard_layout;

import com.mware.core.model.Description;
import com.mware.core.model.Name;
import com.mware.web.WebApp;
import com.mware.web.WebAppPlugin;
import com.mware.web.framework.Handler;

import javax.servlet.ServletContext;

@Name("Dashboard Layout")
@Description("Define dashboard layout for new cases")
public class DashboardLayoutWebAppPlugin implements WebAppPlugin {

    public void init(WebApp app, ServletContext servletContext, Handler authenticationHandler) {
        app.registerJavaScript("/com/mware/examples/dashboard_layout/plugin.js", true);
    }
}
