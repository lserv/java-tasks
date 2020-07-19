package io.lenur.bst;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTreeTest {
    @Test
    public void whenInitMustBeEmpty() {
        BinarySearchTree bst = new BinarySearchTree();

        Assertions.assertTrue(bst.isEmpty());
    }

    @Test
    public void insertNodes() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(10);
        bst.insert(7);
        bst.insert(12);

        Node root = bst.getRoot();

        Assertions.assertEquals(10, root.getVal());

        Assertions.assertNotNull(root.getLeft());
        Assertions.assertEquals(7, root.getLeft().getVal());

        Assertions.assertNotNull(root.getRight());
        Assertions.assertEquals(12, root.getRight().getVal());
    }

    @Test
    public void searchRootNode() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(10);
        bst.insert(7);
        bst.insert(12);

        Node node = bst.search(10);
        Assertions.assertEquals(10, node.getVal());

        Assertions.assertNotNull(node.getLeft());
        Assertions.assertEquals(7, node.getLeft().getVal());

        Assertions.assertNotNull(node.getRight());
        Assertions.assertEquals(12, node.getRight().getVal());
    }

    @Test
    public void searchLeftNode() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(10);
        bst.insert(7);

        Node node = bst.search(7);
        Assertions.assertEquals(7, node.getVal());
        Assertions.assertNull(node.getLeft());
        Assertions.assertNull(node.getRight());
    }

    @Test
    public void searchRightNode() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(10);
        bst.insert(12);

        Node node = bst.search(12);
        Assertions.assertEquals(12, node.getVal());
        Assertions.assertNull(node.getLeft());
        Assertions.assertNull(node.getRight());
    }
}