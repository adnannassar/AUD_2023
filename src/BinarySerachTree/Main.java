package BinarySerachTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree<String> binarySearchTree = new BinarySearchTree<>();
        System.out.println(binarySearchTree.traversePreOrder());
        binarySearchTree.add("E");
        binarySearchTree.add("D");
        binarySearchTree.add("S");
        binarySearchTree.add("O");
        binarySearchTree.add("Z");
        binarySearchTree.add("P");
        binarySearchTree.add("A");
        binarySearchTree.add("R");
        binarySearchTree.add("Q");
        System.out.println("PreOrder:  " +  binarySearchTree.traversePreOrder());
        System.out.println("InOrder :  " + binarySearchTree.traverseInOrder());
        System.out.println("PostOrder : " + binarySearchTree.traversePostOrder());


        String letter1 = "R";
        String letter2 = "C";
        System.out.println("Searching " + letter1 + " --> " + binarySearchTree.search(letter1));
        System.out.println("Searching " + letter2 + " --> " + binarySearchTree.search(letter2));
    }
}
