package io.lenur.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListHelperHasLoopTest {
    @Test
    public void hasNoLoop() {
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        node1.setNext(node2);
        node2.setNext(node3);

        boolean hasLoop = LinkedListHelper.hasLoop(node1);
        Assertions.assertFalse(hasLoop);
    }

    @Test
    public void hasLoop() {
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node1);

        boolean hasLoop = LinkedListHelper.hasLoop(node1);
        Assertions.assertTrue(hasLoop);
    }
}