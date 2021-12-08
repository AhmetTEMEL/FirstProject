package com.Dev.FirstProject.dataAccess;

import com.Dev.FirstProject.Entities.User;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class HibernateUserDao implements UserDao{

    private EntityManager entityManager;

    @Autowired
    public HibernateUserDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<User> getListOfUsers() {
        Session session = entityManager.unwrap(Session.class);
        List<User> users = session.createQuery("from User",User.class).getResultList();
        return users;
    }

    @Override
    public void add(User user) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(user);
    }

    @Override
    public void update(User user) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(user);
    }

    @Override
    public void delete(User user) {
        Session session = entityManager.unwrap(Session.class);
        User userToDelete = session.get(User.class,user.getId());
        session.delete(userToDelete);
    }

    @Override
    public User getUserById(int id) {
        Session session = entityManager.unwrap(Session.class);
        User user = session.get(User.class,id);
        return user;
    }
}
