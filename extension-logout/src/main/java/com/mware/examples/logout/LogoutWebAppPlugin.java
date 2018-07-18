package com.mware.examples.logout;

import com.mware.core.model.Description;
import com.mware.core.model.Name;
import com.mware.web.WebApp;
import com.mware.web.WebAppPlugin;
import com.mware.web.framework.Handler;

import javax.servlet.ServletContext;

@Name("Logout")
@Description("Register a handler that is notified of logout.")
public class LogoutWebAppPlugin implements WebAppPlugin {

    public void init(WebApp app, ServletContext servletContext, Handler authenticationHandler) {
        app.registerJavaScript("/com/mware/examples/logout/plugin.js", true);
        app.registerResourceBundle("/com/mware/examples/logout/messages.properties");
    }

}
