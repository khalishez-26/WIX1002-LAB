import java.util.Random;
import java.util.Scanner;

public class Question5 {
    public static boolean checkAnswer(int number1, int number2, int answer) {
        return answer == number1 * number2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int score = 0;

        while (true) {
            int number1 = random.nextInt(13);
            int number2 = random.nextInt(13);

            System.out.println("Enter negative number to quit.");
            System.out.print(number1 + " x " + number2 + " = ");
            int answer = input.nextInt();

            if (answer < 0) {
                break;
            }

            if (checkAnswer(number1, number2, answer)) {
                score++;
            }
            System.out.println();
        }

        System.out.println("Your Score is " + score);
        input.close();
    }
}
