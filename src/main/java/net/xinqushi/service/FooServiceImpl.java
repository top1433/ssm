package net.xinqushi.service;

import net.xinqushi.entity.User;
import net.xinqushi.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FooServiceImpl implements FooService {


    @Autowired
    private UserMapper userMapper;


    public User doSomeBusinessStuff(int userId) {
        return userMapper.getUser(userId);
    }
}
