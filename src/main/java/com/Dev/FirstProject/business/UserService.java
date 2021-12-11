package com.Dev.FirstProject.business;

import com.Dev.FirstProject.Entities.User;
import com.Dev.FirstProject.Entities.dtos.GetUserDto;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void add(User user);
    void update(User user,int id);
    void delete(int id);
    //Optional<User> getUserById(int id);
    Optional<GetUserDto> getUserById(int id);
    List<GetUserDto> getAllUsers();
}
