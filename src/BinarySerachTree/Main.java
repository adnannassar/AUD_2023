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
        System.out.println("PreOrder Recursive: " + binarySearchTree.traversePreOrder());
        System.out.print("PreOrder Iterative: ");
        binarySearchTree.traversePreOrderIterative();
        System.out.println("\nInOrder :  " + binarySearchTree.traverseInOrder());
        System.out.println("PostOrder : " + binarySearchTree.traversePostOrder());


        String letter1 = "R";
        String letter2 = "C";
        System.out.println("Searching Recursive " + letter1 + " --> " + binarySearchTree.search(letter1));
        System.out.println("Searching Recursive " + letter2 + " --> " + binarySearchTree.search(letter2));
        System.out.println("Searching Iterative " + letter1 + " --> " + binarySearchTree.searchIterative(letter1));
        System.out.println("Searching Iterative " + letter2 + " --> " + binarySearchTree.searchIterative(letter2));

        System.out.println("Height of Tree = " + binarySearchTree.getHeight());
        System.out.println("Size of Tree = " + binarySearchTree.getSize());
        System.out.println("Min of Tree = " + binarySearchTree.getMin());
        System.out.println("Max of Tree = " + binarySearchTree.getMax());
        System.out.println("Number of Leaves = " + binarySearchTree.numberOfLeaves());

    }
}
