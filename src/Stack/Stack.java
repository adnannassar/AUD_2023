package Stack;


import java.util.ArrayList;

public class Stack<T> {

    private static class StackNode<T>{
        private T value;
        private StackNode<T> next;

        public StackNode(T value) {
            this.value = value;
        }
    }
    private StackNode<T> top;
    private int size;


    public Stack() {
        this.size = 0;
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size(){
        return this.size;
    }

    public void push(T value) {
        StackNode<T> node = new StackNode<T>(value);
        node.next = top;
        top = node;
        size++;
    }

    T pop() {
       if(!isEmpty()){
           T returnValue = top.value;
           top = top.next;
           size--;
           return returnValue;
       }else{
           return null;
       }
    }

    void print(){
        if(!isEmpty()){
            StackNode<T> ptr = top;
            while (ptr != null){
                System.out.println(ptr.value);
                ptr = ptr.next;
            }
        }
    }

    void printReverse(){
        if(!isEmpty()) {
            Stack<T> tempStack = new Stack<T>();
            StackNode<T> ptr = top;
            while (ptr != null) {
                tempStack.push(ptr.value);
                ptr = ptr.next;
            }
            while (!tempStack.isEmpty()) {
                System.out.println(tempStack.pop());
            }
        }
    }
}
