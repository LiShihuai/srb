package com.alibaba.mapper;

import com.alibaba.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @package mapper
 * @Description
 * @time 2021/7/26
 * @auth lishihuai
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
