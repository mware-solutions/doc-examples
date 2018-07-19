package com.mware.web.privilegeFilters;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.mware.core.model.user.PrivilegeRepository;
import com.mware.core.model.user.UserRepository;
import com.mware.web.clientapi.model.Privilege;

@Singleton
public class ReadPrivilegeFilter extends PrivilegeFilter {
    @Inject
    protected ReadPrivilegeFilter(UserRepository userRepository, PrivilegeRepository privilegeRepository) {
        super(Privilege.newSet(Privilege.READ), userRepository, privilegeRepository);
    }
}
