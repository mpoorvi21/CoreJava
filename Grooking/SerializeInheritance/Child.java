package org.java.Grooking.SerializeInheritance;

public class Child extends Parent{
    int y;

    public Child(int x, int y) {
        super(x); // Call to Parent constructor
        this.y = y;
    }
}
