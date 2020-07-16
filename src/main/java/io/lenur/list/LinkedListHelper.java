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
}
