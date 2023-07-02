package AVLTree;

public class AVL_Node<T extends Comparable<T>> {
    T data;
    AVL_Node<T> left;
    AVL_Node<T> right;

    public AVL_Node(T data, AVL_Node<T> left, AVL_Node<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
