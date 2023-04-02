package lab1;

import static java.lang.Math.pow;

public class Fel6 {

    static int dupla(int n) {
        return n * 2;
    }

    static double korTer(double sugar) {
        return pow(sugar, 2) * Math.PI;
    }

    static double gombTerf(double sugar) {
        return 4 * Math.pow(sugar, 3) * Math.PI / 3;
    }

    static boolean pozitiv(double n) {
        return n > 0;
    }

    public static void main(String args[]) {
        System.out.println(dupla(5));
        int r = 12, x = -7;
        System.out.println("A kör területe: " + korTer(r));
        r = 3;
        System.out.println("A gömb térfogata: " + gombTerf(r));
        if (pozitiv(x)) {
            System.out.println("Pozitív");
        } else {
            System.out.println("Nem pozitív");
        }
    }

}
