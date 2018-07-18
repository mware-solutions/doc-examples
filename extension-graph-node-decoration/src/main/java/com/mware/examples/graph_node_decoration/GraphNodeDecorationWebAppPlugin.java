package com.mware.examples.graph_node_decoration;

import com.mware.core.model.Description;
import com.mware.core.model.Name;
import com.mware.web.WebApp;
import com.mware.web.WebAppPlugin;
import com.mware.web.framework.Handler;

import javax.servlet.ServletContext;

@Name("Graph Decoration")
@Description("Add decoration text/images around graph nodes")
public class GraphNodeDecorationWebAppPlugin implements WebAppPlugin {

    public void init(WebApp app, ServletContext servletContext, Handler authenticationHandler) {
        app.registerJavaScript("/com/mware/examples/graph_node_decoration/plugin.js", true);
        app.registerJavaScript("/com/mware/examples/graph_node_decoration/popover.js", false);
        app.registerJavaScriptTemplate("/com/mware/examples/graph_node_decoration/template.hbs");
    }

}
