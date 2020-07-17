package io.lenur.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TreeTest {
    private final Tree tree = new Tree();
    private final BinaryTree b1 = new BinaryTree();
    private final BinaryTree b2 = new BinaryTree();
    private final BinaryTree b3 = new BinaryTree();
    private final BinaryTree b4 = new BinaryTree();

    {
        b1.root = new Node(1);
        b1.root.left = new Node(2);
        b1.root.right = new Node(3);

        b2.root = new Node(1);
        b2.root.left = new Node(3);
        b2.root.right = new Node(2);

        b3.root = new Node(2);
        b3.root.left = new Node(4);
        b3.root.right = new Node(5);

        b4.root = new Node(1);
        b4.root.left = new Node(2);
        b4.root.right = new Node(3);
    }

    @Test
    public void isMirror() {
        boolean isMirror = tree.isMirror(b1.root, b2.root);
        Assertions.assertTrue(isMirror);
    }

    @Test
    public void isNotMirror() {
        boolean isMirror = tree.isMirror(b1.root, b3.root);
        Assertions.assertFalse(isMirror);
    }

    @Test
    public void isEqual() {
        boolean isEqual = tree.isEqual(b1.root, b4.root);
        Assertions.assertTrue(isEqual);
    }

    @Test
    public void isNotEqual() {
        boolean isEqual = tree.isEqual(b1.root, b2.root);
        Assertions.assertFalse(isEqual);
    }
}