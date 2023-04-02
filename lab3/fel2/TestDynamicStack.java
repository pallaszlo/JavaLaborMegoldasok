package lab3.fel2;

import java.util.Arrays;
import java.util.Scanner;

public class TestDynamicStack {
    public static void main(String[] args) {
        DynamicStack stack = new DynamicStack();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Select an operation:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Size");
            System.out.println("5. Is Empty?");
            System.out.println("6. Is Full?");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to push: ");
                    int item = scanner.nextInt();
                    stack.push(item);
                    System.out.println("Stack: " + Arrays.toString(stack.getStack()));
                    break;

                case 2:
                    try {
                        int popped = stack.pop();
                        System.out.println("Popped element: " + popped);
                        System.out.println("Stack: " + Arrays.toString(stack.getStack()));
                    } catch (EmptyStackException e) {
                        System.out.println("Stack is empty");
                    }
                    break;

                case 3:
                    try {
                        int peeked = stack.peek();
                        System.out.println("Peeked element: " + peeked);
                    } catch (EmptyStackException e) {
                        System.out.println("Stack is empty");
                    }
                    break;

                case 4:
                    System.out.println("Size of stack: " + stack.size());
                    break;

                case 5:
                    System.out.println("Is stack empty? " + stack.isEmpty());
                    break;

                case 6:
                    System.out.println("Is stack full? " + stack.isFull());
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
            System.out.println();
        } while (choice != 7);
    }
}
