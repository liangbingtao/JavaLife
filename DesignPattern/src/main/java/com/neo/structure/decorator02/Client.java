package com.neo.structure.decorator02;

/**
 * @Author : neo
 * @Date 2021/3/25 9:38
 * @Description : TODO
 */
public class Client {
    public static void main(String[] args) {
        Circle circle = new Circle();
        RedShapeDecorator redCircle = new RedShapeDecorator(circle);
        RedShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("=============================");
        System.out.println("Circle with red border");
        redCircle.draw();

        System.out.println("===============================");
        System.out.println("Rectangle of red border");
        redRectangle.draw();
    }
}
