package LinkedList.DoublyLinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        list.add(5); // [5]
        list.add(10); // [5, 10]
        list.add(15); // [5, 10, 15]

        System.out.println(list); //  print [5, 10, 15]

        System.out.println(list); //  print [0, 5, 7, 10, 15, 20]

        list.remove_pos(0); // [5, 7, 10, 15, 20]
        list.remove_pos(2); // [5, 7, 15, 20]
        list.remove_pos(list.size() - 1); // [5, 7, 15]

        System.out.println(list.toString()); //  print [5, 7, 15]
    }


}
