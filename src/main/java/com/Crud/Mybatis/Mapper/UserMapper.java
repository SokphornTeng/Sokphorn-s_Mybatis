package com.Crud.Mybatis.Mapper;

import com.Crud.Mybatis.Model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Insert("INSERT INTO users(name, email) VALUES(#{name}, #{email})")
    void instertUser(User user);

    @Select("SELECT * FROM users WHERE id = #{id}")
    User findUserById(Long id);

    @Select("SELECT  * FROM users")
    List<User> findAllUsers();

    @Update("UPDATE users SET name = #{name}, email = #{email} WHERE id = #{id}")
    void updateUser(User user);

    @Delete("DELETE FROM users WHERE id = #{id}")
    void deleteUser(Long id);

}
