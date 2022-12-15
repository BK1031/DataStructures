// LinkedList implementation

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;

    // Simple linked list traversal until item is found O(n)
    // Returns index of item or -1 if not found
    public int indexOf(int item) {
        int index = 0;
        var current = head;
        while (current != null) {
            if (current.value == item) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public void addFirst(int item) {
        var node = new Node(item);
        if (head == null) {
            head = tail = node;
        }
        else {
            node.next = head;
            head = node;
        }
    }

    public void addLast(int item) {
        var node = new Node(item);
        if (head == null) {
            head = tail = node;
        }
        else {
            tail.next = node;
            tail = node;
        }
    }

    public void deleteFirst() {
        if (head == null || head == tail) {
            head = tail = null;
            return;
        }
        var second = head.next;
        head.next = null;
        head = second;
    }

    public void deleteLast() {
        if (head == null || head == tail) {
            head = tail = null;
            return;
        }
        var current = head;
        while (current != null) {
            if (current.next == tail) break;
            current = current.next;
        }
        current.next = null;
        tail = current;
    }

    public int size() {
        int size = 0;
        var current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

}