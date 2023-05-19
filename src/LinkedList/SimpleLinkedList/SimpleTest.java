package LinkedList.SimpleLinkedList;

public class SimpleTest {
    public static void main(String[] args) {
        SimpleLinkedList myLinkedList = new SimpleLinkedList();
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(1);
        myLinkedList.add(4);

        System.out.println(myLinkedList);

        myLinkedList.sort();
        System.out.println(myLinkedList);
    }
}
