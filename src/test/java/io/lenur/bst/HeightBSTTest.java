package io.lenur.bst;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HeightBSTTest {
    private final BinarySearchTree bst = new BinarySearchTree();
    private final BinarySearchTree bst1 = new BinarySearchTree();
    private final HeightBST heightBST = new HeightBST();

    {
        bst.insert(10);
        bst.insert(7);
        bst.insert(12);

        bst1.insert(10);
        bst1.insert(7);
        bst1.insert(12);
        bst1.insert(6);
        bst1.insert(12);
    }

    @Test
    public void evaluateHeight() {
        int height = heightBST.find(bst.getRoot());

        Assertions.assertEquals(2, height);
    }

    @Test
    public void evaluateHeightBiggerBST() {
        int height = heightBST.find(bst1.getRoot());
        Assertions.assertEquals(3, height);
    }
}