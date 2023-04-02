package lab1;

public class Fel4 {
    public static void main(String[] args) {
        int i = 1, j = 2, n = 15;
        System.out.println("******************************");
        System.out.println("Az elso " + n + " paros szam kiirasa:");
        while (i <= n) {
            System.out.println(i + ". paros szam: " + j);
            j = j + 2;
            i = i + 1;
        }
        System.out.println("******************************");
    }
}
