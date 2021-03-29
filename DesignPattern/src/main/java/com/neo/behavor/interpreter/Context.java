package com.neo.behavor.interpreter;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author : neo
 * @Date 2021/3/29 13:02
 * @Description : 环境类
 */
public class Context {

    private Map<Variable, Integer> map = new HashMap<Variable, Integer>();

    public void assign(Variable variable, Integer value) {
        map.put(variable, value);
    }

    public int getValue(Variable variable) {
        Integer value = map.get(variable);
        return value;
    }
}
