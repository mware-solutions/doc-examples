package com.mware.examples.authentication;

import com.google.inject.Inject;
import com.mware.core.model.Description;
import com.mware.core.model.Name;
import com.mware.web.AuthenticationHandler;
import com.mware.web.WebApp;
import com.mware.web.WebAppPlugin;
import com.mware.web.framework.Handler;

import javax.servlet.ServletContext;

@Name("Example BigConnect Authentication Plugin")
@Description("Registers an authentication plugin which demonstrates user/password login.")
public class ExampleAuthenticationPlugin implements WebAppPlugin {
    private final Login login;

    @Inject
    public ExampleAuthenticationPlugin(Login login) {
        this.login = login;
    }

    public void init(WebApp app, ServletContext servletContext, Handler authenticationHandler) {
        app.registerBeforeAuthenticationJavaScript("/com/mware/examples/authentication/plugin.js");
        app.registerJavaScript("/com/mware/examples/authentication/authentication.js", false);
        app.registerJavaScriptTemplate("/com/mware/examples/authentication/login.hbs");
        app.registerCss("/com/mware/examples/authentication/login.css");
        app.registerResourceBundle("/com/mware/examples/authentication/messages.properties");

        app.post(AuthenticationHandler.LOGIN_PATH, login);
    }
}