package io.lenur.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListGetLengthTest {
    @Test
    public void whenPassNullThanGetZero() {
        int length = LinkedListHelper.getLength(null);

        Assertions.assertEquals(0, length);
    }

    @Test
    public void whenPassCyclicThanGetMinusOne() {
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node2);

        int length = LinkedListHelper.getLength(node1);

        Assertions.assertEquals(-1, length);
    }

    @Test
    public void getLength() {
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);

        int length = LinkedListHelper.getLength(node1);

        Assertions.assertEquals(4, length);
    }
}