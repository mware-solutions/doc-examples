package com.mware.examples.menubar;

import com.mware.core.model.Description;
import com.mware.core.model.Name;
import com.mware.web.WebApp;
import com.mware.web.WebAppPlugin;
import com.mware.web.framework.Handler;

import javax.servlet.ServletContext;

@Name("Menubar")
@Description("Add items to menubar")
public class MenubarWebAppPlugin implements WebAppPlugin {

    public void init(WebApp app, ServletContext servletContext, Handler authenticationHandler) {
        app.registerJavaScript("/com/mware/examples/menubar/plugin.js", true);
        app.registerJavaScriptComponent("/com/mware/examples/menubar/Pane.jsx");
        app.registerJavaScriptTemplate("/com/mware/examples/menubar/welcome.hbs");
        app.registerResourceBundle("/com/mware/examples/menubar/messages.properties");
    }

}
