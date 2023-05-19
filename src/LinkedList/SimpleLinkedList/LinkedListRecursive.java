package LinkedList.SimpleLinkedList;

public class LinkedListRecursive {


    Node head;
    Node last;


    public boolean isEmpty() {
        return head == null && last == null;
    }

    public int size() {
        return sizeHelper(head);
    }

    private int sizeHelper(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + sizeHelper(node.next);
    }


    public void add(int newValue) {
        if (isEmpty()) {
            head = last = new Node(newValue, null);
        } else {
            addHelper(head, newValue);
        }
    }

    private void addHelper(Node node, int newValue) {
        if (node.next == null) {
            node.next = new Node(newValue, null);
            last = node.next;
            return;
        }
        addHelper(node.next, newValue);
    }


    public void add(int index, int element) {
        if (index < 0) {
            System.out.println("Invalid Index!");
        } else if (index == 0) {
            Node newNode = new Node(element, head);
            head = newNode;
            if (last == null) {
                last = newNode;
            }
        } else {
            head = addHelper(head, index, element, 0);
        }
    }

    private Node addHelper(Node currentNode, int index, int element, int currentIndex) {
        if (currentNode == null) {
            if (currentIndex == index) {
                Node newNode = new Node(element, null);
                last = newNode;
                return newNode;
            }
            return null;
        }

        if (currentIndex + 1 == index) {
            Node newNode = new Node(element, currentNode.next);
            currentNode.next = newNode;
            if (newNode.next == null) {
                last = newNode;
            }
        } else {
            currentNode.next = addHelper(currentNode.next, index, element, currentIndex + 1);
        }
        return currentNode;
    }


    @Override
    public String toString() {
        return "[" + toStringHelper(head) + "]";
    }

    private String toStringHelper(Node node) {
        if (node == null) {
            return "";
        }
        if (node.next == null) {
            return Integer.toString(node.value);
        }
        return node.value + ", " + toStringHelper(node.next);
    }


    public boolean contains(int value) {
        return containsHelper(head, value);
    }

    private boolean containsHelper(Node node, int value) {
        if (node == null) {
            return false;
        }
        if (node.value == value) {
            return true;
        }
        return containsHelper(node.next, value);
    }

    public boolean remove(int value) {
        if (!isEmpty()) {
            return removeHelper(head, null, value);
        }
        return false;
    }

    private boolean removeHelper(Node currentNode, Node previousNode, int value) {
        if (currentNode == null) {
            return false;
        }
        if (currentNode.value == value) {
            if (previousNode == null) { // value is the first node
                head = currentNode.next;
            } else {
                previousNode.next = currentNode.next; // value is in the middle or the last node
                if (currentNode.value == last.value) {
                    last = previousNode;
                }
            }
            return true;
        }
        return removeHelper(currentNode.next, currentNode, value);
    }


    public boolean remove_pos(int pos) {
        if (pos < 0) {
            return false;
        } else {
            return remove_pos_helper(head, null, pos, 0);
        }
    }

    private boolean remove_pos_helper(Node currentNode, Node previousNode, int pos, int currentIndex) {
        if (currentNode == null) {
            return false;
        }
        if (currentIndex == pos) {
            if (previousNode == null) { // removing the first node
                head = currentNode.next;
            } else {
                previousNode.next = currentNode.next; // removing a node in the middle or at the end
                if (currentNode == last) {
                    last = previousNode;
                }
            }
            return true;
        }
        return remove_pos_helper(currentNode.next, currentNode, pos, currentIndex + 1);
    }


    // O(1)
    public void deleteFirst() {
        head = head.next;
    }


    // O(N)
    public void deleteLast() {
        if (!isEmpty()) {
            head = deleteLastHelper(head, null);
        }
    }

    private Node deleteLastHelper(Node currentNode, Node previousNode) {
        if (currentNode.next == null) {
            if (previousNode == null) {
                return null; // there is only one element in the list
            } else {
                previousNode.next = null; // deleting the last node
                last = previousNode;
                return currentNode;
            }
        }
        return deleteLastHelper(currentNode.next, currentNode);
    }


}

