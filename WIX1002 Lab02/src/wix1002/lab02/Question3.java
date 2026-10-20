/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wix1002.lab02;

/**
 *
 * @author khalishezanee
 */
import java.util.*;

public class Question3 {
    public static void main(String[] args){
        Random random = new Random();
        
        int num = random.nextInt(10); // 0<= x < 10
        
        int num1 = random.nextInt(41) + 10; // upto 50
        int num2 = random.nextInt(41) + 10;
        int num3 = random.nextInt(41) + 10;
        
        int sum = num1 + num2 + num3;
        double average = sum / 3.0;
        
        
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        System.out.println("Third number: " + num3);
        System.out.println("Sum: " + sum);
        System.out.printf("Average: %.2f%n " , average);
        
    }
    
}
