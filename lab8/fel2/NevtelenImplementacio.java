package lab8.fel2;

import java.util.Vector;

interface Jellemzett {
    public String jellemzo();
}

public class NevtelenImplementacio {

    public static void main(String[] args) {
        Vector jellemzettek = new Vector();

        class Valami implements Jellemzett{
            @Override
            public String jellemzo() {
                return "valamilyen";
            }
        }

        jellemzettek.add(new Valami());
        jellemzettek.add((Jellemzett) () -> "nagy");
        jellemzettek.add((Jellemzett)()-> "kis");
        //jellemzettek.add()

        //Jellemzett jel2 = new Valami();
        //jellemzettek.add(jel1);

        jellemzettek.add(new Jellemzett() {
            @Override
            public String jellemzo() {
                return "szep";
            }

            @Override
            public String toString() {
                return jellemzo();
            }
        });

        jellemzettek.add((Jellemzett) () -> "alma");

        jellemzettek.add((Jellemzett) () -> "Csunya");
        jellemzettek.add((Jellemzett) () -> "Szep");

        for (int i = 0; i < jellemzettek.size(); i++) {
            Jellemzett jel
                    = (Jellemzett) jellemzettek.get(i);
            System.out.println(jel.jellemzo());
        }

        for (Object jel2 : jellemzettek) {
            Jellemzett jel = (Jellemzett) jel2;
            System.out.println(jel.jellemzo());
        }

    }
}
