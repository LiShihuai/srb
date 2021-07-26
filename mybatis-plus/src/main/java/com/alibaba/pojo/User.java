package com.alibaba.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import static com.baomidou.mybatisplus.annotation.IdType.AUTO;

/**
 * @package User
 * @Description
 * @time 2021/7/26
 * @auth lishihuai
 */

@Data
@TableName("user")
public class User {
    @TableId(value = "id", type = AUTO)
    private Long id;

    @TableField("name")
    private String name;

    @TableField("age")
    private Integer age;

    @TableField("email")
    private String email;

}
