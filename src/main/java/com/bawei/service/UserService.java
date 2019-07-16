package com.bawei.service;

import com.bawei.mapper.UserMapper;
import com.bawei.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getUsers() {
        return userMapper.selectUsers();
    }

}
