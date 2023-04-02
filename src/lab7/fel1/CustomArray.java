package lab7.fel1;

import java.util.Iterator;

public class CustomArray<I> implements Iterable<I> {

    private I[] myArray;

    public CustomArray(I[] myArray) {
        this.myArray = myArray;
    }

    @Override
    public Iterator<I> iterator() {
        return new MyIterator();
    }

    private final class MyIterator implements Iterator<I> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < myArray.length;
        }

        @Override
        public I next() {
            return myArray[index++];
        }
    }

    private final class MyIterator2 implements Iterator<I> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < myArray.length;
        }

        @Override
        public I next() {
            return myArray[updateNextIndex()];
        }

        private int updateNextIndex() {
            int current = index;

            index += 2;
            if (index >= myArray.length && index % 2 == 0) {
                index = 1;
            }

            return current;
        }
    }
}