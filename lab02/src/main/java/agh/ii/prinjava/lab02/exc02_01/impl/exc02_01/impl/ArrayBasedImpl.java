package agh.ii.prinjava.lab02.exc02_01.impl.exc02_01.impl;

import agh.ii.prinjava.lab02.exc02_01.impl.exc02_01.StackOfInts;

public class ArrayBasedImpl implements StackOfInts {

    @Override
    public int pop() {
        if (numOfElems != 0) {
            int supplement = boudiou[0];
            int[] bondieu = new int[0];
            for (int i = 0; i < numOfElems - 1; i++) {
                bondieu[i] = boudiou[i + 1];
            }
            boudiou = bondieu;
            numOfElems--;
            return supplement;
        }
        throw new IllegalStateException("To be implemented");
    }

    @Override
    public void push(int x) {
        int[] danielCWorded = new int[0];
        danielCWorded[0] = x;
        for (int i = 0; i<numOfElems; i++){
            danielCWorded[i+1] = boudiou[i];
        }
        boudiou = danielCWorded;
    }

    @Override
    public int numOfElems() {
        return numOfElems;
    }

    @Override
    public int peek() {if (numOfElems != 0) { return boudiou[0]; } throw new IllegalStateException("To be implemented");}

    private int numOfElems = 0;

    private int[] boudiou;
}
