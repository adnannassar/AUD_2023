package LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList javaLinkedList = new LinkedList();
        SimpleLinkedList myLinkedList = new SimpleLinkedList();


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







    }
}
