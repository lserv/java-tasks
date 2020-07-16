package io.lenur.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListHelperFindMiddleTest {
    @Test
    public void findMiddleFromNull() {
        Node node = LinkedListHelper.findMiddleNode(null);

        Assertions.assertNull(node);
    }

    @Test
    public void findFromOneNode() {
        Node node = LinkedListHelper.findMiddleNode(new Node(2));

        Assertions.assertEquals(node.getVal(), 2);
    }

    @Test
    public void removeNext() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.setNext(node2);
        node2.setNext(node3);

        Node node = LinkedListHelper.findMiddleNode(node1);

        Assertions.assertEquals(node.getVal(), 2);
    }
}