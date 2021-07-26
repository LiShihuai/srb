package com.alibaba.mapper;

import com.alibaba.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import javax.annotation.Resource;
import java.util.List;

/**
 * @package mapper
 * @Description
 * @time 2021/7/26
 * @auth lishihuai
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {



    /**
     * 通用 mapper 不够用的时候  创建自定义 mapper 方法
     * @return
     */
    List<User> findUserByName(String name);

}
