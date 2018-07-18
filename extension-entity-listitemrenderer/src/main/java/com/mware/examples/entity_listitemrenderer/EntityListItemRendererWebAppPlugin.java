package com.mware.examples.entity_listitemrenderer;

import com.mware.core.model.Description;
import com.mware.core.model.Name;
import com.mware.web.WebApp;
import com.mware.web.WebAppPlugin;
import com.mware.web.framework.Handler;

import javax.servlet.ServletContext;

@Name("Entity List Item Renderer")
@Description("Implement custom implementations for rendering items into element lists")
public class EntityListItemRendererWebAppPlugin implements WebAppPlugin {

    public void init(WebApp app, ServletContext servletContext, Handler authenticationHandler) {
        app.registerJavaScript("/com/mware/examples/entity_listitemrenderer/plugin.js", true);
        app.registerJavaScript("/com/mware/examples/entity_listitemrenderer/component.js", false);
        app.registerJavaScriptTemplate("/com/mware/examples/entity_listitemrenderer/template.hbs");
        app.registerResourceBundle("/com/mware/examples/entity_listitemrenderer/messages.properties");
        app.registerLess("/com/mware/examples/entity_listitemrenderer/style.less");
    }

}
