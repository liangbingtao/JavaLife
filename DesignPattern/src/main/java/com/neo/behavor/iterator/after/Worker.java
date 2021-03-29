package com.neo.behavor.iterator.after;

/**
 * @Author : neo
 * @Date 2021/3/28 16:35
 * @Description : 工人类
 */
public class Worker {
    private String name;
    private float salary;

    public Worker(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "worker{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
