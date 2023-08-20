package com.example.demo;

public class Student {
    private int regNo ;
    private String name ;
    private int age ;
    private String department ;

    public Student() {
    }

    public Student(int regNo, String name, int age, String department) {
        this.regNo = regNo;
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
