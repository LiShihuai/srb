package com.alibaba.test;

import com.alibaba.mapper.UserMapper;
import com.alibaba.pojo.User;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * @package UserTest
 * @Description
 * @time 2021/7/26
 * @auth lishihuai
 */

@SpringBootTest
public class UserTest {

    //    @Autowired
    @Resource
    private UserMapper userMapper;

    @Test
    public void findUserById(){
        User user = userMapper.selectById(1L);
        System.out.println(user.toString());
    }


    /**
     * 自定义 mapper 方法
     */
    @Test
    public void findUserByName() {
        List<User> userList = userMapper.findUserByName("admin");
        for (User user : userList) {
            System.out.println(user);
        }
    }




    @Test
    public void insertUser(){
        User user = new User();
        user.setName("admin");
        user.setAge(23);
        user.setEmail("348589428@qq.com");
        user.setId(6L);
        userMapper.insert(user);
    }


    @Test
    public void updateUserById(){
        User user = new User();
        user.setEmail("18722928256@139.com");
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("id", 5L);
        userMapper.update(user, queryWrapper);
    }

    @Test
    public void deleteUserById(){
        userMapper.deleteBatchIds(Arrays.asList(1, 2, 3));
    }
}
