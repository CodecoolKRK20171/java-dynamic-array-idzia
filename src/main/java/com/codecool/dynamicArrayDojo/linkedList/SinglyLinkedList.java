package com.codecool.dynamicArrayDojo.linkedList;

public class SinglyLinkedList {

    private Node head;
    private Node last;
    public int length;

    public SinglyLinkedList(){
        head = null;
        last = null;
        length = 0;
    }

    public Node getHead(){
        return this.head;
    }

    public Node getLast(){
        return this.last;
    }

    public void add (int data) {
        Node nextNode = new Node(data);
        Node current = head;


        if(head == null) {
            head = nextNode;

        } else {
            while (current.getNext() != null) {
                current = current.getNext();
            }

            current.setNext(nextNode);

        }
        last = nextNode;
        length++;

    }


    public void insert (int data, int nodeNumber) {
        Node newNode = new Node(data);

        Node current = head;

        if(nodeNumber > length || nodeNumber <= 0){
            throw new IndexOutOfBoundsException("Index out of bounds");
        } else if (nodeNumber == 1) {
            newNode.setNext(current);
            head = newNode;

        } else if (nodeNumber == length) {
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
            last = newNode;

        } else {

            for (int i=1; i<nodeNumber-1; i++ ) {
                current = current.getNext();
            }

            Node newNext = current.getNext();
            newNode.setNext(newNext);

            current.setNext(newNode);
        }

        length++;
    }

    public void remove (int data) {

        Node point = head;
        Node previous = null;
        Node nextNode = null;


        if (head.getData() == data) {
            Node newHead = head.getNext();
            head = newHead;
            length--;

        } else {

            while (point != null && point.getData() != data) {
                previous = point;
                point = point.getNext();

                if (point != null && point.getData() == data) {
                    nextNode = point.getNext();
                    previous.setNext(nextNode);
                    length--;
                } else if (point == null)  {
                    last = previous;

                }
            }
        }
    }


    @Override
    public String toString(){
        String stringInt = "";
        Node current = head;

        for (int i=0; i<length; i++) {
            String string = String.valueOf(current.getData());
            stringInt += string + " " ;
            current = current.getNext();
        }

        return stringInt;
    }


}
