package com.njh.springboot.usermanage.service.serviceImpl;

import com.njh.springboot.usermanage.dao.UserMapper;
import com.njh.springboot.usermanage.domain.User;
import com.njh.springboot.usermanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User getUser(String username) {
        //调用dao层
        return userMapper.selectUserByName(username);
    }
}
