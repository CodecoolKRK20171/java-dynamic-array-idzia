package com.codecool.dynamicArrayDojo.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomeQueueTest {

    @Test
    void CustomeQueueTest_CheckHead(){
        CustomeQueue queue = new CustomeQueue();
        queue.enqueue("Ania");

        String expected = "Ania";
        String result = (queue.getHead().getValue());

        assertEquals(expected, result);
    }

    @Test
    void CustomeQueueTest_CheckHeadAfterAddFewValue(){
        CustomeQueue queue = new CustomeQueue();
        queue.enqueue("Ania");
        queue.enqueue("Amelia");
        queue.enqueue("Antosia");
        queue.enqueue("Tymon");

        String expected = "Ania";
        String result = (queue.getHead().getValue());

        assertEquals(expected, result);
    }

    @Test
    void CustomeQueueTest_CheckTailAfterAddFewValue(){
        CustomeQueue queue = new CustomeQueue();
        queue.enqueue("Ania");
        queue.enqueue("Amelia");
        queue.enqueue("Antosia");
        queue.enqueue("Tymon");

        String expected = "Tymon";
        String result= (queue.getTail().getValue());

        assertEquals(expected, result);
    }

    @Test
    void CustomeQueueTest_Peek(){
        CustomeQueue queue = new CustomeQueue();
        queue.enqueue("Ania");
        queue.enqueue("Amelia");
        queue.enqueue("Antosia");
        queue.enqueue("Tymon");

        String expected = "Ania";
        String result = (queue.peek());

        assertEquals(expected, result);
    }

    @Test
    void CustomeQueueTest_Dequeue(){
        CustomeQueue queue = new CustomeQueue();

        queue.enqueue("Amelia");
        queue.enqueue("Antosia");
        queue.enqueue("Tymon");

        String expected = "Amelia";
        String result = (queue.dequeue());

        assertEquals(expected, result);
    }

    @Test
    void CustomeQueueTest_HeadAfterDequeue(){
        CustomeQueue queue = new CustomeQueue();

        queue.enqueue("Amelia");
        queue.enqueue("Antosia");
        queue.enqueue("Tymon");
        queue.dequeue();

        String expected = "Antosia";
        String result = (queue.getHead().getValue());

        assertEquals(expected, result);
    }

    @Test
    void CustomeQueueTest_Size(){
        CustomeQueue queue = new CustomeQueue();

        queue.enqueue("Ania");
        queue.enqueue("Amelia");
        queue.enqueue("Antosia");
        queue.enqueue("Tymon");
        queue.enqueue("Piotr");

        int expected = 5;
        int result = (queue.queueSize());

        assertEquals(expected, result);
    }

    @Test
    void CustomeQueueTest_SizeAfterDequeue(){
        CustomeQueue queue = new CustomeQueue();

        queue.enqueue("Ania");
        queue.enqueue("Amelia");
        queue.enqueue("Antosia");
        queue.enqueue("Tymon");
        queue.enqueue("Piotr");

        queue.dequeue();
        queue.dequeue();

        int expected = 3;
        int result = (queue.queueSize());

        assertEquals(expected, result);
    }

    @Test
    void CustomeQueueTest_EmptyQueueSize(){
        CustomeQueue queue = new CustomeQueue();

        int expected = 0;
        int result = (queue.queueSize());

        assertEquals(expected, result);
    }

}