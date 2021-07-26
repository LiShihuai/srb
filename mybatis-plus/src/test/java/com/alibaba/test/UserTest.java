package com.alibaba.test;

import com.alibaba.mapper.UserMapper;
import com.alibaba.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @package UserTest
 * @Description
 * @time 2021/7/26
 * @auth lishihuai
 */

@SpringBootTest
public class UserTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void findUserById(){
        User user = userMapper.selectById(1L);
        System.out.println(user.toString());
    }

}
