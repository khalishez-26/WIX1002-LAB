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

public class Question6 {
    public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            
            System.out.print("Enter the amount of the water in gram: ");
            double M = input.nextDouble()/1000;
            
            System.out.print("Enter the Initial temperature in Fahrenheit: ");
            double tempInitial = (input.nextDouble() - 32) / 1.8;
            
            System.out.print("Enter the Final temperature in Fahrenheit: ");
            double tempFinal = (input.nextDouble() - 32) / 1.8;
            
            double Q = M * (tempFinal - tempInitial) * 4184;
            
            System.out.printf("The Energy needed is %e \n", Q);
            
    }
}
