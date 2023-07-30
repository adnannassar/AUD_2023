package Klausurvorbereitung.Listen.Klausur_35;

public class Main {
    public static void main(String[] args) {
        Heap heap = new Heap();

        // Insert keys into the heap
        heap.insert(10);
        heap.insert(20);
        heap.insert(15);
        heap.insert(30);

        // Check heap status and remove keys
        System.out.println("Heap valid: " + heap.istHeap());
        System.out.println("Greatest key: " + heap.groessterSchluessel());
        System.out.println("Removed key: " + heap.remove());

        System.out.println("Heap valid: " + heap.istHeap());
        System.out.println("Greatest key: " + heap.groessterSchluessel());
        System.out.println("Removed key: " + heap.remove());

        System.out.println("Heap valid: " + heap.istHeap());
        System.out.println("Greatest key: " + heap.groessterSchluessel());
        System.out.println("Removed key: " + heap.remove());

        System.out.println("Heap valid: " + heap.istHeap());
        System.out.println("Greatest key: " + heap.groessterSchluessel());
        System.out.println("Removed key: " + heap.remove());
    }
}
