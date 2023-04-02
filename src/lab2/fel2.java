package lab2;

public class fel2 {
    static void traverseString(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        String s1 = new String("Java");
        traverseString(s1);
        String s2 = new String("programozas");
        String s3 = s1.concat(s2);
        traverseString(s3);
        //System.out.println(s3);
    }
}
