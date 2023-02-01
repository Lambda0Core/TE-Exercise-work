package com.techelevator.funwithclass;

import java.util.Objects;

public class Student {
    //properties
    private String name;
    private int test1;
    private int test2;
    private int test3;

    //constructor
    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int test1, int test2, int test3) {
        this.name = name;
        this.test1 = test1;
        this.test2 = test2;
        this.test3 = test3;
    }

    //getters and setters
    public int getGPA() {
        return (test1 + test2 + test3) / 3;
    }

    public String getName() {
        return name;
    }

    public int getTest1() {
        return test1;
    }

    public void setTest1(int test1) {
        this.test1 = test1;
    }

    public int getTest2() {
        return test2;
    }

    public void setTest2(int test2) {
        this.test2 = test2;
    }

    public int getTest3() {
        return test3;
    }

    public void setTest3(int test3) {
        this.test3 = test3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name +
                ", GPA=" + this.getGPA() +
                '}';
    }
}
