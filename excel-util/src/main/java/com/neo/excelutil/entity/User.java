package com.neo.excelutil.entity;


import com.neo.excelutil.anno.EnableExport;
import com.neo.excelutil.anno.EnableExportField;
import com.neo.excelutil.anno.ImportIndex;

import java.text.CollationElementIterator;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2021-07-30 18:39:45
 */
@EnableExport(fileName = "用户表")
public class User {

    @ImportIndex(index = 0)
    @EnableExportField(colName = "id")
    private Integer id;

    @ImportIndex(index = 1)
    @EnableExportField(colName = "name")
    private String name;

    @ImportIndex(index = 2)
    @EnableExportField(colName = "pwd")
    private String pwd;

    @ImportIndex(index = 3)
    @EnableExportField(colName = "perms")
    private String perms;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPerms() {
        return perms;
    }

    public void setPerms(String perms) {
        this.perms = perms;
    }

}