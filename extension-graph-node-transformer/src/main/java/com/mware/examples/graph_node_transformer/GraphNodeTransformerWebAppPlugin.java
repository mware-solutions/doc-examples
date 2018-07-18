package com.mware.examples.graph_node_transformer;

import com.mware.core.model.Description;
import com.mware.core.model.Name;
import com.mware.web.WebApp;
import com.mware.web.WebAppPlugin;
import com.mware.web.framework.Handler;

import javax.servlet.ServletContext;

@Name("Graph Node Transformer")
@Description("Allows extensions to adjust the data attribute of cytoscape nodes.")
public class GraphNodeTransformerWebAppPlugin implements WebAppPlugin {

    public void init(WebApp app, ServletContext servletContext, Handler authenticationHandler) {
        app.registerJavaScript("/com/mware/examples/graph_node_transformer/plugin.js", true);
    }

}
