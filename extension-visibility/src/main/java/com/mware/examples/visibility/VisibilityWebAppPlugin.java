package com.mware.examples.visibility;

import com.mware.core.model.Description;
import com.mware.core.model.Name;
import com.mware.web.WebApp;
import com.mware.web.WebAppPlugin;
import com.mware.web.framework.Handler;

import javax.servlet.ServletContext;

@Name("Visibility Components")
@Description("Replace visibility components")
public class VisibilityWebAppPlugin implements WebAppPlugin {

    public void init(WebApp app, ServletContext servletContext, Handler authenticationHandler) {
        app.registerJavaScript("/com/mware/examples/visibility/plugin.js", true);

        app.registerJavaScriptComponent("/com/mware/examples/visibility/ExampleEditor.jsx");
        app.registerJavaScriptComponent("/com/mware/examples/visibility/ExampleViewer.jsx");
    }

}
