package lab2;

public class Fel6 {
    public static boolean contains(int[] input, int item){
        for (int n:input) {
            if (n == item){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] myArray = {1, 4,0, 9, 6};
        System.out.println(contains(myArray, 4)); //true
        System.out.println(contains(myArray, 8)); //false
    }
}
