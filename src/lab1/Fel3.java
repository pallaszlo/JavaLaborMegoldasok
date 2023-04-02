package lab1;

import java.util.Scanner;


public class Fel3 {

    public static void main(String[] args) {
        //int szam = 1115;
        Scanner sc = new Scanner(System.in);
        int szam = sc.nextInt();
        if (szam >= 1000 && szam <= 2000 && szam % 2 == 0) {
            System.out.println("Jó szám");
        } else {
            System.out.println("Nem jú szám");
        }
    }
}
