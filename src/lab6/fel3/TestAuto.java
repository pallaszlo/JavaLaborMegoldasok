package lab6.fel3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestAuto {
    public static void main(String[] args) {
        ArrayList<Auto> autok = new ArrayList<>();

        autok.add(new Auto(4, 230, 10));
        autok.add(new Auto(4, 250, 8));
        autok.add(new Auto(6, 120, 6));
        autok.add(new Auto(16, 30, 7));
        autok.add(new Auto(2, 50, 1));

        System.out.println("Rendezes elott\n");
        for (Auto auto : autok) {
            System.out.println(auto);
        }

        Collections.sort(autok);
        //Collections.sort(autok, Collections.reverseOrder());

        System.out.println("Rendezes utan\n");
        for (Auto auto : autok) {
            System.out.println(auto);
        }

        //Collections.sort(autok, new BiztonsagComparator());
        autok.sort(new BiztonsagComparator());
        //Collections.reverse(autok);

        System.out.println("Rendezes biztonsag szerint\n");
        for (Auto auto : autok) {
            System.out.println(auto);
        }

        autok.sort((Auto a1, Auto a2) -> Integer.compare(a1.getKerekSzam(), a2.getKerekSzam()));
        for (Auto auto : autok) {
            System.out.println(auto);
        }

        autok.sort(Comparator.comparing(Auto::getBiztonsag));
        for (Auto auto : autok) {
            System.out.println(auto);
        }

        System.out.println("Névtelen osztályok");

        Comparator<Auto> kerekszam = new Comparator<Auto>() {
            @Override
            public int compare(Auto o1, Auto o2) {
                return Integer.compare(o1.getKerekSzam(), o2.getKerekSzam());
            }
        };

        autok.sort(new Comparator<Auto>() {
            @Override
            public int compare(Auto o1, Auto o2) {
                return 0;
            }
        });



    }
}
