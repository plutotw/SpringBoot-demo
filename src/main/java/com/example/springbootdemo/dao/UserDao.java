package com.example.springbootdemo.dao;

import com.example.springbootdemo.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserDao {
    @Select(value = "SELECT * FROM USER")
    List<User> getUserList();

    @Select(value = "SELECT * FROM USER WHERE username=#{username}")
    User getUserByUsername(String username);

    @Insert(value = "INSERT INTO USER VALUES(#{uuid},#{username},#{password},#{registrationtime})")
    int addUser(User user);

    @Update(value = "UPDATE USER SET password = #{password} WHERE username = #{username}")
    int updatePwd(User user);
}
