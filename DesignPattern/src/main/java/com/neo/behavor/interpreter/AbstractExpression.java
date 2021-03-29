package com.neo.behavor.interpreter;

/**
 * @Author : neo
 * @Date 2021/3/29 12:57
 * @Description : 抽象角表达式色
 */
public abstract class AbstractExpression {
    public abstract int interpret(Context context);

}
