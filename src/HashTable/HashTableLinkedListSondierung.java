package HashTable;

import java.util.LinkedList;

public class HashTableLinkedListSondierung {
    private LinkedList[] table;
    int n;

    public HashTableLinkedListSondierung(int n) {
        this.n = n;
        this.table = new LinkedList[n];

        for(int i = 0 ; i<n; i++){
            table[i] = new LinkedList();
        }

    }

    private int hash(int k) {
        if (k >= 0) {
            return k % n;
        } else {
            return -1;
        }
    }

    public void put(int k) {
        int index = hash(k);
        table[index].add(k);
    }


    @Override
    public String toString() {
        String erg = "";
        for (int i = 0; i < table.length; i++) {
            erg += table[i] + "\t";
        }
        return erg;
    }
}

