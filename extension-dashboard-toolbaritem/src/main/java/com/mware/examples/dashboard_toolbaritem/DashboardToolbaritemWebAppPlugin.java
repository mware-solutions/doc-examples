package com.mware.examples.dashboard_toolbaritem;

import com.mware.core.model.Description;
import com.mware.core.model.Name;
import com.mware.web.WebApp;
import com.mware.web.WebAppPlugin;
import com.mware.web.framework.Handler;

import javax.servlet.ServletContext;

@Name("Dashboard Toolbar Item")
@Description("Define toolbar items for dashboard cards")
public class DashboardToolbaritemWebAppPlugin implements WebAppPlugin {

    public void init(WebApp app, ServletContext servletContext, Handler authenticationHandler) {
        app.registerJavaScript("/com/mware/examples/dashboard_toolbaritem/plugin.js", true);
        app.registerJavaScript("/com/mware/examples/dashboard_toolbaritem/popover.js", false);
        app.registerResourceBundle("/com/mware/examples/dashboard_toolbaritem/messages.properties");
        app.registerFile("/com/mware/examples/dashboard_toolbaritem/trash.png", "image/png");
    }

}
