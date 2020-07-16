package io.lenur.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListHelperRemoveLastTest {
    @Test
    public void removeNull() {
        Node node = LinkedListHelper.removeLatestNode(null);

        Assertions.assertNull(node);
    }

    @Test
    public void removeNextNull() {
        Node node = LinkedListHelper.removeLatestNode(new Node(2));

        Assertions.assertNull(node);
    }

    @Test
    public void removeNext() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        node1.setNext(node2);

        Node node = LinkedListHelper.removeLatestNode(node1);

        Assertions.assertEquals(node.getVal(), 2);
        Assertions.assertNull(node1.getNext());
    }
}