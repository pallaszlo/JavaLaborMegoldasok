package lab4.fel2.testek;


abstract class Hasab implements Test{

    protected double magassag;
    
    public Hasab(double magassag){
        this.magassag = magassag;
    }
    
    public abstract double alapTerulet();

    
    @Override
    public double terfogat(){
        return alapTerulet() * magassag;
    }
    
    public int valami(){
        return 0;
    }
    
}