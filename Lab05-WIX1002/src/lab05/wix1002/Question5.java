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
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args){
        final int MAX = 101, CNT=20;
        int[] number = new int[CNT];
        Random g = new Random();
        System.out.println("A list of 20 random integer within o to 10");
        for(int i=0; i<CNT; i++){
            if (i==CNT-1){
                break;
            } else {
                System.out.print(number[i] + ", ");
            }            
        }
        System.out.println(number[CNT-1]);
        
        for (int pass = 1; pass < number.length; pass++)
            for (int i = 0; i < number.length - 1; i++)
                if (number[i] < number[i + 1]) {
                    int hold = number[i];
                    number[i] = number[i + 1];
                    number[i + 1] = hold;
                }

        System.out.println("Array in descending order");
        for (int i = 0; i < CNT; i++) {
            if (i == CNT - 1)
            break;
        else
            System.out.print(number[i] + ", ");
        }
        System.out.println(number[CNT - 1]);
        
        int searchNumber, counter = 0;
        String input;
        boolean status = false;
        Scanner k = new Scanner(System.in);

        System.out.print("Enter a number to search: ");
        searchNumber = k.nextInt();
        input = k.nextLine();

        for (int i = 0; number[i] >= searchNumber; i++, counter++)
            if (number[i] == searchNumber) {
               status = true;
               break;
            }

            if (status) {
               System.out.println(searchNumber + " found");
               System.out.println("Linear Search - " + counter + " loop(s)");
            } else {
               System.out.println("Linear Search - " + searchNumber + " not found");
            }
            
            counter = 0;
            status = false;
            int start = 0;
            int end = number.length - 1;
            int middle;

            while (start <= end) {
                middle = (start + end) / 2;
                counter++;

                if (searchNumber == number[middle]) {
                   status = true;
                   break;
                } else if (searchNumber < number[middle]) {
                    start = middle + 1;
                } else {
                    end = middle - 1;
                }
            }
            
            if (status) {
                System.out.println(searchNumber + " found");
                System.out.println("Binary Search - " + counter + " loop(s)");
            } else {
                System.out.println("Binary Search - " + searchNumber + " not found");
            }
        
    }
}
