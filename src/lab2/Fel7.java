package lab2;

public class Fel7 {
    public static int findIndex(int[] input, int item){
        for (int i = 0; i<input.length;i++) {
            if (input[i] == item){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] myArray = {1, 4,0, 9, 6};
        System.out.println(findIndex(myArray, 4)); //1
        System.out.println(findIndex(myArray, 8)); //-1
    }
}
