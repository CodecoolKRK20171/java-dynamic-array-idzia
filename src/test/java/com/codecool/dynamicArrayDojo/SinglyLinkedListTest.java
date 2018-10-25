package com.codecool.dynamicArrayDojo;

import com.codecool.dynamicArrayDojo.linkedList.SinglyLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {

    @Test
    void SinglyLinkedListTest_InitLength() {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        int expected = 0;
        int result = linkedList.length;
        assertEquals(expected, result);
    }

    @Test
    void SinglyLinkedListTest_AddFirstValueToEmptyList() {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.add(7);

        String expected = "7 ";
        String result = (linkedList.toString());

        assertEquals(expected, result);
    }

    @Test
    void SinglyLinkedListTest_AddFiewNextValueToList() {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.add(7);
        linkedList.add(3);
        linkedList.add(8);
        linkedList.add(1);


        String expected = "7 3 8 1 ";
        String result = (linkedList.toString());

        assertEquals(expected, result);
    }

    @Test
    void SinglyLinkedListTest_checkLast() {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.add(7);
        linkedList.add(3);
        linkedList.add(8);
        linkedList.add(1);

        String expected = "1";
        String result = (linkedList.getLast().toString());

        assertEquals(expected, result);
    }

    @Test
    void SinglyLinkedListTest_checkHead() {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.add(7);
        linkedList.add(3);
        linkedList.add(8);
        linkedList.add(1);

        String expected = "7";
        String result = (linkedList.getHead().toString());

        assertEquals(expected, result);
    }

    @Test
    void SinglyLinkedListTest_InsertValueToListByNodeNumber() {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.add(7);
        linkedList.add(3);
        linkedList.add(8);
        linkedList.add(5);

        linkedList.insert(1, 2);

        String expected = "7 1 3 8 5 ";
        String result = (linkedList.toString());

        assertEquals(expected, result);
    }

    @Test
    void SinglyLinkedListTest_InsertValueToBegining() {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.add(7);
        linkedList.add(3);
        linkedList.add(8);
        linkedList.add(5);

        linkedList.insert(1, 1);

        String expected = "1 7 3 8 5 ";
        String result = (linkedList.toString());

        assertEquals(expected, result);
    }

    @Test
    void SinglyLinkedListTest_checkHeadAfterInsertValueToBegining() {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.add(7);
        linkedList.add(3);
        linkedList.add(8);
        linkedList.add(5);

        linkedList.insert(1, 1);

        String expected = "1";
        String result = (linkedList.getHead().toString());

        assertEquals(expected, result);
    }

    @Test
    void SinglyLinkedListTest_checkLastAfterInsertValueToBegining() {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.add(7);
        linkedList.add(3);
        linkedList.add(8);
        linkedList.add(5);

        linkedList.insert(1, 1);

        String expected = "5";
        String result = (linkedList.getLast().toString());

        assertEquals(expected, result);
    }


    @Test
    void SinglyLinkedListTest_InsertValueToEnd() {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.add(7);
        linkedList.add(3);
        linkedList.add(8);
        linkedList.add(5);

        linkedList.insert(1, 4);

        String expected = "7 3 8 5 1 ";
        String result = (linkedList.toString());

        assertEquals(expected, result);
    }

    @Test
    void SinglyLinkedListTest_checkLastAfterInsertValueToEnd() {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.add(7);
        linkedList.add(3);
        linkedList.add(8);
        linkedList.add(5);

        linkedList.insert(1, 4);

        String expected = "1";
        String result = (linkedList.getLast().toString());

        assertEquals(expected, result);
    }


    @Test
    void SinglyLinkedListTest_removeHead() {

        SinglyLinkedList linkedList = new SinglyLinkedList();

        linkedList.add(1);
        linkedList.add(7);
        linkedList.add(3);
        linkedList.add(8);
        linkedList.add(5);

        linkedList.remove(1);

        String expected = "7 3 8 5 ";
        String result = (linkedList.toString());

        assertEquals(expected, result);
    }

    @Test
    void SinglyLinkedListTest_checkHeadAfterRemove() {

        SinglyLinkedList linkedList = new SinglyLinkedList();

        linkedList.add(1);
        linkedList.add(7);
        linkedList.add(3);
        linkedList.add(8);
        linkedList.add(5);

        linkedList.remove(1);

        String expected = "7";
        String result = (linkedList.getHead().toString());

        assertEquals(expected, result);
    }

    @Test
    void SinglyLinkedListTest_removeFromMiddle() {

        SinglyLinkedList linkedList = new SinglyLinkedList();

        linkedList.add(7);
        linkedList.add(3);
        linkedList.add(1);
        linkedList.add(8);
        linkedList.add(5);

        linkedList.remove(1);

        String expected = "7 3 8 5 ";
        String result = (linkedList.toString());

        assertEquals(expected, result);
    }

    @Test
    void SinglyLinkedListTest_removeFromMiddleDoubleValue() {

        SinglyLinkedList linkedList = new SinglyLinkedList();

        linkedList.add(7);
        linkedList.add(3);
        linkedList.add(1);
        linkedList.add(8);
        linkedList.add(1);
        linkedList.add(5);

        linkedList.remove(1);

        String expected = "7 3 8 1 5 ";
        String result = (linkedList.toString());

        assertEquals(expected, result);
    }

    @Test
    void SinglyLinkedListTest_NoValueToRemove() {

        SinglyLinkedList linkedList = new SinglyLinkedList();

        linkedList.add(7);
        linkedList.add(3);
        linkedList.add(8);
        linkedList.add(5);

        linkedList.remove(1);

        String expected = "7 3 8 5 ";
        String result = (linkedList.toString());

        assertEquals(expected, result);
    }

    @Test
    void SinglyLinkedListTest_removeLastValue() {

        SinglyLinkedList linkedList = new SinglyLinkedList();

        linkedList.add(7);
        linkedList.add(3);
        linkedList.add(8);
        linkedList.add(5);
        linkedList.add(1);

        linkedList.remove(1);

        String expected = "7 3 8 5 ";
        String result = (linkedList.toString());

        assertEquals(expected, result);
    }
}