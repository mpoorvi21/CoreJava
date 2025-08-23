package org.java.Grooking.SerializeInheritance;

import java.io.*;

public class TestSeralization {
    public static void main(String[] args){
        Child child = new Child(10,50);
        System.out.println(" x: " + child.x);
        System.out.println("y:" + child.y);
        String file = "/Users/poorvimaheshwari/Downloads/bytestream.txt";
        serializeObject(file,child);
        deserializeObject(file);
    }

    private static void serializeObject(String file, Child child){
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
            Child child1 = (Child) ois.readObject();
            fis.close();
            ois.close();
            System.out.println("The object deserialized successfully");
            System.out.println(" x: " + child1.x);
            System.out.println("y:" + child1.y);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
