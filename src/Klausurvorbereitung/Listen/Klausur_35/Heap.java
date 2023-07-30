package Klausurvorbereitung.Listen.Klausur_35;

public class Heap {
    private HKnoten wurzel;

    public void insert(int key) {
        HKnoten newNode = new HKnoten();
        newNode.schluessel = key;
        if (wurzel != null) {
            newNode.kinder[0] = wurzel;
        }
        wurzel = newNode;
    }
    public int remove() {
        assert(wurzel != null);
        assert(istHeap());
        int rootKey = wurzel.schluessel;
        wurzel = wurzel.kinder[0];
        return rootKey;
    }


    public int groessterSchluessel() {
        assert (wurzel != null);
        assert (istHeap());

        // For a max heap, the greatest key is at the root
        return wurzel.schluessel;
    }

    public boolean istHeap() {
        return istHeap(wurzel);
    }

    private boolean istHeapKnoten(HKnoten knoten) {
        if (knoten.kinder[0] != null && knoten.schluessel < knoten.kinder[0].schluessel) return false;
        if (knoten.kinder[1] != null && knoten.schluessel < knoten.kinder[1].schluessel) return false;

        // If neither left nor right child violates heap property, it's a heap node
        return true;
    }

    private boolean istHeap(HKnoten knoten) {
        if (knoten == null) return true;

        if (!istHeapKnoten(knoten)) return false;

        // Check the left and right subtrees
        return istHeap(knoten.kinder[0]) && istHeap(knoten.kinder[1]);
    }
}
