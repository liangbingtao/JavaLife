package com.neo.behavor.interpreter;

import com.neo.behavor.template.AbstractClass;

/**
 * @Author : neo
 * @Date 2021/3/29 13:02
 * @Description : 终结符表达式
 */
public class Value extends AbstractExpression {
    private int value;

    public Value(int value) {
        this.value = value;
    }

    public int interpret(Context context) {
        return value;
    }

    @Override
    public String toString() {
        return "Value{" +
                "value=" + value +
                '}';
    }
}
