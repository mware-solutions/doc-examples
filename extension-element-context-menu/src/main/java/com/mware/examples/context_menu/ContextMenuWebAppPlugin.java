package com.mware.examples.context_menu;

import com.mware.core.model.Description;
import com.mware.core.model.Name;
import com.mware.web.WebApp;
import com.mware.web.WebAppPlugin;
import com.mware.web.framework.Handler;

import javax.servlet.ServletContext;

@Name("Element Context Menu")
@Description("Add options to element right click menus")
public class ContextMenuWebAppPlugin implements WebAppPlugin {

    public void init(WebApp app, ServletContext servletContext, Handler authenticationHandler) {
        app.registerJavaScript("/com/mware/examples/context_menu/plugin.js", true);
        app.registerResourceBundle("/com/mware/examples/context_menu/messages.properties");
        app.registerLess("/com/mware/examples/context_menu/style.less");
    }

}
