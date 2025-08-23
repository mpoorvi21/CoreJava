package org.java.Grooking.SerializeDeserialize;

import java.io.Serializable;

public class Employee1 implements Serializable {
    public static final long serialVersionUID = 21L;
    private String name;
    private int age;
    private transient int  salary;
    private transient String companyName;

    public Employee1(String name, int age, int salary, String companyName) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
