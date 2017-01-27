package com.loxmeetsbagel.api.security;

import com.loxmeetsbagel.api.entity.User;

import java.util.Optional;

public interface UserService {
    public Optional<User> getByUsername(String username);
}
