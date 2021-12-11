package com.Dev.FirstProject.business;

import com.Dev.FirstProject.Entities.User;
import com.Dev.FirstProject.Entities.dtos.GetUserDto;
import com.Dev.FirstProject.dataAccess.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class UserManager implements UserService{

    private UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public void add(User user) {
        userDao.save(user);
    }

    @Override
    @Transactional
    public void update(User user,int id) {
        User userToUpdate = new User(id,user.getName(),user.getSurname(),
                user.getRegisterDate(),user.getPassword(),user.getEmail());
        userDao.save(userToUpdate);
    }

    @Override
    @Transactional
    public void delete(int id) {
        userDao.deleteById(id);
    }

    @Override
    public Optional<GetUserDto> getUserById(int id) {
        return this.userDao.findById(id);
    }

    @Override
    public List<GetUserDto> getAllUsers() {
        return this.userDao.getAllUsers();
    }
}
