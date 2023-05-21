package CircularQueue;

public class Queue {
    private int first, last;
    private int[] array;

    public Queue(int size) {
        this.first = this.last = -1;
        this.array = new int[size];
    }

    public boolean isEmpty() {
        return last == -1 && first == -1;
    }

    public boolean isFull() {
        return (first == -1 && last == array.length - 1) || (first == last && first != -1);
    }

    public void enqueue(int value) {
        if (!isFull()) {
            last = (last + 1) % array.length;
            array[last] = value;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            return -1;
        } else {
            first = (first + 1) % array.length;
            int tempData = array[first];
            // reset pointers
            if (first == last) {
                first = last = -1;
            }
            return tempData;
        }
    }
}
