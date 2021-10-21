package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyStackDLLBImpl;

/**
 * create a STACK
 * @param <E>
 */
public interface MyStack<E> {
    /**
     * remove the last element of the stack
     * @return
     */
    E pop();

    /**
     * add an element at the start of the stack
     * @param x
     */
    void push(E x);

    /**
     * return if the stack is empty or not
     * @return
     */
    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    /**
     * return the number of element of your stack
     * @return
     */
    int numOfElems();

    E peek();

    /** Consider pros and cons of having a factory method in the interface */
    static <T> MyStack<T> create() {
        return new MyStackDLLBImpl<T>();
    }
}
