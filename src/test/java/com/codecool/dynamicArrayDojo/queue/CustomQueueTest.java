package com.codecool.dynamicArrayDojo.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomQueueTest {

    @Test
    void CustomQueueTest_CheckHead(){
        CustomQueue queue = new CustomQueue();
        queue.enqueue("Ania");

        String expected = "Ania";
        String result = (queue.getHead().getValue());

        assertEquals(expected, result);
    }

    @Test
    void CustomQueueTest_CheckHeadAfterAddFewValue(){
        CustomQueue queue = new CustomQueue();
        queue.enqueue("Ania");
        queue.enqueue("Amelia");
        queue.enqueue("Antosia");
        queue.enqueue("Tymon");

        String expected = "Ania";
        String result = (queue.getHead().getValue());

        assertEquals(expected, result);
    }

    @Test
    void CustomQueueTest_CheckTailAfterAddFewValue(){
        CustomQueue queue = new CustomQueue();
        queue.enqueue("Ania");
        queue.enqueue("Amelia");
        queue.enqueue("Antosia");
        queue.enqueue("Tymon");

        String expected = "Tymon";
        String result= (queue.getTail().getValue());

        assertEquals(expected, result);
    }

    @Test
    void CustomQueueTest_Peek(){
        CustomQueue queue = new CustomQueue();
        queue.enqueue("Ania");
        queue.enqueue("Amelia");
        queue.enqueue("Antosia");
        queue.enqueue("Tymon");

        String expected = "Ania";
        String result = (queue.peek());

        assertEquals(expected, result);
    }

    @Test
    void CustomQueueTest_Dequeue(){
        CustomQueue queue = new CustomQueue();

        queue.enqueue("Amelia");
        queue.enqueue("Antosia");
        queue.enqueue("Tymon");

        String expected = "Amelia";
        String result = (queue.dequeue());

        assertEquals(expected, result);
    }

    @Test
    void CustomQueueTest_HeadAfterDequeue(){
        CustomQueue queue = new CustomQueue();

        queue.enqueue("Amelia");
        queue.enqueue("Antosia");
        queue.enqueue("Tymon");
        queue.dequeue();

        String expected = "Antosia";
        String result = (queue.getHead().getValue());

        assertEquals(expected, result);
    }

    @Test
    void CustomQueueTest_Size(){
        CustomQueue queue = new CustomQueue();

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
    void CustomQueueTest_SizeAfterDequeue(){
        CustomQueue queue = new CustomQueue();

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
    void CustomQueueTest_EmptyQueueSize(){
        CustomQueue queue = new CustomQueue();

        int expected = 0;
        int result = (queue.queueSize());

        assertEquals(expected, result);
    }

}