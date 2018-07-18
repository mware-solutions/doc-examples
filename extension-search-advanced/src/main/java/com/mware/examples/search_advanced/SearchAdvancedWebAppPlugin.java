package com.mware.examples.search_advanced;

import com.mware.core.model.Description;
import com.mware.core.model.Name;
import com.mware.web.AuthenticationHandler;
import com.mware.web.BcCsrfHandler;
import com.mware.web.WebApp;
import com.mware.web.WebAppPlugin;
import com.mware.web.framework.Handler;
import com.mware.web.privilegeFilters.ReadPrivilegeFilter;
import com.mware.web.routes.element.ElementSearch;

import javax.servlet.ServletContext;

@Name("Search Advanced")
@Description("Add alternate search interfaces")
public class SearchAdvancedWebAppPlugin implements WebAppPlugin {

    public void init(WebApp app, ServletContext servletContext, Handler authenticationHandler) {
        AuthenticationHandler authenticatorInstance = new AuthenticationHandler();
        Class<? extends Handler> authenticator = AuthenticationHandler.class;
        Class<? extends Handler> csrfProtector = BcCsrfHandler.class;

        app.registerJavaScript("/com/mware/examples/search_advanced/plugin.js", true);
        app.registerJavaScriptComponent("/com/mware/examples/search_advanced/React.jsx");
        app.registerJavaScript("/com/mware/examples/search_advanced/flight.js", false);
        app.registerJavaScriptTemplate("/com/mware/examples/search_advanced/template.hbs");
        app.registerLess("/com/mware/examples/search_advanced/style.less");
        app.registerWebWorkerJavaScript("/com/mware/examples/search_advanced/worker.js");
        app.registerResourceBundle("/com/mware/examples/search_advanced/messages.properties");

        //searches are saved by url
        app.get("/com.mware/examples/search_advanced/flight/search", authenticator, csrfProtector, ReadPrivilegeFilter.class, ElementSearch.class);
        app.post("/com.mware/examples/search_advanced/flight/search", authenticator, csrfProtector, ReadPrivilegeFilter.class, ElementSearch.class);
        app.get("/com.mware/examples/search_advanced/react/search", authenticator, csrfProtector, ReadPrivilegeFilter.class, ElementSearch.class);
        app.post("/com.mware/examples/search_advanced/react/search", authenticator, csrfProtector, ReadPrivilegeFilter.class, ElementSearch.class);
    }

}
