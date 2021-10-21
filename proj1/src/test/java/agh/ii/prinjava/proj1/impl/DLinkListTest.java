package agh.ii.prinjava.proj1.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DLinkListTest {
    DLinkList<Integer> dLinkList = new DLinkList<>();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }


    @Test
    void isEmpty() {
        dLinkList.isEmpty();
    }

    @Test
    void addFirst() {
        dLinkList.addFirst(1);
        dLinkList.addFirst(2);
        dLinkList.addFirst(3);

    }

    @Test
    void addLast() {
        dLinkList.addLast(2);
        dLinkList.addLast(3);
        dLinkList.addLast(4);
        dLinkList.addLast(5);
    }

    @Test
    void removeFirst() {
        dLinkList.addFirst(1);
        dLinkList.addFirst(1);
        dLinkList.removeFirst();
    }

    @Test
    void removeLast() {
        dLinkList.addFirst(1);
        dLinkList.addFirst(1);
        dLinkList.removeLast();
    }

    @Test
    void numOfElems() {
        dLinkList.numOfElems();
    }

    @Test
    void testToString() {
        dLinkList.toString();
    }

    @Test
    void peek() {
        dLinkList.peek();
    }
}