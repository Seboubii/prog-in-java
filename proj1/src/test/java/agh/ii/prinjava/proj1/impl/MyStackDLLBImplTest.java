package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackDLLBImplTest {
    MyStack<Integer> stackOfInts = MyStack.create();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void pop() {
        stackOfInts.pop();
    }

    @Test
    void push() {
        stackOfInts.push(2);
    }

    @Test
    void numOfElems() {
        stackOfInts.numOfElems();
    }

    @Test
    void peek() {
        stackOfInts.peek();
    }
}