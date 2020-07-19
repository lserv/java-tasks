package io.lenur.bst;

public class HeightBST {
    public int find(Node node) {
        if (node == null) {
            return 0;
        }

        return Math.max(find(node.getLeft()), find(node.getRight())) + 1;
    }
}
