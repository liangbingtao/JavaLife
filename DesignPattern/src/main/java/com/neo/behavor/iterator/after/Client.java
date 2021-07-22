package com.neo.behavor.iterator.after;

/**
 * @Author : neo
 * @Date 2021/3/28 16:29
 * @Description : 测试类
 */
public class Client {
    public static void main(String[] args) {
        //创建聚合对象
        AggregateImpl aggregate1 = new AggregateImpl<Student>();
        AggregateImpl aggregate2 = new AggregateImpl<Worker>();
        //添加元素
        aggregate1.add(new Student("张三", "001"));
        aggregate1.add(new Student("李四", "002"));
        aggregate2.add(new Worker("王五", 5000.23f));
        aggregate2.add(new Worker("赵六", 6000.56f));

        //1、获取迭代器对象
        Iterator iterator1 = aggregate1.getIterator();
        Iterator iterator2 = aggregate2.getIterator();
        //2、遍历
        while (iterator1.hasNext()) {
            Student student = (Student) iterator1.next();
            System.out.println(student.toString());
        }

        while (iterator2.hasNext()) {
            Worker worker = (Worker) iterator2.next();
            System.out.println(worker.toString());
        }

    }
}
