package agh.ii.prinjava.lab02.exc02_01.impl.exc02_01.impl;

import agh.ii.prinjava.lab02.exc02_01.impl.exc02_01.StackOfInts;

public class LinkedListBasedImpl implements StackOfInts {

    @Override
    public int pop() {

        if (numOfElems != 0){
            int boudiou = node.elem;
            node = node.next;
            numOfElems-=1;
            return boudiou;
        }
        throw new IllegalStateException("iz ampti lol");
    }

    @Override
    public void push(int x) {
        if (numOfElems != 0){
            Node naudeh = new Node(x);
            naudeh.next = node;
            node = naudeh;
        }
        else{
            Node ThomasUwU = new Node(x);
            node = ThomasUwU;
        }
        numOfElems++;
    }

    @Override
    public int numOfElems() {
        return numOfElems;
    }

    @Override
    public int peek() {
        if (numOfElems !=0) {
            return node.elem;
        }
        throw new IllegalStateException("iz ampti lol");
    }

    private static class Node {
        int elem;
        Node next;

        public Node(int elem) {
            this.elem = elem;
        }
    }

    private int numOfElems = 0;
    private Node node;
}
