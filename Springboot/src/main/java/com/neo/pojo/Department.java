package com.neo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author : neo
 * @Date 2021/7/20 16:40
 * @Description : TODO
 */

//部门表
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private Integer id;
    private String depargmentName;
}
