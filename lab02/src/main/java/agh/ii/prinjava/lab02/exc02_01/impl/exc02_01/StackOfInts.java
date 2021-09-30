package agh.ii.prinjava.lab02.exc02_01.impl.exc02_01;

/**
 * Stack of integers - Abstract Data Type (ADT)
 */

public interface StackOfInts {
    /**
     *
     * @return int, remove the first element and return it !
     */
    int pop();

    /**
     *
     * @return void, Add an element at the start of the list / array !
     */

    void push(int x);

    /**
     *
     * @return boolean, if the list is empty, return true !
     */

    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    /**
     *
     * @return int, return the number of element of the list !
     */

    int numOfElems();

    /**
     *
     * @return int, return the value of the first element of the list / array !
     */

    int peek();
}
