package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueDLLBImplTest {
    MyQueue<Integer> queueOfInts = MyQueue.create();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void enqueue() {
        queueOfInts.enqueue(2);
        queueOfInts.enqueue(3);
    }

    @Test
    void dequeue() {
        queueOfInts.dequeue();
    }

    @Test
    void numOfElems() {
        queueOfInts.numOfElems();
    }

    @Test
    void peek() {
        queueOfInts.peek();
    }
}