/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wix1002.lab04;

/**
 *
 * @author khalishezanee
 */
import java.util.Random;

public class Question6 {
    public static void main(String[] args){
        int countDigit = 0;
        int randomNumber = new Random().nextInt(Integer.MAX_VALUE);
        System.out.println("Random number = " + randomNumber);
        for(int i = 0; randomNumber > 0; randomNumber /= 10, i++) {
            int digit = randomNumber % 10;
            System.out.printf("%15d = %d%n", ((int) Math.pow(10, i)), digit);
            countDigit += 1;
        }
        
        System.out.println("There are " + countDigit + " digits in the random number generated.");
    }
}
