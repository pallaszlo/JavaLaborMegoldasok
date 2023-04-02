package lab8.fel2;

import java.util.ArrayList;

class Ember {

    private String nev;

    public Ember(String nev) {
        this.nev = nev;
    }

    public String jellemzo() {
        return "Normális";
    }

    public String toString() {
        return nev + " (" + jellemzo() + ")";
    }
}

public class NevtelenKiterjesztes {

    public static void main(String[] args) {
        //Vector emberek = new Vector();
        ArrayList emberek = new ArrayList();

        emberek.add(new Ember("Peter"));
        emberek.add(new Ember("Lajos"){
            @Override
            public String jellemzo() {
                return "nagy";
            }
        });
        emberek.add(new Ember("Anna"){
            @Override
            public String jellemzo() {
                return "szep";
            }
        });



        emberek.add(new Ember("Zoli") {
            @Override
            public String jellemzo() {
                return "Kövér";
            }

            public int eletkor() {
                return 25;
            }
        });
        emberek.add(new Ember("Laci"));
        emberek.add(new Ember("Jenő") {
            @Override
            public String jellemzo() {
                return "Szemüveges";
            }
        });
        System.out.println(emberek);
    }
}
