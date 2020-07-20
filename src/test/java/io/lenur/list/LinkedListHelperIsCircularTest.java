package io.lenur.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListHelperIsCircularTest {
    @Test
    public void isCircularNull() {
        boolean isCircular = LinkedListHelper.isCircular(null);

        Assertions.assertFalse(isCircular);
    }

    @Test
    public void isCircularNextNull() {
        boolean isCircular = LinkedListHelper.isCircular(new Node(2));

        Assertions.assertFalse(isCircular);
    }

    @Test
    public void whenLatestHasNoLinkToFirstThenReturnFalse() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.setNext(node2);
        node2.setNext(node3);

        boolean isCircular = LinkedListHelper.isCircular(node1);

        Assertions.assertFalse(isCircular);
    }

    @Test
    public void whenLatestHasLinkToFirstThenReturnTrue() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node1);

        boolean isCircular = LinkedListHelper.isCircular(node1);

        Assertions.assertTrue(isCircular);
    }
}