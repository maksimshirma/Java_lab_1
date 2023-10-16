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
        for (int i = 0; i < 6; i++) {
            list.addToEnd(i);
        }
        assertTrue(list.has(3));
        assertFalse(list.has(-2));
    }

    /**
     * Test addToHead.
     */
    @Test
    public void addToHead() {
        int value = 5;
        MyLinkedList list = new MyLinkedList();
        list.addToHead(value);
        assertTrue(list.has(value));
    }

    /**
     * Test addToEnd.
     */
    @Test
    public void addToEnd() {
        int value = 5;
        MyLinkedList list = new MyLinkedList();
        list.addToEnd(value);
        assertTrue(list.has(value));
    }

    /**
     * Test delete.
     */
    @Test
    public void delete() {
        MyLinkedList actualList = new MyLinkedList();
        for (int i = 0; i < 10; i++) {
            actualList.addToEnd(i);
        }
        actualList.delete(0);
        actualList.delete(9);
        actualList.delete(5);
        actualList.delete(11);

        MyLinkedList expectedList = new MyLinkedList();
        for (int i = 1; i < 9; i++) {
            if (i != 5) {
                expectedList.addToEnd(i);
            }
        }

        assertEquals(actualList, expectedList);
    }
}
