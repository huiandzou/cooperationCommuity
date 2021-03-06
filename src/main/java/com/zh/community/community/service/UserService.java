package com.zh.community.community.service;

import com.zh.community.community.mapper.UserMapper;
import com.zh.community.community.model.User;
import com.zh.community.community.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * created by ${host}
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public void createOrUpdate(User user) {
        // 首先先查找数据库是否存在这条数据
        UserExample userExample = new UserExample();
        userExample.createCriteria().andAccountIdEqualTo(user.getAccountId());

        List<User> users = userMapper.selectByExample(userExample);
        if (users.size() == 0) {
            // 然后就新增
            user.setGmtCreate(System.currentTimeMillis());
            userMapper.insert(user);
        } else {
            //修改
            User oldUser = users.get(0);
            User newUser = new User();
            newUser.setGmtModified(System.currentTimeMillis());
            newUser.setAvatarUrl(user.getAvatarUrl());
            newUser.setName(user.getName());
            newUser.setToken(user.getToken());
            UserExample userExampleUpdate = new UserExample();
            userExampleUpdate.createCriteria().andIdEqualTo(oldUser.getId());
            userMapper.updateByExampleSelective(newUser, userExampleUpdate);
        }
    }

    public User queryUserById(Long commentator) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andIdEqualTo(commentator.intValue());
        List<User> users = userMapper.selectByExample(userExample);
        return users.get(0);
    }

}
