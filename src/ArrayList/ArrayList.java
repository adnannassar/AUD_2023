package ArrayList;

import java.util.Arrays;

public class ArrayList<T> {
    private static final int defaultSize = 10;
    private T[] array;
    private int size;


    public ArrayList() {
        array = (T[]) new Object[defaultSize];
    }

    public void add(T value) {
        if (size == array.length) {
            resize();
        }
        array[size] = value;
        size++;
    }

    public T get(int i) {
        if (i >= 0 && i < size) {
            return array[i];
        } else {
            return null;
        }
    }

    public int size() {
        return size;
    }

    private void resize() {
        array = Arrays.copyOf(array, array.length * 2);
    }

    public int capacity() {
        return this.array.length;
    }

    private void resizeMine() {
        T[] newArray = (T[]) new Object[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public Iterator<T> iterator() {
        return new MyArrayListIterator();
    }

    private class MyArrayListIterator implements Iterator<T> {
        private int pointer = 0;

        @Override
        public boolean hasNext() {
            return pointer < size;
        }

        @Override
        public T next() {
            if (hasNext()) {
                return array[pointer++];
            } else {
                return null;
            }
        }
    }

}

