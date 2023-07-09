package HashTable;

import java.security.spec.RSAOtherPrimeInfo;

public class HashTableTest {
    public static void main(String[] args) {
        System.out.println("Hash Table Quadratische Sondierung");
        HashTableQuadratischeSondierung hashTableQuadratischeSondierung = new HashTableQuadratischeSondierung(7);
        hashTableQuadratischeSondierung.put(15);
        hashTableQuadratischeSondierung.put(38);
        hashTableQuadratischeSondierung.put(53);
        hashTableQuadratischeSondierung.put(75);
        hashTableQuadratischeSondierung.put(86);
        hashTableQuadratischeSondierung.put(100);
        hashTableQuadratischeSondierung.put(115);


        System.out.println(hashTableQuadratischeSondierung);

        System.out.println("Hash Table Linked List Sondierung");
        System.out.print("Before Adding: ");
        HashTableLinkedListSondierung hashTableLinkedListSondierung = new HashTableLinkedListSondierung(7);
        System.out.println(hashTableLinkedListSondierung);
        hashTableLinkedListSondierung.put(15);
        hashTableLinkedListSondierung.put(38);
        hashTableLinkedListSondierung.put(53);
        hashTableLinkedListSondierung.put(75);
        hashTableLinkedListSondierung.put(86);
        hashTableLinkedListSondierung.put(100);
        hashTableLinkedListSondierung.put(115);
        System.out.println("After Adding:  " +hashTableLinkedListSondierung);

    }
}
