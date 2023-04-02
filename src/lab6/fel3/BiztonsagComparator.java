package lab6.fel3;

import java.util.Comparator;

public class BiztonsagComparator implements Comparator<Auto> {
    @Override
    public int compare(Auto o1, Auto o2) {
        return Integer.compare(o1.getBiztonsag(), o2.getBiztonsag());
    }
}
