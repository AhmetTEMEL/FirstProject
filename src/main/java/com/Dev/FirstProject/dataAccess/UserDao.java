package com.Dev.FirstProject.dataAccess;

import com.Dev.FirstProject.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {

}
