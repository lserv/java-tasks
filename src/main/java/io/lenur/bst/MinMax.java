package io.lenur.bst;

public class MinMax {
    public Node findMax(Node node) {
        if (node.getRight() != null) {
            return findMax(node.getRight());
        }

        return node;
    }

    public Node findMin(Node node) {
        if (node.getLeft() != null) {
            return findMin(node.getLeft());
        }

        return node;
    }
}
