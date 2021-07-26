package com.alibaba.service.impl;

import com.alibaba.mapper.UserMapper;
import com.alibaba.pojo.User;
import com.alibaba.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @package UserServiceImpl
 * @Description
 * @time 2021/7/26
 * @auth lishihuai
 * 通用 mapper
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public List<User> listAllByName(String name) {
        return baseMapper.findUserByName(name);
    }
}
