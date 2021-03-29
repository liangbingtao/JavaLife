package com.neo.structure.decorator02;

/**
 * @Author : neo
 * @Date 2021/3/25 9:33
 * @Description : TODO
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}
