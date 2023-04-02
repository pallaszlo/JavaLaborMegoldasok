package lab4.fel2.testek;


class Henger extends Hasab {

    public double r;
    
    public Henger(double magassag, double r) {
        super(magassag);
        this.r = r;
    }
    
    @Override
    public double alapTerulet() {
        return r*r*PI;
    }
    
    @Override
    public String toString() {
        return "henger: (" + magassag + "," + r + ")"; 
    }
    
}