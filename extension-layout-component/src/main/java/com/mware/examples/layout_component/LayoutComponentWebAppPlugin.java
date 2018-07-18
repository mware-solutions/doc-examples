package com.mware.examples.layout_component;

import com.mware.core.model.Description;
import com.mware.core.model.Name;
import com.mware.web.WebApp;
import com.mware.web.WebAppPlugin;
import com.mware.web.framework.Handler;

import javax.servlet.ServletContext;

@Name("Layout Component")
@Description("Define layout of an element based")
public class LayoutComponentWebAppPlugin implements WebAppPlugin {

    public void init(WebApp app, ServletContext servletContext, Handler authenticationHandler) {
        app.registerJavaScript("/com/mware/examples/layout_component/plugin.js", true);
        app.registerJavaScript("/com/mware/examples/layout_component/popupBody.js", false);
        app.registerLess("/com/mware/examples/layout_component/style.less");
        app.registerResourceBundle("/com/mware/examples/layout_component/messages.properties");
    }

}
