package com.neo.behavor.interpreter;

/**
 * @Author : neo
 * @Date 2021/3/29 13:09
 * @Description : 终结符表达式角色  变量表达式
 */
public class Variable extends AbstractExpression {

    private String name;

    public Variable(String name) {
        this.name = name;
    }

    public int interpret(Context context) {
        return context.getValue(this);
    }

    @Override
    public String toString() {
        return name;
    }
}
