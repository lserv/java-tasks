package io.lenur.list;

public class Node {
    private final int val;
    private Node next;

    public Node(int val) {
        this.val = val;
    }

    public boolean hasNext() {
        return next != null;
    }

    public void linkNext(Node node) {
        next = node;
    }

    public int getVal() {
        return val;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node node) {
        next = node;
    }
}