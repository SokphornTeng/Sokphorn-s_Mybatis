package com.Crud.Mybatis.Controller;

import com.Crud.Mybatis.Model.User;
import com.Crud.Mybatis.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mybatis")
public class Controller {

    @Autowired
    private UserService userService;

    @PostMapping
    public void createUser(User user){
        userService.createUser(user);
    }
    @PutMapping
    public void updateUser(User user){
        userService.updateUser(user);
    }
    @GetMapping("/{id}")
    public ResponseEntity<User> findUserById(@PathVariable("id") Long id){
       return ResponseEntity.ok(userService.getUserById(id));
    }
    @GetMapping
    public List<User> listing(){
       return userService.findAllUser();
    }
    @DeleteMapping
    public void deleteUser(@PathVariable("id") Long id){
        userService.deleteUser(id);
    }

}

