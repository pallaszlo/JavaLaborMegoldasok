package lab6.fel3;

public class Auto implements Comparable<Auto>{
    private int kerekSzam;
    private int sebeseg;
    private int biztonsag;

    public Auto(int kerekSzam, int sebeseg, int biztonsag) {
        this.kerekSzam = kerekSzam;
        this.sebeseg = sebeseg;
        this.biztonsag = biztonsag;
    }

    public int getKerekSzam() {
        return kerekSzam;
    }

    public void setKerekSzam(int kerekSzam) {
        this.kerekSzam = kerekSzam;
    }

    public int getSebeseg() {
        return sebeseg;
    }

    public void setSebeseg(int sebeseg) {
        this.sebeseg = sebeseg;
    }

    public int getBiztonsag() {
        return biztonsag;
    }

    public void setBiztonsag(int biztonsag) {
        this.biztonsag = biztonsag;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "kerekSzam=" + kerekSzam +
                ", sebeseg=" + sebeseg +
                ", biztonsag=" + biztonsag +
                '}';
    }

    @Override
    public int compareTo(Auto o) {
        return Integer.compare(this.getSebeseg(), o.getSebeseg());
        //return (x < y) ? -1 : ((x == y) ? 0 : 1);
        //return Integer.valueOf(this.getSebeseg()).compareTo(o.getSebeseg());
    }

    /*
    @Override
    public int compareTo(Auto o) {
        int s1 = o.getSebeseg();
        int s2 = this.getSebeseg();
        if (s1 > s2) {
            return -1;
        } else if (s1 < s2) {
            return 1;
        } else {
            return 0;
        }
    }

     */

}
