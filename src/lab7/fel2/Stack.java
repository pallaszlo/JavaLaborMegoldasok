package lab7.fel2;

import java.util.Iterator;


public class Stack<T> implements Iterable<T> {
    private T[] elements;
    private int lastIndex;

    /**
     * dfdfdfd
     */
    public Stack() {
        elements = (T[]) new Object[1];
        lastIndex = 0;
    }

    public boolean isEmpty() {
        return lastIndex == 0;
    }

    public int length() {
        return lastIndex;
    }

    public void push(T item) {
        if (lastIndex == elements.length) {
            resize(2 * elements.length);
        }
        elements[lastIndex] = item;
        lastIndex++;
    }

    public T pop() {
        T item = elements[--lastIndex];
        elements[lastIndex] = null;
        if (lastIndex > 0 && lastIndex == elements.length / 4) {
            resize(elements.length / 2);
        }
        return item;
    }

    /**
     * @param newSize
     */
    private void resize(int newSize) {
        T[] temp = (T[]) new Object[newSize];
        for (int i = 0; i < lastIndex; i++) {
            temp[i] = elements[i];
        }
        elements = temp;
    }


    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int i = lastIndex;

            @Override
            public boolean hasNext() {
                return i > 0;
            }

            @Override
            public T next() {
                return elements[--i];
            }
        };
    }
}
