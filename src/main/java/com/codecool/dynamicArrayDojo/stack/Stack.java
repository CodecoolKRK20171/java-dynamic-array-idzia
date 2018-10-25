package com.codecool.dynamicArrayDojo.stack;

public class Stack <T>{

    private int firstIndex;
    private int maxSize;
    private Object[] stackArray;


    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new Object[maxSize];
        this.firstIndex = 0;
    }

    public int getFirstIndex() {
        return firstIndex;
    }

    public void setFirstIndex(int firstIndex) {
        this.firstIndex = firstIndex;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public Object[] getStackArray() {
        return stackArray;
    }

    public void setStackArray(Object[] stackArray) {
        this.stackArray = stackArray;
    }

    public void push(Object o) {

        if (firstIndex == maxSize) {
            throw new IllegalArgumentException("Sorry, stack is full");
        } else {
            stackArray[firstIndex]= o;
            firstIndex++;
        }

    }

    public Object[] pop() {


        if (firstIndex == 0 && stackArray[firstIndex] == null){
            throw new IllegalArgumentException("Stack is empty you can not pop element");
        } else if (firstIndex == 0 && stackArray[firstIndex] != null) {
            stackArray[firstIndex] = null;
        } else {
            firstIndex--;
            stackArray[firstIndex] = null;
        }
        return stackArray;
    }


    public Object peek() {
        return stackArray[firstIndex-1];
    }

    public Integer left() {
        return maxSize - firstIndex;
    }


}
