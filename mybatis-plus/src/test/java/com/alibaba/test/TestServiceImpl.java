package com.alibaba.test;

import com.alibaba.mapper.UserMapper;
import com.alibaba.pojo.User;
import com.alibaba.service.UserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * @package TestServiceImpl
 * @Description
 * @time 2021/7/26
 * @auth lishihuai
 */
@SpringBootTest
public class TestServiceImpl {

    @Autowired
    private UserService userService;

     @Autowired  // 用 Resource 注解 不会报红
    // @Autowired(required=false) // 设置它的 允许 Autowired 依赖为 null  也可以解决报红问题
    @Resource
    private UserMapper userMapper;


    @Test
    public void findUserByName() {
        List<User> userList = userMapper.findUserByName("admin");
        for (User user : userList) {
            System.out.println(user);
        }
    }


    @Test
    public void findUserAll(){
        long timeStart = System.currentTimeMillis();
        List<User> userList = userMapper.selectList(null);
        for (User user : userList) {
            System.out.println(user);
        }
        long timeStop = System.currentTimeMillis();
        System.out.println("用时:"+(timeStop-timeStart));

        timeStart = System.currentTimeMillis();
        userList = userService.getBaseMapper().selectList(null);
        for (User user : userList) {
            System.out.println(user);
        }
        timeStop = System.currentTimeMillis();
        System.out.println("用时:"+(timeStop-timeStart));
    }



    @Test
    public void deleteUser() {
        userService.removeById(4L);
    }


    @Test
    public void updateUser() {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("id", 8L);
        queryWrapper.eq("name", "jeak");

        User user = new User();
        user.setAge(28);

        userService.update(user, queryWrapper);

    }


    @Test
    public void saveUser() {
        User user = new User();
        user.setName("jeak");
        user.setAge(19);
        user.setEmail("88888@qq.com");
        userService.save(user);
    }


    @Test
    public void selectUser() {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("id", 5L);
        User user = userService.getOne(queryWrapper);
        System.out.println(user);

        user = userService.getById(6L);
        System.out.println(user);
    }
}
