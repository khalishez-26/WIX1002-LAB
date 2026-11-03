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

public class Question2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer n: ");
        int n = sc.nextInt();

        long groupSum = 0;
        long total = 0;

        for (int i = 1; i <= n; i++) {
            groupSum += i;
            total += groupSum;
        }

        System.out.println("The sum is " + total);
    }
}
