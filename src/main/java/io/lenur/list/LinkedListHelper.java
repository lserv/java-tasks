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

    public static Node findMiddleNode(Node node) {
        if (node == null) {
            return null;
        }

        int index = 0;
        Node head = node;
        while (head.hasNext()) {
            head = head.getNext();
            index++;
        }

        if (index == 1) {
            return head;
        }

        int middle = index / 2;
        while (middle > 0) {
            head = node.getNext();
            middle--;
        }

        return head;
    }

    public static Node removeDuplicate(Node node) {
        if (node == null || !node.hasNext()) {
            return node;
        }

        Node current = node;
        while (current.hasNext()) {
            if (current.getVal() == current.getNext().getVal()) {
                current.setNext(current.getNext().getNext());
                current = current.getNext();
            } else {
                current = current.getNext();
            }
        }

        return node;
    }
}
