package LinkedList;

public class LinkedList<T> {

    private int size = 0;
    private Node first;

    public int size() {
        return size;
    }

    public void add(T value) {
        size++;
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
        return first.value;
    }

    private class Node {
        private final T value;
        Node next = null;
        public Node(T value) {
            this.value = value;
        }
    }
}
