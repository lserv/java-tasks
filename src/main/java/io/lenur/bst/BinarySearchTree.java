package io.lenur.bst;

public class BinarySearchTree {
    private Node root;

    public boolean isEmpty() {
        return this.root == null;
    }

    public Node search(int val) {
        if (isEmpty()) {
            return null;
        }

        return searchNode(this.root, val);
    }

    public void insert(int val) {
        if (isEmpty()) {
            this.root = new Node(val);
            return;
        }

        insertNode(this.root, val);
    }

    public Node getRoot() {
        return root;
    }

    private Node insertNode(Node root, int val) {
        Node tmpNode;
        if (root.getVal() >= val) {
            if (root.getLeft() == null) {
                root.setLeft(new Node(val));
                return root.getLeft();
            } else {
                tmpNode = root.getLeft();
            }
        } else {
            if (root.getRight() == null) {
                root.setRight(new Node(val));
                return root.getRight();
            } else {
                tmpNode = root.getRight();
            }
        }

        return insertNode(tmpNode, val);
    }

    private Node searchNode(Node root, int val) {
        if (root == null || val == root.getVal()) {
            return root;
        }

        Node tmpNode = (root.getVal() > val)
                ? root.getLeft()
                : root.getRight();

        return searchNode(tmpNode, val);
    }

    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root +
                '}';
    }
}
