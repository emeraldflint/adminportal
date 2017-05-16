package com.adminportal.repository;

import com.adminportal.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.logging.LoggingMXBean;

/**
 * Created by z-dus on 17.05.2017.
 */
public interface UserRepository extends CrudRepository<User, Long> {
        User findByUsername(String username);
}
