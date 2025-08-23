package org.java.Grooking.SerializeInheritance;

import java.io.*;

public class TestSerialization1 {

    // Example when Child class implents Serializable and Parent class does not implement Serializable
    // No Arg constructor pattern
    public static void main(String[] args) {
        Child1 child1 = new Child1(20,40);
        System.out.println(" x: " + child1.x);
        System.out.println(" x: " + child1.y);
        String file = "/Users/poorvimaheshwari/Downloads/bytestream.txt";
        serializeObject(file,child1);
        deserializeObject(file);
    }
    private static void serializeObject(String file, Child1 child){
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(child);
            fos.close();
            oos.close();
            System.out.println("The object serialized successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void deserializeObject(String file){
        try{
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Child1 child2 = (Child1) ois.readObject();
            fis.close();
            ois.close();
            System.out.println("The object deserialized successfully");
            System.out.println(" x: " + child2.x);
            System.out.println("y:" + child2.y);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
