package io.lenur.list;

import java.util.HashSet;
import java.util.Set;

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

    public static Node findMiddleNodeImproved(Node node) {
        if (node == null || !node.hasNext()) {
            return node;
        }

        int index = 1;
        Node head = node;
        Node middleNode = null;
        while (head.hasNext()) {
            if (index % 2 == 0) {
                middleNode = head;
            }

            head = head.getNext();
            index++;
        }

        return middleNode;
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

    public static Node findNthNode(Node node, int nth) {
        if (node == null) {
            return null;
        }

        int index = 1;
        Node temp = node;
        while (temp.hasNext()) {
            temp = temp.getNext();
            index++;
        }

        for (int i = 0; i < index - nth; i++) {
            node = node.getNext();
        }

        return node;
    }

    public static boolean hasLoop(Node node) {
        Set<Node> nodes = new HashSet<>();
        nodes.add(node);

        while (node.hasNext()) {
            node = node.getNext();
            if (nodes.contains(node)) {
                return true;
            }

            nodes.add(node);
        }

        return false;
    }

    public static Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next;

        while (current != null) {
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        node = prev;

        return node;
    }

    public static boolean isCircular(Node node) {
        if (node == null || !node.hasNext()) {
            return false;
        }

        Node current = node;
        do {
            current = current.getNext();
        } while (current != null && node != current);

        return current == node;
    }

    public static boolean isCyclic(Node node) {
        Node begin = node;
        Node tail = node;

        while (tail != null && tail.hasNext()) {
            begin = begin.getNext();
            tail = tail.getNext().getNext();

            if (tail == begin) {
                return true;
            }
        }

        return false;
    }
}
