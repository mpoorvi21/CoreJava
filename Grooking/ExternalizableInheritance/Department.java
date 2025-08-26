package org.java.Grooking.ExternalizableInheritance;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Department implements Externalizable {
    private int deptId;
    private String deptName;
    private int capacity;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Department(int deptId, String deptName, int capacity) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.capacity = capacity;
    }

    public Department(){
        System.out.println("No-arg constructor called Department class");
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(deptId);
        out.writeUTF(deptName);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        deptId = in.readInt();
        deptName = in.readUTF();
    }
}
