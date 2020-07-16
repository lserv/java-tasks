package io.lenur.list;

public class LinkedListHelper {
    public static Node removeLatestNode(Node node) {
        if (node == null || !node.hasNext()) {
            return null;
        }

        Node prev = node;
        while (node.getNext().hasNext()) {
            prev = node.getNext();
        }
        Node tmp = prev.getNext();
        prev.setNext(null);

        return tmp;
    }
}
