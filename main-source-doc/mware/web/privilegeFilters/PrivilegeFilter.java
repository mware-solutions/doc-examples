package com.mware.web.privilegeFilters;

import com.mware.web.framework.HandlerChain;
import com.mware.web.framework.RequestResponseHandler;
import com.mware.core.exception.BcAccessDeniedException;
import com.mware.core.model.user.PrivilegeRepository;
import com.mware.core.model.user.UserRepository;
import com.mware.core.user.User;
import com.mware.web.clientapi.model.Privilege;
import com.mware.web.parameterProviders.BcBaseParameterProvider;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Set;

public class PrivilegeFilter implements RequestResponseHandler {
    private final Set<String> requiredPrivileges;
    private UserRepository userRepository;
    private final PrivilegeRepository privilegeRepository;

    protected PrivilegeFilter(
            Set<String> requiredPrivileges,
            UserRepository userRepository,
            PrivilegeRepository privilegeRepository
    ) {
        this.requiredPrivileges = requiredPrivileges;
        this.userRepository = userRepository;
        this.privilegeRepository = privilegeRepository;
    }

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, HandlerChain chain) throws Exception {
        User user = BcBaseParameterProvider.getUser(request, userRepository);
        if (!privilegeRepository.hasAllPrivileges(user, requiredPrivileges)) {
            throw new BcAccessDeniedException(
                    "You do not have the required privileges: " + Privilege.toString(requiredPrivileges),
                    user,
                    "privileges"
            );
        }
        chain.next(request, response);
    }
}
