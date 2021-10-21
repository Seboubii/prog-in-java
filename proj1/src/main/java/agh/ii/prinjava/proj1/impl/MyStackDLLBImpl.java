package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;

public class MyStackDLLBImpl<E> implements MyStack<E> {
    private DLinkList<E> elems;

    /**
     * remove the first element and return its value
     * @return E
     */

    @Override
    public E pop() {
        if (elems != null){
            return elems.removeLast();
        }
        throw new IllegalStateException("it's empty");
    }

    /**
     * add an element at the start of the list
     * @param x
     */
    @Override
    public void push(E x) {
        elems.addFirst(x);
    }

    /**
     * return the number of element of the list
     * @return int
     */
    @Override
    public int numOfElems() {
        if (elems != null){
            return elems.numOfElems();
        }
        throw new IllegalStateException("it's empty");
    }

    /**
     * return the value of the first element of the list
     * @return E
     */
    @Override
    public E peek() {
        if (elems != null){
            return elems.peek();
        }
        throw new IllegalStateException("it's empty");
    }
}
