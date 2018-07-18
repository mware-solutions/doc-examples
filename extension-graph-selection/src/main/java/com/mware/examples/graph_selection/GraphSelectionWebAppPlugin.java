package com.mware.examples.graph_selection;

import com.mware.core.model.Description;
import com.mware.core.model.Name;
import com.mware.web.WebApp;
import com.mware.web.WebAppPlugin;
import com.mware.web.framework.Handler;

import javax.servlet.ServletContext;

@Name("Graph Selection")
@Description("Add custom graph selection menu items")
public class GraphSelectionWebAppPlugin implements WebAppPlugin {

    public void init(WebApp app, ServletContext servletContext, Handler authenticationHandler) {
        app.registerJavaScript("/com/mware/examples/graph_selection/plugin.js", true);
        app.registerResourceBundle("/com/mware/examples/graph_selection/messages.properties");
    }

}
