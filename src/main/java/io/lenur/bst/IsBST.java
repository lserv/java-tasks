package io.lenur.bst;

public class IsBST {
    public boolean test(Node node) {
        return test(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean test(Node node, int min, int max) {
        if (node == null) {
            return true;
        }

        int val = node.getVal();
        return val > min
                && val < max
                && test(node.getLeft(), min, val)
                && test(node.getRight(), val, max);
    }
}
