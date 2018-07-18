package com.mware.examples.graph_layout;

import com.mware.core.model.Description;
import com.mware.core.model.Name;
import com.mware.web.WebApp;
import com.mware.web.WebAppPlugin;
import com.mware.web.framework.Handler;

import javax.servlet.ServletContext;

@Name("Graph Layout")
@Description("Add new cytoscape layouts to graph menu")
public class GraphLayoutWebAppPlugin implements WebAppPlugin {

    public void init(WebApp app, ServletContext servletContext, Handler authenticationHandler) {
        app.registerJavaScript("/com/mware/examples/graph_layout/plugin.js", true);
        app.registerResourceBundle("/com/mware/examples/graph_layout/messages.properties");
    }

}
