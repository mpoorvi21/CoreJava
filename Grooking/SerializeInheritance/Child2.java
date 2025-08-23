package org.java.Grooking.SerializeInheritance;

import javax.swing.text.AsyncBoxView;
import java.io.*;

public class Child2 extends Parent2{

    int y;
    public Child2(int x, int y){
        super(x);
        this.y = y;
    }

    private void writeObject(ObjectOutputStream oos) throws IOException{
        throw new NotSerializableException("Serialization not supported for Child2");
    }
    private void readObject(ObjectInputStream ois) throws IOException{
        throw  new NotSerializableException("Deserialization not supported for Child2");
    }
}
