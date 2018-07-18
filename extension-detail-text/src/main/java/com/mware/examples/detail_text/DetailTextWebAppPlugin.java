package com.mware.examples.detail_text;

import com.mware.core.model.Description;
import com.mware.core.model.Name;
import com.mware.web.WebApp;
import com.mware.web.WebAppPlugin;
import com.mware.web.framework.Handler;

import javax.servlet.ServletContext;

@Name("Detail Text")
@Description("Replace Extracted Text with custom component")
public class DetailTextWebAppPlugin implements WebAppPlugin {

    public void init(WebApp app, ServletContext servletContext, Handler authenticationHandler) {
        app.registerJavaScript("/com/mware/examples/detail_text/plugin.js", true);
        app.registerJavaScriptComponent("/com/mware/examples/detail_text/Example.jsx");
        app.registerResourceBundle("/com/mware/examples/detail_text/messages.properties");
    }

}
