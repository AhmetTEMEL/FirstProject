package com.Dev.FirstProject.api;

import com.Dev.FirstProject.Entities.User;
import com.Dev.FirstProject.Entities.dtos.GetUserDto;
import com.Dev.FirstProject.business.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UsersContoller {
    private UserService userService;

    @Autowired
    public UsersContoller(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getall")
    public List<GetUserDto> get(){
        return userService.getAllUsers();
    }

    @PostMapping("/add")
    public void add(@RequestBody User user){
        userService.add(user);
    }

    @PutMapping("/update/{id}")
    public void update(@RequestBody User user,@PathVariable int id){
        userService.update(user,id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        this.userService.delete(id);
    }
    @GetMapping("/get/{id}")
    public Optional<GetUserDto> getById(@PathVariable int id){
       return userService.getUserById(id);
    }
}
