/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wix1002.lab02;

/**
 *
 * @author khalishezanee
 */
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args){
        Scanner input =  new Scanner(System.in);
        
        System.out.print("Enter the car price: RM");
        double P = input.nextDouble();
        
        System.out.print("Enter the down payment: RM");
        double D = input.nextDouble();
        
        System.out.print("Enter the interest rate (%): ");
        double r = input.nextDouble();
        
        System.out.print("Enter the loan duration (years): ");
        int y = input.nextInt();
        
        double M = (P - D) * (1 + r * y / 100) / (y * 12);

        System.out.printf("Monthly payment: RM %.2f\n", M);
        
        input.close();
    }
    
}
