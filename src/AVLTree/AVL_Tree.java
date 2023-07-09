package AVLTree;

import BinarySerachTree.Node;

public class AVL_Tree<T extends Comparable<T>> {

    AVL_Node<T> root;

    boolean heightChanged;


    public boolean isEmpty() {
        return root == null;
    }

    public boolean search(T data) {
        AVL_Node<T> ptr = root;
        while (ptr != null) {
            int comp = data.compareTo(ptr.data);
            if (comp == 0) {
                return true;
            } else if (comp > 0) {
                ptr = ptr.right;
            } else {
                ptr = ptr.left;
            }
        }
        return false;
    }


    public void add(T value) {
        if (isEmpty()) {
            root = new AVL_Node<>(value, null, null);
        } else {
            add(value, root);
        }
    }

    private void add(T value, AVL_Node<T> root) {
        if (root.balance == 0) {

        }

        if (root.balance < -1) {

        }
        else if (root.balance > 1){

        }
    }

    private AVL_Node<T> rightRotation(AVL_Node<T> k, AVL_Node<T> x) {
        k.left = x.right;
        x.right = k;
        k.balance = 0;
        return x;
    }

    private AVL_Node<T> leftRotation(AVL_Node<T> k, AVL_Node<T> x) {
        k.left = x.right;
        x.right = k;
        k.balance = 0;
        return x;
    }

    private AVL_Node<T> leftRightRotation(AVL_Node<T> k, AVL_Node<T> x) {
        leftRotation(k, x);
        return rightRotation(k, x);
    }

}
