package io.lenur.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListHelperReverseTest {
    @Test
    public void reverse() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.setNext(node2);
        node2.setNext(node3);

        Node node = LinkedListHelper.reverse(node1);

        Assertions.assertEquals(node.getVal(), 3);
        Assertions.assertEquals(node.getNext().getVal(), 2);
        Assertions.assertEquals(node.getNext().getNext().getVal(), 1);
    }
}