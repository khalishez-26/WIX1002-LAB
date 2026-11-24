import java.util.Scanner;

public class Question3 {
    public static void reverseNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length / 2; i++) {
            int opposite = numbers.length - 1 - i;
            int temp = numbers[i];
            numbers[i] = numbers[opposite];
            numbers[opposite] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        reverseNumbers(numbers);

        System.out.println("Numbers in reverse order:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        input.close();
    }
}
