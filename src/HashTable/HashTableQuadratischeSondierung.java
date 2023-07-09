package HashTable;

public class HashTableQuadratischeSondierung {
    private int[] table;
    int n;

    public HashTableQuadratischeSondierung(int n) {
        this.n = n;
        this.table = new int[n];
        for (int i = 0; i < n; i++) {
            this.table[i] = -1;
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
        if (table[index] == -1) {
            table[index] = k;
        } else {
            int i = 1;
            int counter = 0;
            while (counter < n) {
                index = hash((k + (int)Math.pow(i, 2)) % n);
                if (table[index] == -1) {
                    table[index] = k;
                    break;
                }
                i++;
                counter++;
            }
            if(counter == n){
                System.out.println("Hash table is full, cannot insert anymore");
            }
        }
    }


    public int indexOf(int k) {
        for (int i = 0; i < table.length; i++) {
            if (table[i] == k) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        String erg = "";
        for (int i = 0; i < table.length; i++) {
            erg += table[i] + "\t";
        }
        erg += "\n";
        return erg;
    }
}
