package com.mware.examples.admin;


import com.mware.core.model.Description;
import com.mware.core.model.Name;
import com.mware.web.WebApp;
import com.mware.web.WebAppPlugin;
import com.mware.web.framework.Handler;

import javax.servlet.ServletContext;

@Name("Admin")
@Description("Add admin tools to admin pane")
public class AdminWebAppPlugin implements WebAppPlugin {

    public void init(WebApp app, ServletContext servletContext, Handler authenticationHandler) {
        app.registerJavaScript("/com/mware/examples/admin/plugin.js");

        app.registerJavaScriptComponent("/com/mware/examples/admin/React.jsx");
        app.registerJavaScript("/com/mware/examples/admin/flight.js", false);
        app.registerJavaScriptTemplate("/com/mware/examples/admin/flight-template.hbs");

        app.registerResourceBundle("/com/mware/examples/admin/messages.properties");
    }

}
