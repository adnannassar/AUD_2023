package LinkedList.DoublyLinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> javaLinkedList = new LinkedList<>();
        DoublyLinkedList myLinkedList = new DoublyLinkedList();


        System.out.println("Java isEmpty() --> " + javaLinkedList.isEmpty());
        System.out.println("Mine isEmpty() --> " + myLinkedList.isEmpty());

        System.out.println("Java Size() --> " + javaLinkedList.size());
        System.out.println("Mine Size() --> " + myLinkedList.size());


        javaLinkedList.add(1);
        javaLinkedList.add(2);
        javaLinkedList.add(3);
        javaLinkedList.add(4);

        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);


        System.out.println("Java isEmpty() --> " + javaLinkedList.isEmpty());
        System.out.println("Mine isEmpty() --> " + myLinkedList.isEmpty());

        System.out.println("Java size() --> " + javaLinkedList.size());
        System.out.println("Mine size() --> " + myLinkedList.size());

        System.out.println("Java --> " + javaLinkedList);
        System.out.println("Mine --> " + myLinkedList);


        System.out.println("Java contains(4) --> " +javaLinkedList.contains(4));
        System.out.println("Java contains(5) --> " +javaLinkedList.contains(5));

        System.out.println("Mine contains(4) --> " +myLinkedList.contains(4));
        System.out.println("Mine contains(5) --> " +myLinkedList.contains(5));

        javaLinkedList.add(0, 0);
        System.out.println("Java --> " + javaLinkedList);
        myLinkedList.add(0, 0);
        System.out.println("Mine --> " + myLinkedList);


        javaLinkedList.add(5, 5);
        javaLinkedList.add(6, 6);
        System.out.println("Java --> " + javaLinkedList);
        myLinkedList.add(4, 5);
        myLinkedList.add(100, 6);
        System.out.println("Mine --> " + myLinkedList);

        javaLinkedList.add(3, 10);
        System.out.println("Java --> " + javaLinkedList);
        myLinkedList.add(3, 10);
        System.out.println("Mine --> " + myLinkedList);


        Integer x = 10;
        System.out.println("Java remove(10) --> " +javaLinkedList.remove(x));
        System.out.println("Mine remove(10) --> " +myLinkedList.remove(10));


        System.out.println("Java --> " + javaLinkedList);
        System.out.println("Mine --> " + myLinkedList);

        Integer y = 0;
        System.out.println("Java remove(0) --> " +javaLinkedList.remove(y));
        System.out.println("Mine remove(0) --> " +myLinkedList.remove(0));

        System.out.println("Java --> " + javaLinkedList);
        System.out.println("Mine --> " + myLinkedList);

        Integer z = 6;
        System.out.println("Java remove(6) --> " +javaLinkedList.remove(z));
        System.out.println("Mine remove(6) --> " +myLinkedList.remove(6));

        System.out.println("Java --> " + javaLinkedList);
        System.out.println("Mine --> " + myLinkedList);

        Integer a = -100;
        System.out.println("Java remove(-100) --> " +javaLinkedList.remove(a));
        System.out.println("Mine remove(-100) --> " +myLinkedList.remove(-100));

        System.out.println("Java --> " + javaLinkedList);
        System.out.println("Mine --> " + myLinkedList);



        System.out.println("Java remove_pos(2) --> " +javaLinkedList.remove(2));
        System.out.println("Mine remove_pos(2) --> " +myLinkedList.remove_pos(2));

        System.out.println("Java --> " + javaLinkedList);
        System.out.println("Mine --> " + myLinkedList);












    }
}
