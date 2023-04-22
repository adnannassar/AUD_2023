package LinkedList;

public class SimpleLinkedList {
    Node head;


    public boolean isEmpty() {
        return head == null;
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
        Node newNode = new Node(newValue, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = newNode;
        }
    }

    public void add(int index, int element) {
        Node newNode = new Node(element, null);
        if (index < 0) {
            System.out.println("Invalid Index!");
        } else if (index == 0) {
            if (isEmpty()) {
                add(element);
            } else {
                newNode.next = head;
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
}
