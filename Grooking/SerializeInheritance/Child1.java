package org.java.Grooking.SerializeInheritance;

import java.io.Serializable;

public class Child1 extends Parent1  implements Serializable {
    int y;
    public Child1(int x, int y){
        super(x);
        this.y = y;
        System.out.println("Child two arg constructor called");
    }
    public Child1(){
        System.out.println("Child no arg constructor called");
    }
}
