package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;

public class MyQueueDLLBImpl<E> implements MyQueue<E> {
    private DLinkList<E> elems;

    /**
     * add an element with the value x at the end of the queue
     * @param x
     */
    @Override
    public void enqueue(E x) {
        elems.addLast(x);
    }

    /**
     * remove the first element of the list and return it's value
     * @return E
     */
    @Override
    public E dequeue() {
        if (elems != null) {
            return elems.removeFirst();
        }
        throw new IllegalStateException("it's empty");
    }

    /**
     * return the number of element of the list
     * @return int
     */
    @Override
    public int numOfElems() {
        if (elems != null) {
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
        if (elems != null) {
            return elems.peek();
        }
        throw new IllegalStateException("it's empty");
    }
}


