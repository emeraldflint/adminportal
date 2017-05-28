package com.adminportal.service;

import com.adminportal.domain.User;
import com.adminportal.security.UserRole;

import java.util.Set;

/**
 * Created by z-dus on 09.05.2017.
 */
public interface UserService {

    User createUser(User user, Set<UserRole> userRoles) throws Exception;

}
