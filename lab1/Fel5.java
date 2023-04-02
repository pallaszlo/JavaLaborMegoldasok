package lab1;

public class Fel5 {

    static void vonalhuz() {
        vonalhuz(20, '-');
    }

    static void vonalhuz(int hossz) {
        vonalhuz(hossz, '-');
    }

    static void vonalhuz(int hossz, char ch) {
        for (int i = 1; i <= hossz; i++) {
            System.out.print(ch);
        }
        System.out.println();
    }


    public static void main(String[] args) {
        vonalhuz(50, '@');
        vonalhuz(50, '\u0002');
    }
}
