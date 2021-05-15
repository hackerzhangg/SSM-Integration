package com.bigjava18.ssm.service;

import com.bigjava18.ssm.mapper.UserMapper;
import com.bigjava18.ssm.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author zgp
 * @Since 2021 -05 -14 18 :05
 * @Description
 */
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public List<User> getAllUser() {
        List<User> userList=userMapper.getAllUser();
        return  userList;
    }
}
