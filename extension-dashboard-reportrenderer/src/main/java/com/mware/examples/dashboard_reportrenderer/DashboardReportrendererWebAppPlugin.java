package com.mware.examples.dashboard_reportrenderer;

import com.mware.core.model.Description;
import com.mware.core.model.Name;
import com.mware.web.WebApp;
import com.mware.web.WebAppPlugin;
import com.mware.web.framework.Handler;

import javax.servlet.ServletContext;

@Name("Dashboard Report Renderer")
@Description("Define custom report renderers for dashboard")
public class DashboardReportrendererWebAppPlugin implements WebAppPlugin {

    public void init(WebApp app, ServletContext servletContext, Handler authenticationHandler) {
        app.registerJavaScript("/com/mware/examples/dashboard_reportrenderer/plugin.js", true);
        app.registerJavaScript("/com/mware/examples/dashboard_reportrenderer/renderer.js", false);
        app.registerResourceBundle("/com/mware/examples/dashboard_reportrenderer/messages.properties");
    }

}
