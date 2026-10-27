package lab03.wix1002;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();
        System.out.print("Enter x: ");
        double x = sc.nextDouble();
        System.out.print("Enter y: ");
        double y = sc.nextDouble();

        if (radius < 0) {
            System.out.println("Radius cannot be negative.");
        } else {
            double distanceSquared = x * x + y * y;
            double radiusSquared = radius * radius;

            // A point on the boundary is included as inside.
            if (distanceSquared <= radiusSquared) {
                System.out.println("The point is inside the circle.");
            } else {
                System.out.println("The point is outside the circle.");
            }
        }
        sc.close();
    }
}
