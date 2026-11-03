/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wix1002.lab04;

/**
 *
 * @author khalishezanee
 */

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int count = 0;
        double sum = 0;
        double sumSquares = 0;
        double minimum = 0;
        double maximum = 0;

        System.out.print("Enter a score (negative score to quit): ");
        double score = sc.nextDouble();

        while (score >= 0) {
            if (count == 0) {
                minimum = score;
                maximum = score;
            } else {
                if (score < minimum) {
                    minimum = score;
                }

                if (score > maximum) {
                    maximum = score;
                }
            }

            sum += score;
            sumSquares += score * score;
            count++;

            System.out.print("Enter a score (negative score to quit): ");
            score = sc.nextDouble();
        }

        if (count == 0) {
            System.out.println("No scores entered.");
        } else {
            double average = sum / count;

            System.out.printf("Minimum Score: %.2f\n", minimum);
            System.out.printf("Maximum Score: %.2f\n", maximum);
            System.out.printf("Average Score: %.2f\n", average);

            if (count > 1) {
                double variance =
                        (sumSquares - sum * sum / count) / (count - 1);

                double standardDeviation =
                        Math.sqrt(Math.max(0, variance));

                System.out.printf("Standard Deviation: %.2f\n",
                        standardDeviation);
            } else {
                System.out.println(
                        "Standard deviation needs at least two scores.");
            }
        }
    }
}
