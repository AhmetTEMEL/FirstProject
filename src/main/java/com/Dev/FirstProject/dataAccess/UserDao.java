package com.Dev.FirstProject.dataAccess;

import com.Dev.FirstProject.Entities.User;
import com.Dev.FirstProject.Entities.dtos.GetUserDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UserDao extends JpaRepository<User,Integer> {

    @Query("Select new com.Dev.FirstProject.Entities.dtos.GetUserDto" +
            " (u.id,u.name,u.surname,u.registerDate,u.email) From User u")
    List<GetUserDto> getAllUsers();

    @Query("Select new com.Dev.FirstProject.Entities.dtos.GetUserDto" +
            " (u.id,u.name,u.surname,u.registerDate,u.email) From User u" +
            " Where u.id=:id")
    Optional<GetUserDto> findById(int id);

}
