package lab6.fel2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class ArrayListvsLinkedList {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        // ArrayList add
        long startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("ArrayList add:  " + duration);

        // LinkedList add
        startTime = System.nanoTime();
        for (int j = 0; j < 100000; j++) {
            linkedList.add(j);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList add: " + duration);

        // ArrayList get
        startTime = System.nanoTime();
        for (int k = 0; k < 10000; k++) {
            arrayList.get(k);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList get:  " + duration);
        // LinkedList get
        startTime = System.nanoTime();
        for (int l = 0; l < 10000; l++) {
            linkedList.get(l);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList get: " + duration);

        // ArrayList remove

        startTime = System.nanoTime();
        ListIterator iter4 = arrayList.listIterator(arrayList.size());
        while (iter4.hasPrevious()) {
            iter4.previous();
            iter4.remove();
        }


        //System.out.println(arrayList);
/*
        for (int m = 9999; m >= 0; m--) {
            arrayList.remove(m);
        }

 */


        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList remove:  " + duration);
        // LinkedList remove
        startTime = System.nanoTime();
        for (int n = 9999; n >= 0; n--) {
            linkedList.remove(n);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList remove: " + duration);
    }

}
