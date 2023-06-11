package BinarySerachTree;

public class BinarySearchTree<T extends Comparable<T>> {
    Node<T> root;


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
}
