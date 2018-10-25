package com.codecool.dynamicArrayDojo.linkedList;

public class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this(data, null);
    }

    public Node(int data, Node next) {
        this.next = next;
        this.data = data;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node nextNode) {
        this.next = nextNode;
    }

    public int getData() {
        return this.data;
    }

    public String toString() {
        return String.valueOf(data);
    }


}


