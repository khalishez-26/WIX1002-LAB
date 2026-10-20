/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wix1002.lab02;

/**
 *
 * @author khalishezanee
 */

import java.util.Scanner;

public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Temp in Farenheit: ");
        
        double fah = sc.nextDouble();
        double cel = (fah-32)/1.8 ; 
        
        System.out.printf("Temperature in Celcius: %.2f%n" , cel);

    }
    
}
