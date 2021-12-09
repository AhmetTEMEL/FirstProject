package com.Dev.FirstProject.business;

import com.Dev.FirstProject.Entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getListOfUsers();
    void add(User user);
    void update(User user,int id);
    void delete(int id);
    Optional<User> getUserById(int id);
}
