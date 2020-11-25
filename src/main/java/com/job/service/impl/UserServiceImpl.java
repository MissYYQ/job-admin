package com.job.service.impl;

import com.job.mapper.UserMapper;
import com.job.pojo.User;
import com.job.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void userLogin(User user) {
        String openId = user.getOpenid();
        User user1 = userMapper.selectByOpenId(openId);
        if (user1 == null ) {
            userMapper.insert(user);
        }
    }
}
