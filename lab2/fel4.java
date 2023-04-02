package lab2;

public class fel4 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");
        System.out.println(sb.capacity());
        sb.append(" programozas");
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb.append(" minden hetfon");
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb.delete(0,5);
        System.out.println(sb);


    }
}
