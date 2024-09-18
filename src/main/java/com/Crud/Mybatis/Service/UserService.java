package com.Crud.Mybatis.Service;

import com.Crud.Mybatis.Mapper.UserMapper;
import com.Crud.Mybatis.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public void createUser(User user){
        userMapper.instertUser(user);
    }

    public User getUserById(Long id){
        return userMapper.findUserById(id);
    }

    public List<User> findAllUser(){
        return userMapper.findAllUsers();
    }

    public void updateUser(User user){
        userMapper.updateUser(user);
    }

    public void deleteUser(Long id){
        userMapper.deleteUser(id);
    }

}
