package com.neo.structure.flyweight;

import com.sun.xml.internal.ws.wsdl.parser.MemberSubmissionAddressingWSDLParserExtension;
import sun.security.jca.GetInstance;

import java.util.HashMap;

/**
 * @Author : neo
 * @Date 2021/3/26 15:23
 * @Description : 享元工厂类
 */
public class BoxFactory {

    private static HashMap<String, AbstractBox> map;

    //只有一个享元工厂类，设置为单例模式，私有构造方法
    private BoxFactory() {
        map = new HashMap<String, AbstractBox>();
        AbstractBox iBox = new IBox();
        AbstractBox LBox = new LBox();
        AbstractBox OBox = new OBox();
        map.put("I", iBox);
        map.put("L", LBox);
        map.put("O", OBox);
    }

    private static BoxFactory instance = new BoxFactory();

    //单例模式对外提供的获取工厂对象的方法
    public static BoxFactory getInstance() {
        return instance;
    }

    public AbstractBox getBox(String key) {
        return map.get(key);
    }


}
