package com.adminportal.service.impl;

import com.adminportal.domain.User;
import com.adminportal.repository.RoleRepository;
import com.adminportal.repository.UserRepository;
import com.adminportal.security.UserRole;
import com.adminportal.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by z-dus on 09.05.2017.
 */
@Service
public class UserServiceImpl implements UserService{

    private static final Logger LOG = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception {
        User localUser = userRepository.findByUsername(user.getUsername());

        if(localUser != null){
            //throw new Exception("user already exist. Nothing will be done");
            LOG.info("user {} already exist. Nothing will be done", user.getUsername());
        }else {
            for (UserRole ur : userRoles){
                roleRepository.save(ur.getRole());
            }
        }

            user.getUserRoles().addAll(userRoles);
        localUser = userRepository.save(user);

        return localUser;
    }

}
