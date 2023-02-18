package com.security.userservice.service;

import com.security.userservice.domain.Role;
import com.security.userservice.domain.User;
import com.security.userservice.repository.UserRepository;

import java.util.List;

public class UserServiceImplementation implements  UserService{

    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return null;
    }

    @Override
    public Role saveRole(Role role) {
        return null;
    }

    @Override
    public void addRoleToUser(String username, String rolename) {

    }

    @Override
    public User getUser(String username) {
        return null;
    }

    @Override
    public List<User> getUsers() {
        return null;
    }
}
