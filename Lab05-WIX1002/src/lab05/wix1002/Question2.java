/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab05.wix1002;

/**
 *
 * @author khalishezanee
 */
import java.util.Random;

public class Question2 {
    public static void main(String[] args){
        Random random = new Random();
        int[] number = new int[10];
        
        final int MAX = 21;
        int temp;
        boolean status;
        Random g = new Random();

        for (int i = 0; i < number.length; i++) {
            status = true;
            temp = g.nextInt(MAX);

            for (int j = 0; j < i; j++) {
                if (temp == number[j]) {
                    status = false;
                    break;
                }
            }

            if (status) {
                number[i] = temp;
            } else {
                i--;
            }
        }

        System.out.println("10 non-duplicate random integer within the range from 0 to 20");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();
    }
}
