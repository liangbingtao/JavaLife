package com.neo.structure.decorator02;

/**
 * @Author : neo
 * @Date 2021/3/25 9:35
 * @Description : TODO
 */
public class RedShapeDecorator extends ShapeDecorator{


    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color : Red");
    }
}
