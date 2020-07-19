package io.lenur.bst;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinMaxTest {
    private final BinarySearchTree bst = new BinarySearchTree();
    private final MinMax minMax = new MinMax();

    {
        bst.insert(10);
        bst.insert(7);
        bst.insert(12);
        bst.insert(6);
        bst.insert(15);
    }

    @Test
    public void findMin() {
        Node node = minMax.findMin(bst.getRoot());

        Assertions.assertNotNull(node);
        Assertions.assertNull(node.getLeft());
        Assertions.assertEquals(6, node.getVal());
    }

    @Test
    public void findMax() {
        Node node = minMax.findMax(bst.getRoot());

        Assertions.assertNotNull(node);
        Assertions.assertNull(node.getRight());
        Assertions.assertEquals(15, node.getVal());
    }
}