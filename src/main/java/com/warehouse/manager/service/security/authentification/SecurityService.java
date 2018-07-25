package com.warehouse.manager.service.security.authentification;

public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}
