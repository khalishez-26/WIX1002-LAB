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

public class Question3 {
    public static void main(String[] args){
        final int MAX=8;
        int N;
        Random r = new Random();
        int [][] work;
        Scanner k = new Scanner(System.in);
        System.out.println("Enter N employees: ");
        N = k.nextInt();
        work = new int[N][7];
        
        for (int i = 0; i < work.length; i++) {
            for (int j = 0; j < 7; j++) {
               work[i][j] = r.nextInt(1, MAX);
            }
        }

        System.out.println("             Su  Mo  Tu  We  Th  Fr  Sa");

        for (int i = 0; i < work.length; i++) {
            if (i <= 9) {
                System.out.print("Employee " + i + " ");
            } else {
                System.out.print("Employee " + i + "");
            }

            for (int j = 0; j < 7; j++) {
                System.out.printf("%4d", work[i][j]);
            }

            System.out.println("");
        }

    System.out.println("\nTotal Work Hours");

    for (int i = 0; i < work.length; i++) {
        System.out.print("Employee " + i + " : ");
        int sum = 0;

        for (int j = 0; j < 7; j++) {
            sum += work[i][j];
        }
        System.out.println(sum);
    }
    }
}
