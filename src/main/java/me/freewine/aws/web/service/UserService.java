package me.freewine.aws.web.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.freewine.aws.web.entity.User;
import me.freewine.aws.web.mapper.UserMapper;

@Service
public class UserService {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserMapper userMapper;


    //
    public List<User> getAll() {
        int count = 0;
        List<User> users = userMapper.selectAll();
        return users;
    }

    public long insert(User user) {
        Long count = 0L;
        count = userMapper.insert(user);
        return count;
    }
}
