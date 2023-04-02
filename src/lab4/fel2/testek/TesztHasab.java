/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.fel2.testek;

import java.util.ArrayList;

public class TesztHasab {

    public static void main(String[] args) {

        Henger h1 = new Henger(10, 5);
        Henger h2 = new Henger(2, 0.5);
        Henger h3 = new Henger(5, 2);
        Kocka k1 = new Kocka(6);
        Kocka k2 = new Kocka(3.5);
        Kocka k3 = new Kocka(2);

        ArrayList lista1 = new ArrayList(); //Object
        lista1.add(h1);
        lista1.add(h2);
        lista1.add(h3);
        lista1.add(k1);
        lista1.add(k2);
        lista1.add(k3);

        // Kiratas
        for (Object elem : lista1) {
            System.out.println(elem);  // polimorfizmus --> toString
        }

        lista1.forEach(elem -> {
            System.out.println(elem);
        });

        // Osszegezzuk a kockak terfogatat
        double terfogat = 0;
        for (Object elem : lista1) {
            if (elem instanceof Kocka) {
                terfogat += ((Kocka) elem).terfogat();
            }
        }
        System.out.print(terfogat);

        ArrayList<Hasab> lista2 = new ArrayList<>();
        lista2.add(h1);
        lista2.add(h2);
        lista2.add(h3);
        lista2.add(k1);
        lista2.add(k2);
        lista2.add(k3);

        // Osszegezzuk a kockak terfogatat
        double terfogat2 = 0;
        for (Hasab elem : lista2) {
            if (elem instanceof Kocka) {
                terfogat2 += elem.terfogat();   // polimorfizmus --> terfogat
            }
        }
        System.out.printf("Terfogat: %.2f", terfogat2);
        //Test.PI = 45;

        // legnaguobb terfogatu hasab kiiratasa
    }

}
