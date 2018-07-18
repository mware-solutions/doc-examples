package com.mware.examples.dashboard_item;

import com.mware.core.model.Description;
import com.mware.core.model.Name;
import com.mware.web.WebApp;
import com.mware.web.WebAppPlugin;
import com.mware.web.framework.Handler;

import javax.servlet.ServletContext;

@Name("Dashboard Item")
@Description("Allow custom content to be rendered in a card on dashboards")
public class DashboardItemWebAppPlugin implements WebAppPlugin {

    public void init(WebApp app, ServletContext servletContext, Handler authenticationHandler) {
        app.registerJavaScript("/com/mware/examples/dashboard_item/plugin.js", true);

        app.registerJavaScriptComponent("/com/mware/examples/dashboard_item/React.jsx");
        app.registerJavaScriptComponent("/com/mware/examples/dashboard_item/Config.jsx");

        app.registerResourceBundle("/com/mware/examples/dashboard_item/messages.properties");
    }

}
