package LinkedList;

public class LinkedList<T> {

    private Node first;

    public int size() {
        int count = 0;
        Node node = first;
        while (node != null) {
            count++;
            node = node.next;
        }

        return count;
    }

    public void add(T value) {
        if (first == null) {
            first = new Node(value);
        } else {
            Node node = first;
            if (node.next != null) {
                node = node.next;
            }
            node.next = new Node(value);
        }
    }

    public T get(int index) {
        Node node = first;
        while (index > 0) {
            index--;
            node = node.next;
        }

        return node.value;
    }

    public T remove(int index) {
        Node node = first;
        Node previous = null;
        while (index > 0) {
            index--;
            previous = node;
            node = node.next;
        }
        if (previous == null) {
            first = node.next;
        } else {
            previous.next = node.next;
        }

        return node.value;
    }

    private class Node {
        private final T value;
        Node next = null;
        public Node(T value) {
            this.value = value;
        }
    }
}