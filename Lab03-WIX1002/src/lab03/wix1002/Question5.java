package lab03.wix1002;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();
        System.out.print("Enter d: ");
        double d = sc.nextDouble();
        System.out.print("Enter e: ");
        double e = sc.nextDouble();
        System.out.print("Enter f: ");
        double f = sc.nextDouble();

        double denominator = a * d - b * c;

        if (denominator == 0) {
            System.out.println("The equation has no solution");
        } else {
            //calculate x using given question
            double x = (e * d - b * f) / denominator;
            //calculate y using given question
            double y = (a * f - e * c) / denominator;
            
            System.out.printf("X == %.2f%n ",x);
            System.out.printf("Y == %.2f%n ",y);
        }
        sc.close();
    }
}
