package com.neo.pojo;

import lombok.Data;

import javax.crypto.EncryptedPrivateKeyInfo;

/**
 * @Description Author neo
 * Date 2021/3/5 15:40
 */
@Data
public class User {
    private int id;
    private String name;
    private String pwd;

}
