package com.mware.examples.map_options;

import com.mware.core.model.Description;
import com.mware.core.model.Name;
import com.mware.web.WebApp;
import com.mware.web.WebAppPlugin;
import com.mware.web.framework.Handler;

import javax.servlet.ServletContext;

@Name("Map Options")
@Description("Add components to map options dropdown")
public class MapOptionsWebAppPlugin implements WebAppPlugin {

    public void init(WebApp app, ServletContext servletContext, Handler authenticationHandler) {
        app.registerJavaScript("/com/mware/examples/map_options/plugin.js", true);
        app.registerJavaScriptComponent("/com/mware/examples/map_options/CountryBorders.jsx");
        app.registerFile("/com/mware/examples/map_options/countries.geojson", "application/vnd.geo+json");
        app.registerResourceBundle("/com/mware/examples/map_options/messages.properties");
    }

}
