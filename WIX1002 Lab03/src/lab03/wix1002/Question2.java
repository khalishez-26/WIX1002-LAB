package lab03.wix1002;

import java.util.Random;

public class Question2 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(0, 10);
        
        System.out.println("Random Number:" + number);

        switch (number) {
            case 0:
                System.out.println(number + " is zero.");
                break;
            case 1:
                System.out.println(number + " is one.");
                break;
            case 2:
                System.out.println(number + " is two.");
                break;
            case 3:
                System.out.println(number + " is three.");
                break;
            case 4:
                System.out.println(number + " is four.");
                break;
            case 5:
                System.out.println(number + " is five.");
                break;
            default:
                System.out.println("Unknown");
        }
    }
}
