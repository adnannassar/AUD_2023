package AVLTree;

import BinarySerachTree.Node;

public class AVL_Tree<T extends Comparable<T>> {

    AVL_Node<T> root;

    public boolean isEmpty() {
        return root == null;
    }

    public void add(T value) {
        if(isEmpty()){
            root = new AVL_Node<>(value, null, null);
        }else{
            add(value, root);
        }
    }

    private void add(T value , AVL_Node<T> root) {

    }

    // add
    // checkBalance
    // left rotation , right rotation, left-right rotation, right-left rotation
    // search
    // traverse
    // tools like number of leaves, height, max, min, depth, size
    // delete
}
