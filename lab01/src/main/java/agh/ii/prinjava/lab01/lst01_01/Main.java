package agh.ii.prinjava.lab01.lst01_01;

/**
 * Encapsulation demo
 */
public class Main {
    public static void main(String[] args) {
        HelloEncapsulation enDemo = new HelloEncapsulation(42);

        // int propVal = enDemo.propVal; // (!)
        // To read or to modify the value of "propVal", we cannot access it directly
        // because of the access modifier ("private"). Instead:
        int propVal = enDemo.getPropVal();
        propVal++;
        enDemo.setPropVal(propVal);
    }
}

/** Encapsulation is the fact of wrapping data and methods as a single unit */
/** because the variables are private, we cannot modify it as we want. So we need to have getters and setters to modify them.
 * the getters get us to get the value, and the setters to set it to a different value (if we want to) */
/** this is a reference to the current object */
/** super is a keyword that permit reference to a parent class, it works like the "this" but with parent and subclass */
/** inheritance is making a subclass inherit the parameter and methods of a parent class. We use "extends" to make a class the subclass of parent class */
