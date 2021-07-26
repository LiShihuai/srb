package com.alibaba.service;

import com.alibaba.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @package UserService
 * @Description
 * @time 2021/7/26
 * @auth lishihuai
 * 通用 接口
 */
public interface UserService extends IService<User> {

    /**
     * 自定义 接口
     * @param name
     * @return
     */
    List<User> listAllByName(String name);
}
