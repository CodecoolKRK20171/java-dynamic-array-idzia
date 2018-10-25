package com.codecool.dynamicArrayDojo.queue;

public class CustomeQueue {

    private Nodee head;
    private Nodee tail;

    public CustomeQueue (){
    }

    public Nodee getHead() {
        return head;
    }

    public Nodee getTail() {
        return tail;
    }

    public void enqueue (String value) {
        if (head == null) {
            head = new Nodee(value);
        } else {
            Nodee nextNodee = new Nodee(value);
            Nodee current = head;

            while (current.getNextNodee() != null) {
                current = current.getNextNodee();
            }
            current.setNextNodee(nextNodee);
            tail = current.getNextNodee();
        }

    }

    public String peek() {
        return head.getValue();
    }


    public String dequeue() {
        String firstValue = head.getValue();
        Nodee current = head;
        head = current.getNextNodee();

        return firstValue;
    }

    public int queueSize() {

        Nodee current = head;
        int size = 0;

        if (!isEmpty()) {
            size = 1;
            while (current.getNextNodee() != null) {
                size++;
                current = current.getNextNodee();
            }
        }
        return size;
    }



    public boolean isEmpty() {
        return head == null;
    }



}
