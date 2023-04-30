package LinkedList.DoublyLinkedList;

public class DoublyLinkedList {
    Node head;
    Node last;


    public boolean isEmpty() {
        return head == null && last == null;
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        } else {
            int counter = 0;
            Node ptr = head;
            while (ptr != null) {
                ptr = ptr.next;
                counter++;
            }
            return counter;
        }
    }


    // append anfügen
    public void add(int newValue) {
        Node newNode = new Node(newValue, null, null);
        if (isEmpty()) {
            head = last = newNode;
        } else {
            Node ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = newNode;
            newNode.previous = ptr;
            last = newNode;
        }
    }

    public void add(int index, int element) {
        Node newNode = new Node(element, null, null);
        if (index < 0) {
            System.out.println("Invalid Index!");
        } else if (index == 0) {
            if (isEmpty()) {
                add(element);
            } else {
                newNode.next = head;
                newNode.previous = null;
                head.previous = newNode;
                head = newNode;
            }
        } else if (index >= size() - 1) {
            add(element);
        } else {
            int i = 0;
            Node ptr = head;
            while (i != index - 1) {
                ptr = ptr.next;
                i++;
            }
            newNode.next = ptr.next;
            newNode.previous = ptr;
            newNode.next.previous = newNode;
            ptr.next = newNode;
        }
    }

    private String toStringHelper() {
        String erg = "[";
        Node ptr = head;
        while (ptr.next != null) {
            erg += ptr.value + ", ";
            ptr = ptr.next;
        }
        erg += ptr.value + "]";
        return erg;
    }

    @Override
    public String toString() {
        return toStringHelper();
    }

    public boolean contains(int value) {
        Node ptr = head;
        while (ptr != null) {
            if (ptr.value == value) {
                return true;
            }
            ptr = ptr.next;
        }
        return false;
    }

    public boolean remove(int value) {
        if (!isEmpty()) {
            Node ptr = head;
            Node before_ptr = null;
            while (ptr != null) {
                if (ptr.value == value) {
                    if (before_ptr == null) { // value at the first
                        deleteFirst();
                    } else {
                        before_ptr.next = ptr.next; // value in the middle
                        if (ptr.value == last.value) {
                            last = before_ptr;
                        }
                    }
                    return true;
                }
                before_ptr = ptr;
                ptr = ptr.next;
            }
        }
        return false;
    }

    public boolean remove_pos(int pos) {
        if (pos < 0) {
            return false;
        } else if (pos == 0) {
            deleteFirst();
            return true;
        } else if (pos >= size()) {
            deleteLast();
            return true;
        } else {
            int i = 0;
            Node ptr = head;
            Node before_ptr = head;
            while (i != pos) {
                before_ptr = ptr;
                ptr = ptr.next;
                i++;
            }
            before_ptr.next = ptr.next;
            return true;
        }
    }


    // O(1)
    public void deleteFirst() {
        head = head.next;
    }


    // O(1)
    public void deleteLast() {
        last = last.previous;
    }
}

