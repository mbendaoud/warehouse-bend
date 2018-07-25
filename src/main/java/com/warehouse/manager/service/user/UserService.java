package com.warehouse.manager.service.user;

import com.warehouse.manager.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
