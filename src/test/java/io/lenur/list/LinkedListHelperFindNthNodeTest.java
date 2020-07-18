package io.lenur.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListHelperFindNthNodeTest {
    @Test
    public void findNthNodeFromNull() {
        Node node = LinkedListHelper.findNthNode(null, 0);

        Assertions.assertNull(node);
    }

    @Test
    public void findNthNode() {
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        node1.setNext(node2);
        node2.setNext(node3);

        Node node = LinkedListHelper.findNthNode(node1, 2);

        Assertions.assertEquals(20, node.getVal());
        Assertions.assertEquals(30, node.getNext().getVal());
    }
}