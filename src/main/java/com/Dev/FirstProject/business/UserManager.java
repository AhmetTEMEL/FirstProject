package com.Dev.FirstProject.business;

import com.Dev.FirstProject.Entities.User;
import com.Dev.FirstProject.dataAccess.HibernateUserDao;
import com.Dev.FirstProject.dataAccess.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserManager implements UserService{

    private UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public List<User> getListOfUsers() {
        return userDao.getListOfUsers();
    }

    @Override
    @Transactional
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    @Transactional
    public void update(User user) {
        userDao.update(user);

    }

    @Override
    @Transactional
    public void delete(User user) {
        userDao.delete(user);

    }

    @Override
    @Transactional
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }
}
