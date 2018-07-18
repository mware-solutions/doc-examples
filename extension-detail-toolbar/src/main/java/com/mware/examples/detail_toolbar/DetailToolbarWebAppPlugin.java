package com.mware.examples.detail_toolbar;

import com.mware.core.model.Description;
import com.mware.core.model.Name;
import com.mware.web.WebApp;
import com.mware.web.WebAppPlugin;
import com.mware.web.framework.Handler;

import javax.servlet.ServletContext;

@Name("Detail Toolbar Example")
@Description("Registers a detail toolbar plugin that launches a Google search for the displayed person name.")
public class DetailToolbarWebAppPlugin implements WebAppPlugin {

    public void init(WebApp app, ServletContext servletContext, Handler authenticationHandler) {
        app.registerJavaScript("/com/mware/examples/detail_toolbar/plugin.js", true);
        app.registerResourceBundle("/com/mware/examples/detail_toolbar/messages.properties");
    }

}
