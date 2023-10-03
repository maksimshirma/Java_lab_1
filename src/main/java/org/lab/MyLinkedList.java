package org.lab;

/**
 * Singly linked list. This class provides storage of any quantity of the different int values, you can add new elements, delete old ones and get values of the elements.
 */
public class MyLinkedList {
    /**
     * Node. This class implements the element of a list.
     */
    static class Node{
        /**
         * The value of an element.
         */
        int value;

        /**
         * The pointer to the next element in a list.
         */
        Node next;

        /**
         * Constructor with one parameter.
         * @param _value - the value of an element.
         */
        Node(int _value) {
            this.value = _value;
            this.next = null;
        }
    }

    /**
     * The pointer to the beginning of the list.
     */
    private Node head;

    /**
     * The pointer to the ending of the list.
     */
    private Node end;

    /**
     * The quantity of elements in the list.
     */
    private int size;

    /**
     * Default constructor. Creates an empty list.
     */
    MyLinkedList() {
        this.head = null;
        this.end = null;
        this.size = 0;
    }

    /**
     * Allows you to add a new element to the beginning of the list.
     * @param _value - the value of a new element to add.
     */
    public void addToHead(int _value) {
        if (!this.has(_value)) {
            Node element = new Node(_value);
            if (this.head == null) {
                this.end = element;
            } else {
                element.next = this.head;
            }
            this.head = element;
            this.size++;
        }
    }

    /**
     * Allows you to add a new element to the ending of the list.
     * @param _value - the value of a new element to add.
     */
    public void addToEnd(int _value) {
        if (!this.has(_value)) {
            Node element = new Node(_value);
            if (this.end == null) {
                this.head = element;
            } else {
                this.end.next = element;
            }
            this.end = element;
            this.size++;
        }
    }

    /**
     * Allows you to delete an element from the list.
     * @param _value - the value of element to delete.
     */
    public void delete(int _value) {
        if (this.has(_value)) {
            if (this.size == 1 && this.head.value == _value) {
                this.head = null;
                this.end = null;
                this.size = 0;
            } else if (this.size > 1) {
                if (this.head.value == _value) {
                    this.head = this.head.next;
                    this.size--;
                } else {
                    Node temp = this.head;
                    while (temp.next.value != _value) {
                        temp = temp.next;
                    }

                    if (temp.next == this.end) {
                        this.end = temp;
                    }
                    temp.next = temp.next.next;
                }
            }

        }
    }

    /**
     * Allows you to check if the list has element with certain value.
     * True - the list have element with given value.
     * False - the list have no element with given value.
     * @param _value - value to check if is it in a list.
     * @return boolean
     */
    public boolean has(int _value) {
        if (this.size > 0) {
            Node temp = this.head;
            while (temp != null) {
                if (temp.value == _value) {
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }
        return false;
    }

    /**
     * The redefined method. Allows you to display the list to the console.
     */
    @Override
    public String toString() {
        if (this.size > 0) {
            StringBuilder result = new StringBuilder();
            Node temp = this.head;

            while (temp != null) {
                result.append(temp.value);
                if (temp.next != null) {
                    result.append(", ");
                }
                temp = temp.next;
            }

            return "Список: " + result + "\nКоличество элементво: " + this.size;
        } else {
            return "Список пуст.";
        }
    }
}
