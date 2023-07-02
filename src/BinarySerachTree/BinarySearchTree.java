package BinarySerachTree;

import java.util.Stack;

public class BinarySearchTree<T extends Comparable<T>> {
    private Node<T> root;


    public boolean isEmpty() {
        return root == null;
    }

    public void add(T value) {
        if (isEmpty()) {
            this.root = new Node<T>(value, null, null);
        } else {
            add(value, root);
        }
    }

    private void add(T value, Node<T> root) {
        // 0 oder 1 oder -1
        int compResult = value.compareTo(root.getData());

        if (compResult == 0) {
            return;
        }
        if (compResult > 0) {
            if (root.getRight() == null) {
                root.setRight(new Node<T>(value, null, null));
            } else {
                add(value, root.getRight());
            }
        } else {
            if (root.getLeft() == null) {
                root.setLeft(new Node<T>(value, null, null));
            } else {
                add(value, root.getLeft());
            }
        }
    }


    public boolean search(T value) {
        if (isEmpty()) {
            return false;
        } else {
            return search(value, root);
        }
    }

    private boolean search(T value, Node<T> root) {
        if (root == null) {
            return false;
        }
        // 0 oder 1 oder -1
        int compResult = value.compareTo(root.getData());
        if (compResult == 0) {
            return true;
        } else if (compResult > 0) {
            return search(value, root.getRight());
        } else {
            return search(value, root.getLeft());
        }
    }


    public boolean searchIterative(T value) {
        if (isEmpty()) {
            return false;
        } else {
            Node<T> ptr = root;
            while (ptr != null) {
                // 0 oder 1 oder -1
                int compResult = value.compareTo(root.getData());
                if (compResult == 0) {
                    return true;
                } else if (compResult == 1) {
                    ptr = ptr.getRight();
                } else {
                    ptr = ptr.getLeft();
                }
            }
            return false;
        }
    }

    public String traversePreOrder() {
        if (isEmpty()) {
            return "Tree is empty!";
        } else {
            return traversePreOrder(root);
        }
    }

    private String traversePreOrder(Node<T> root) {
        String result = "";

        // ROOT
        result += root.getData();

        // LEFT
        if (root.getLeft() != null) {
            result += traversePreOrder(root.getLeft());
        }
        // RIGHT
        if (root.getRight() != null) {
            result += traversePreOrder(root.getRight());
        }
        return result;
    }


    public void traversePreOrderIterative() {
        if (!isEmpty()) {
            Stack<Node<T>> stack = new Stack<Node<T>>();
            stack.push(root);
            while (!stack.isEmpty()) {
                Node<T> node = stack.pop();
                System.out.print(node.getData());

                if (node.getRight() != null) {
                    stack.push(node.getRight());
                }
                if (node.getLeft() != null) {
                    stack.push(node.getLeft());
                }
            }
        }
    }


    public String traverseInOrder() {
        if (isEmpty()) {
            return "Tree is empty!";
        } else {
            return traverseInOrder(root);
        }
    }

    private String traverseInOrder(Node<T> root) {
        String result = "";

        // LEFT
        if (root.getLeft() != null) {
            result += traverseInOrder(root.getLeft());
        }

        // ROOT
        result += root.getData();

        // RIGHT
        if (root.getRight() != null) {
            result += traverseInOrder(root.getRight());
        }
        return result;
    }

    public String traversePostOrder() {
        if (isEmpty()) {
            return "Tree is empty!";
        } else {
            return traversePostOrder(root);
        }
    }

    private String traversePostOrder(Node<T> root) {
        String result = "";

        // LEFT
        if (root.getLeft() != null) {
            result += traversePostOrder(root.getLeft());
        }

        // RIGHT
        if (root.getRight() != null) {
            result += traversePostOrder(root.getRight());
        }
        // ROOT
        result += root.getData();
        return result;
    }


    public int getHeight() {
        if (isEmpty()) {
            return 0;
        } else {
            return getHeight(root);
        }
    }


    private int getHeight(Node<T> root) {
        if (root == null) {
            return -1;
        } else {
            return 1 + Math.max(getHeight(root.getLeft()), getHeight(root.getRight()));
        }
    }

    public int getSize() {
        return isEmpty() ? 0 : getSize(root);
    }


    private int getSize(Node<T> root) {
        return root == null ? 0 : 1 + getSize(root.getLeft()) + getSize(root.getRight());
    }


    public T getMin() {
        if (isEmpty()) {
            return null;
        } else {
            Node<T> min = root;
            while (min.getLeft() != null) {
                min = min.getLeft();
            }
            return min.getData();
        }
    }

    public T getMin(Node<T> root) {
        T min = root.getData();
        while (root.getLeft() != null) {
            min = root.getLeft().getData();
            root = root.getLeft();
        }
        return min;
    }

    public T getMax() {
        if (isEmpty()) {
            return null;
        } else {
            Node<T> max = root;
            while (max.getRight() != null) {
                max = max.getRight();
            }
            return max.getData();
        }
    }


    public void remove(T value) { // D
        if (!isEmpty()) {
            root = remove(root, value);
        }else{
            System.out.println("Tree is empty to remove!");
        }
    }

    private Node<T> remove(Node<T> root, T value) {
        if (root == null) {
            return null;
        } else {
            // 0 oder 1 oder -1
            int compResult = value.compareTo(root.getData());
            if (compResult > 0) {
                root.setRight(remove(root.getRight(), value));
            } else if (compResult < 0) {
                root.setLeft(remove(root.getLeft(), value));
            } else {
                // if 0 children or 1 child
                if (root.getLeft() == null) {
                    return root.getRight();
                } else if (root.getRight() == null) {
                    return root.getLeft();
                }

                // if hast two children
                root.setData(getMin(root.getRight()));
                root.setRight(remove(root.getRight(), root.getData()));
            }
        }
        return root;
    }

    public int numberOfLeaves() {
        if (isEmpty()) {
            return 0;
        } else {
            return numberOfLeaves(root);
        }
    }

    private int numberOfLeaves(Node<T> root) {
        if (root == null) {
            return 0;
        }
        if (root.getLeft() == null && root.getRight() == null) {
            return 1;
        }
        return numberOfLeaves(root.getLeft()) + numberOfLeaves(root.getRight());
    }

}
