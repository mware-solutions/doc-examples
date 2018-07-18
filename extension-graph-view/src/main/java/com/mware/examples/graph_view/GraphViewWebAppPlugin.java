package com.mware.examples.graph_view;

import com.mware.core.model.Description;
import com.mware.core.model.Name;
import com.mware.web.WebApp;
import com.mware.web.WebAppPlugin;
import com.mware.web.framework.Handler;

import javax.servlet.ServletContext;

@Name("Graph View")
@Description("Add components to graph container")
public class GraphViewWebAppPlugin implements WebAppPlugin {

    public void init(WebApp app, ServletContext servletContext, Handler authenticationHandler) {
        app.registerJavaScript("/com/mware/examples/graph_view/plugin.js", true);
        app.registerJavaScriptComponent("/com/mware/examples/graph_view/View.jsx");
        app.registerLess("/com/mware/examples/graph_view/style.less");
        app.registerResourceBundle("/com/mware/examples/graph_view/messages.properties");
    }

}
