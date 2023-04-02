package lab7.fel1;

import java.util.Iterator;

public class TestCustomArray {
    public static void main(String[] args) {
        Integer[] intList = {1, 2, 3, 4, 5,6 };
        CustomArray<Integer> iArray = new CustomArray<>(intList);
        Iterator i = iArray.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        Double[] doubleList = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0 };
        CustomArray<Double> dArray = new CustomArray<>(doubleList);
        Iterator d = dArray.iterator();
        while(d.hasNext()){
            System.out.println(d.next());
        }

        String[] stringList = {"egy", "ketto", "harom", "negy", "ot"};
        CustomArray<String> sArray = new CustomArray<>(stringList);
        Iterator s = sArray.iterator();
        while(s.hasNext()){
            System.out.println(s.next());
        }
    }
}
