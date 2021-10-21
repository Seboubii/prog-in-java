package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyQueueDLLBImpl;

/**
 * create a QUEUE
 * @param <E>
 */
public interface MyQueue<E> {

    /**
     * enqueue put an element at the end of the queue
     * @param x
     */

    void enqueue(E x);

    /**
     * dequeue remove an element at the start of the list
     * @return
     */
    E dequeue();

    /**
     * say if the queue is empty or not
     * @return
     */
    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    /**
     * return the number of element of the queue
     * @return
     */
    int numOfElems();

    E peek();

    /** Consider pros and cons of having a factory method in the interface */
    static <T> MyQueue<T> create() {
        return new MyQueueDLLBImpl<>();
    }
}
