package com.codecool.dynamicArrayDojo;

import com.codecool.dynamicArrayDojo.stack.Stack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void StackTest_InitialStack(){
        Stack<Integer> stack = new Stack<Integer>(5);

        Integer expectedSize = 5;
        Integer expectedFirstIndex = 0;

        Integer resultSize = stack.getMaxSize();
        Integer resultFirstIndex = stack.getFirstIndex();

        assertEquals(expectedSize, resultSize);
        assertEquals(expectedFirstIndex, resultFirstIndex);
    }

    @Test
    void StackTest_push() {
        Stack<Integer> stack = new Stack<Integer>(5);
        stack.push(7);

        Integer expected = 7;
        Integer result = (Integer) stack.getStackArray()[stack.getFirstIndex() - 1];

        assertEquals(expected, result);
    }

    @Test
    void StackTest_addToNoFreeSpace() {
        Stack<Integer> stack = new Stack<Integer>(2);
        stack.push(7);
        stack.push(2);

        assertThrows(IllegalArgumentException.class,
                ()-> stack.push(5));
    }


    @Test
    void StackTest_returnLastIn() {
        Stack<Integer> stack = new Stack<Integer>(5);
        stack.push(7);
        stack.push(2);
        stack.push(5);

        Integer expected = 5;
        Integer result = (Integer) stack.getStackArray()[stack.getFirstIndex() - 1];

        assertEquals(expected, result);
    }

    @Test
    void StackTest_removeLast() {
        Stack<Integer> stack = new Stack<Integer>(5);
        stack.push(7);
        stack.push(2);
        stack.push(5);

        Object[] expected = new Object[]{7,2,null,null,null};
        Object[] result = stack.pop();


        assertArrayEquals(expected, result);
    }

    @Test
    void StackTest_removeFrom0Index() {
        Stack<Integer> stack = new Stack<Integer>(5);
        stack.push(7);

        Object[] expected = new Object[]{null,null,null,null,null};
        Object[] result = stack.pop();

        assertArrayEquals(expected, result);
    }

    @Test
    void StackTest_removeFromEmptyArray() {
        Stack<Integer> stack = new Stack<Integer>(2);

        //Integer result = stack.left();

        assertThrows(IllegalArgumentException.class,
                ()-> stack.pop());
    }






    @Test
    void StackTest_peekValue() {
        Stack<Integer> stack = new Stack<Integer>(5);
        stack.push(7);
        stack.push(2);
        stack.push(5);
        stack.pop();

        Integer expected = 2;
        Integer result = (Integer)stack.peek();

        assertEquals(expected, result);
    }

    @Test
    void StackTest_left() {
        Stack<Integer> stack = new Stack<Integer>(5);
        stack.push(7);
        stack.push(2);
        stack.push(5);

        Integer expected = 2;
        Integer result = stack.left();

        assertEquals(expected, result);
    }

    @Test
    void StackTest_full() {
        Stack<Integer> stack = new Stack<Integer>(2);
        stack.push(7);
        stack.push(2);


        Integer expected = 0;
        Integer result = stack.left();

        assertEquals(expected, result);
    }


}