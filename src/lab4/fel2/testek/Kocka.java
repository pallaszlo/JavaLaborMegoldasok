package lab4.fel2.testek;

class Kocka extends Hasab {
    
    public Kocka(double magassag) {
        super(magassag);
        this.magassag = magassag;
    } 

    @Override
    public double alapTerulet(){
        return magassag*magassag;
    }

    @Override
    public String toString() {
        return "kocka: " + magassag;
    }
}