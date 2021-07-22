package com.neo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author : neo
 * @Date 2021/7/22 16:20
 * @Description : TODO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer id;
    private String name;
    private String pwd;
    private String perms;

}
