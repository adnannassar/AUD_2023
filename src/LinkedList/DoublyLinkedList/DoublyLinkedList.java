package LinkedList.DoublyLinkedList;


public class DoublyLinkedList<T extends Comparable<T>> {
    Node<T> head;
    Node<T> last;


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
                ptr = ptr.getNext();
                counter++;
            }
            return counter;
        }
    }


    // append anfügen
    public void add(T newValue) {
        Node newNode = new Node(newValue, null, null);
        if (isEmpty()) {
            head = last = newNode;
        } else {
            Node ptr = head;
            while (ptr.getNext() != null) {
                ptr = ptr.getNext();
            }
            ptr.setNext(newNode);
            newNode.setPrevious(ptr);
            last = newNode;
        }
    }

    public void add(int index, T element) {
        if (index < 0 || index > size()) {
            System.out.println("Invalid Index!");
            return;
        }

        Node newNode = new Node(element, null, null);
        if (index == 0) {
            newNode.setNext(head);
            newNode.setPrevious(null);
            if (head != null) {
                head.setPrevious(newNode);
            }
            head = newNode;
            if (last == null) {
                last = newNode;
            }
        } else {
            Node ptr = head;
            for (int i = 0; i < index - 1; i++) {
                ptr = ptr.getNext();
            }
            newNode.setNext(ptr.getNext());
            newNode.setPrevious(ptr);
            if (ptr.getNext() != null) {
                ptr.getNext().setPrevious(newNode);
            } else {
                last = newNode;
            }
            ptr.setNext(newNode);
        }
    }

    private String toStringHelper() {
        String erg = "[";
        Node ptr = head;
        while (ptr.getNext() != null) {
            erg += ptr.getValue() + ", ";
            ptr = ptr.getNext();
        }
        erg += ptr.getNext() + "]";
        return erg;
    }

    @Override
    public String toString() {
        return toStringHelper();
    }

    public boolean contains(T value) {
        Node ptr = head;
        while (ptr != null) {
            if (ptr.getValue().equals(value)) {
                return true;
            }
            ptr = ptr.getNext();
        }
        return false;
    }

    public boolean remove(T value) {
        if (!isEmpty()) {
            Node ptr = head;
            Node before_ptr = null;
            while (ptr != null) {
                if (ptr.getValue().equals(value)) {
                    if (before_ptr == null) {
                        deleteFirst();
                    } else {
                        before_ptr.setNext(ptr.getNext());
                        if (ptr.getNext() != null) {
                            ptr.getNext().setPrevious(before_ptr);
                        } else {
                            last = before_ptr;
                        }
                    }
                    return true;
                }
                before_ptr = ptr;
                ptr = ptr.getNext();
            }
        }
        return false;
    }


    public boolean remove_pos(int pos) {
        if (pos < 0 || pos >= size()) {
            System.out.println("Invalid position!");
            return false;
        }

        if (pos == 0) {
            deleteFirst();
        } else {
            Node ptr = head;
            for (int i = 0; i < pos - 1; i++) {
                ptr = ptr.getNext();
            }
            if (ptr.getNext() == last) {
                last = ptr;
            } else {
                ptr.getNext().getNext().setPrevious(ptr);
            }
            ptr.setNext(ptr.getNext().getNext());
        }
        return true;
    }


    // O(1)
    public void deleteFirst() {
        if (isEmpty()) {
            System.out.println("The list is already empty!");
            return;
        }
        head = head.getNext();
        if (head != null) {
            head.setPrevious(null);
        } else {
            last = null;
        }
    }


    // O(1)
    public void deleteLast() {
        if (isEmpty()) {
            System.out.println("The list is already empty!");
            return;
        }
        last = last.getPrevious();
        if (last != null) {
            last.setNext(null);
        } else {
            head = null;
        }
    }

    public void bubbleSort() {
        if (head == null) {
            return;
        }

        boolean swapped;
        Node<T> ptr1;
        Node<T> ptr2 = null;
        do {
            swapped = false;
            ptr1 = head;

            while (ptr1.getNext() != ptr2) {
                int compareResult = ptr1.getValue().compareTo(ptr2.getValue());
                if (compareResult > 0) {
                    T temp = ptr1.getValue();
                    ptr1.setValue((T) ptr1.getNext().getValue());
                    ptr1.getNext().setValue(temp);
                    swapped = true;
                }

                ptr1 = ptr1.getNext();
            }
            ptr2 = ptr1;
        }
        while (swapped);
    }
}

