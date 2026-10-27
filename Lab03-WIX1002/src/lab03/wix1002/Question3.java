package lab03.wix1002;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sales volume: RM ");
        double sales = sc.nextDouble();
        double commission;

        if (sales < 0) {
            System.out.println("Sales cannot be negative.");
        } else {
            if (sales <= 100) {
                commission = sales * 0.05;
            } else if (sales <= 500) {
                commission = sales * 0.075;
            } else if (sales <= 1000) {
                commission = sales * 0.10;
            } else {
                commission = sales * 0.125;
            }
            System.out.printf("Commission: RM %.2f\n", commission);
        }
    }
}
