package com.mware.examples.graph_edge_class;

import com.mware.core.model.Description;
import com.mware.core.model.Name;
import com.mware.web.WebApp;
import com.mware.web.WebAppPlugin;
import com.mware.web.framework.Handler;

import javax.servlet.ServletContext;

@Name("Graph Edge Class")
@Description("Function that can change cytoscape classes of edges")
public class GraphEdgeClassWebAppPlugin implements WebAppPlugin {

    public void init(WebApp app, ServletContext servletContext, Handler authenticationHandler) {
        app.registerJavaScript("/com/mware/examples/graph_edge_class/plugin.js", true);
    }

}
