package io.lenur.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListHelperIsCyclicTest {
    @Test
    public void isNoCyclic() {
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        node1.setNext(node2);
        node2.setNext(node3);

        boolean isCyclic = LinkedListHelper.isCyclic(node1);
        Assertions.assertFalse(isCyclic);
    }

    @Test
    public void isCyclic() {
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);
        Node node5 = new Node(40);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(node3);

        boolean isCyclic = LinkedListHelper.isCyclic(node1);
        Assertions.assertTrue(isCyclic);
    }
}