package org.java.Grooking.Externalizable;

import org.java.Grooking.SerializeDeserialize.Employee;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employeee implements Externalizable {

    private String  name;
    private int age;
    private transient int salary;
    private String company;

    public Employeee(){
        System.out.println("No arg constructor called");
    }
    public Employeee (String name, int age, int salary, String company) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", company='" + company + '\'' +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeInt(age);
        out.writeInt(salary);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        age = in.readInt();
        salary = in.readInt();
    }
}
