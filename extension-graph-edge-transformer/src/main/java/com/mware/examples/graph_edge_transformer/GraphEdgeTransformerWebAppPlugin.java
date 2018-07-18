package com.mware.examples.graph_edge_transformer;

import com.mware.core.model.Description;
import com.mware.core.model.Name;
import com.mware.web.WebApp;
import com.mware.web.WebAppPlugin;
import com.mware.web.framework.Handler;

import javax.servlet.ServletContext;

@Name("Graph Edge Transformer")
@Description("Allows extensions to adjust the data attribute of cytoscape edges.")
public class GraphEdgeTransformerWebAppPlugin implements WebAppPlugin {

    public void init(WebApp app, ServletContext servletContext, Handler authenticationHandler) {
        app.registerJavaScript("/com/mware/examples/graph_edge_transformer/plugin.js", true);
    }

}
