package com.mware.examples.graph_export;

import com.mware.core.model.Description;
import com.mware.core.model.Name;
import com.mware.web.WebApp;
import com.mware.web.WebAppPlugin;
import com.mware.web.framework.Handler;

import javax.servlet.ServletContext;

@Name("Graph Export")
@Description("Add menu options to export graph / workspace")
public class GraphExportWebAppPlugin implements WebAppPlugin {
    public void init(WebApp app, ServletContext servletContext, Handler authenticationHandler) {
        app.registerJavaScript("/com/mware/examples/graph_export/plugin.js", true);
        app.registerJavaScript("/com/mware/examples/graph_export/configuration.js", false);
        app.registerJavaScriptTemplate("/com/mware/examples/graph_export/template.hbs");
        app.registerLess("/com/mware/examples/graph_export/style.less");
        app.registerResourceBundle("/com/mware/examples/graph_export/messages.properties");
    }

}
