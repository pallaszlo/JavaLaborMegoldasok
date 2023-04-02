package lab2;

public class fel5 {
    public static void main(String[] args) {
        int[] numbers = { 8, 9, 4, 5, 1};
        /*
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "]="+numbers[i]);
        }
         */
        int sum = 0;
        double average;
        for (int number:numbers) {
            sum += number;
        }
        average = (double)sum/numbers.length;
        System.out.printf("Atlag: %.2f", average);
    }
}
