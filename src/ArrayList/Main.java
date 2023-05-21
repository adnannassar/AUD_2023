package ArrayList;



public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(100);
        arrayList.add(-1);
        arrayList.add(9);
        arrayList.add(0);
        arrayList.add(77);
        arrayList.add(100);
        arrayList.add(-1);
        arrayList.add(9);
        arrayList.add(0);
        arrayList.add(77);
        System.out.println("capacity after 10 adds: " + arrayList.capacity());
        arrayList.add(150);
        System.out.println("capacity after 11 adds: " + arrayList.capacity());
        System.out.println(arrayList.get(-1));
        System.out.println(arrayList.get(200));
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(5));
        System.out.println(arrayList.get(arrayList.size() - 1)); // 150


        Iterator<Integer> it = arrayList.iterator();
        System.out.print("[");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println("]");
    }
}
