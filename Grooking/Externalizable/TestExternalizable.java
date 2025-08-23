package org.java.Grooking.Externalizable;

import java.io.*;

public class TestExternalizable {

    public static void main(String[] args) {
        Employeee emp = new Employeee("Mike",15, 20000, "TSYS");
        String file = "/Users/poorvimaheshwari/Downloads/bytestream.txt";
        try{
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(emp);
            fos.close();
            oos.close();
            System.out.println("Employee object serialized successfully: " + emp);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try{
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Employeee emp1 = (Employeee) ois.readObject();
            fis.close();
            ois.close();
            System.out.println("Employee object deserialized successfully: " + emp1);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
