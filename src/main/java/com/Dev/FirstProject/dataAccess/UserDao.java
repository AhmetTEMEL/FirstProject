package com.Dev.FirstProject.dataAccess;

import com.Dev.FirstProject.Entities.User;

import java.util.List;

public interface UserDao {

    List<User> getListOfUsers();
    void add(User user);
    void update(User user);
    void delete(User user);
    User getUserById(int id);

}
