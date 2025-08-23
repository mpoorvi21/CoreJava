package org.java.Grooking.SerializeDeserialize;

import java.io.*;

public class SerializationDemo1 {
    public static void main(String[] args){
        Employee1 emp = new Employee1("Poorvi",24,20000,"Google");
        String file = "/Users/poorvimaheshwari/Downloads/bytestream.txt";
        try{
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(emp);

            fos.close();
            oos.close();
            System.out.println("Employee object serialized successfully"+ emp);
        }catch (IOException e){
            System.out.println("IOException occurred");
        }

        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Employee1 emp1 = (Employee1) ois.readObject();
            fis.close();
            ois.close();
            System.out.println("Employee object deserialized successfully: " + emp1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
