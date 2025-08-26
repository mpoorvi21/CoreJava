package org.java.Grooking.ExternalizableInheritance;

import java.io.*;

public class ExternalizableDemo {

    //When both parent and child class implements Externalizable interface
    public static void main(String[] args) {
        Student st = new Student();
        st.setStudentId(1);
        st.setStudentName("Lisa");
        st.setAge(20);
        st.setDeptName("ID");
        st.setDeptId(20);
        st.setCapacity(30);
        String file = "/Users/poorvimaheshwari/Downloads/bytestream.txt";

        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(st);
            fos.close();
            oos.close();
            System.out.println("Student object serialized successfully: \n" + st);
        } catch (IOException e) {
          e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
          Student student = (Student)  ois.readObject();
          fis.close();
          ois.close();
            System.out.println("Student object deserialized successfully: \n" + student);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
