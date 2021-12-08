package com.Dev.FirstProject.api;

import com.Dev.FirstProject.Entities.User;
import com.Dev.FirstProject.business.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UsersContoller {
    private UserService userService;

    @Autowired
    public UsersContoller(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> get(){
        return userService.getListOfUsers();
    }

    @PostMapping("/add")
    public void add(@RequestBody User user){
        userService.add(user);
    }

    @PostMapping("/update")
    public void update(@RequestBody User user){
        userService.update(user);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody User user){
        userService.delete(user);
    }
    @GetMapping("/users/{id}")
    public void getById(@PathVariable int id){
        userService.getUserById(id);
    }
}
