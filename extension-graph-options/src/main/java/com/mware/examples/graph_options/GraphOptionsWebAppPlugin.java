package com.mware.examples.graph_options;

import com.mware.core.model.Description;
import com.mware.core.model.Name;
import com.mware.web.WebApp;
import com.mware.web.WebAppPlugin;
import com.mware.web.framework.Handler;

import javax.servlet.ServletContext;

@Name("Graph Options")
@Description("Add components to graph options dropdown")
public class GraphOptionsWebAppPlugin implements WebAppPlugin {

    public void init(WebApp app, ServletContext servletContext, Handler authenticationHandler) {
        app.registerJavaScript("/com/mware/examples/graph_options/plugin.js", true);
        app.registerJavaScriptComponent("/com/mware/examples/graph_options/React.jsx");
        app.registerResourceBundle("/com/mware/examples/graph_options/messages.properties");
    }

}
