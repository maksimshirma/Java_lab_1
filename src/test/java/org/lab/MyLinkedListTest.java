package org.lab;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for MyLinkedList class.
 */
public class MyLinkedListTest {

    /**
     * Test has.
     */
    @Test
    public void has() {
        MyLinkedList list = new MyLinkedList();
        int value1 = 5;
        int value2 = 234;
        int value3 = -16345;
        int value4 = 2523;
        list.addToHead(value1);
        list.addToEnd(value2);
        list.addToHead(value3);
        list.addToEnd(value4);
        assertTrue(list.has(value1));
        assertTrue(list.has(value2));
        assertTrue(list.has(value3));
        assertTrue(list.has(value4));
        assertFalse(list.has(12));
    }

    /**
     * Test addToHead.
     */
    @Test
    public void addToHead() {
        int value1 = 5;
        int value2 = 234;
        int value3 = -16345;
        int value4 = 2523;
        MyLinkedList list = new MyLinkedList();
        list.addToHead(value1);
        list.addToHead(value2);
        list.addToHead(value3);
        list.addToHead(value4);
        assertTrue(list.has(value1));
        assertTrue(list.has(value2));
        assertTrue(list.has(value3));
        assertTrue(list.has(value4));
    }

    /**
     * Test addToEnd.
     */
    @Test
    public void addToEnd() {
        int value1 = 5;
        int value2 = 234;
        int value3 = -16345;
        int value4 = 2523;
        MyLinkedList list = new MyLinkedList();
        list.addToEnd(value1);
        list.addToEnd(value2);
        list.addToEnd(value3);
        list.addToEnd(value4);
        assertTrue(list.has(value1));
        assertTrue(list.has(value2));
        assertTrue(list.has(value3));
        assertTrue(list.has(value4));
    }

    /**
     * Test delete.
     */
    @Test
    public void delete() {
        MyLinkedList actualList = new MyLinkedList();
        int value1 = 5;
        int value2 = 234;
        int value3 = -16345;
        int value4 = 2523;
        actualList.addToHead(value1);
        actualList.addToEnd(value2);
        actualList.addToEnd(value3);
        actualList.addToHead(value4);
        actualList.delete(value3);
        actualList.delete(value2);

        MyLinkedList expectedList = new MyLinkedList();
        expectedList.addToHead(value1);
        expectedList.addToHead(value4);

        assertEquals(actualList, expectedList);
    }
}
