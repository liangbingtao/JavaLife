package com.neo.creator.prototype.demo05;

/**
 * @Author : neo
 * @Date 2021/3/29 15:22
 * @Description : TODO
 */
public class Teacher implements Cloneable {
    private String name;
    private Student student;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", student=" + student +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Teacher teacher = (Teacher) super.clone();
        teacher.setStudent((Student) teacher.getStudent().clone());
        return teacher;
    }
}
