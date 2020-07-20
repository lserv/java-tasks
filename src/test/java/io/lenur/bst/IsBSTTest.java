package io.lenur.bst;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsBSTTest {
    private final BinarySearchTree bst = new BinarySearchTree();
    private final Node binaryTree = new Node(1);
    private final IsBST isBST = new IsBST();

    {
        bst.insert(10);
        bst.insert(7);
        bst.insert(12);
        bst.insert(6);
        bst.insert(15);

        Node node1 = new Node(2);
        Node node2 = new Node(3);
        binaryTree.setLeft(node1);
        binaryTree.setRight(node2);
    }

    @Test
    public void isNotBST() {
        boolean bstree = isBST.test(binaryTree);
        Assertions.assertFalse(bstree);
    }

    @Test
    public void isBST() {
        boolean bstree = isBST.test(bst.getRoot());
        Assertions.assertTrue(bstree);
    }
}