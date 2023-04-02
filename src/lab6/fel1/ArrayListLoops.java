package lab6.fel1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListLoops {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hetfo");
        list.add("Kedd");
        list.add("Szerda");
        list.add("Csutortok");
        list.add("Pentek");
        list.add("Szombat");
        list.add("Vasarnap");


        System.out.println(list.contains("Szombat"));
        list.set(0, "H");
        System.out.println(list.indexOf("Vasarnap"));

        System.out.println("For ciklus");
        for (var nap : list) {
            System.out.println(nap);
            nap.toUpperCase();
        }

        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            String str = iter.next();
            if (str.equals("Szombat")) {
                iter.remove();
            }
        }

        ListIterator<String> iter3 = list.listIterator();
        while (iter3.hasNext()) {
            String str = iter3.next();
            if (str.equals("Szombat")) {
                //iter.remove();
            }
        }

        System.out.println("forEach lambda kifejezes");
        list.forEach((nap) -> System.out.println(nap));
/*
        Iterator iter = list.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        */

        System.out.println("ListIterator");
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("ListIterator");
        ListIterator<String> iterator2 = list.listIterator(list.size());
        while (iterator2.hasPrevious()) {
            System.out.println(iterator2.previous());
        }

        int[] numbers = {44, 33, 22, 11};
        for (int num : numbers) {
            num *= 2;
        }
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

}
