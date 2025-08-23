package org.java.Grooking.SerializeInheritance;

import java.io.*;

public class TestSerialization2 {
    // Stopping Serialization of Child class
    public static void main(String[] args) {
        Child2 child1 = new Child2(20,40);
        System.out.println(" x: " + child1.x);
        System.out.println(" x: " + child1.y);
        String file = "/Users/poorvimaheshwari/Downloads/bytestream.txt";
        serializeObject(file,child1);
        deserializeObject(file);
    }
    private static void serializeObject(String file, Child2 child){
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
            Child2 child2 = (Child2) ois.readObject();
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
