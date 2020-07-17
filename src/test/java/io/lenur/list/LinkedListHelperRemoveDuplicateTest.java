package io.lenur.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListHelperRemoveDuplicateTest {
    @Test
    public void removeNull() {
        Node node = LinkedListHelper.removeDuplicate(null);

        Assertions.assertNull(node);
    }

    @Test
    public void removeNotDuplicate() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        node1.setNext(node2);

        Node node = LinkedListHelper.removeDuplicate(node1);
        int index = getAmountOfNodes(node);

        Assertions.assertEquals(2, index);
    }

    @Test
    public void removeDuplicate() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(2);
        Node node4 = new Node(3);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);

        LinkedListHelper.removeDuplicate(node1);
        int index = getAmountOfNodes(node1);

        Assertions.assertEquals(3, node2.getNext().getVal());
        Assertions.assertEquals(3, index);
    }

    private int getAmountOfNodes(Node node) {
        int index = 1;
        while (node.hasNext()) {
            node = node.getNext();
            index++;
        }

        return index;
    }
}