/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab05.wix1002;

/**
 *
 * @author khalishezanee
 */
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

System.out.print("Enter the number of rows: ");
int n = sc.nextInt();

if (n < 1 || n > 67) {
    System.out.println("Enter a row count from 1 to 67.");
    return;
}

long[][] triangle = new long[n][n];

for (int row = 0; row < triangle.length; row++) {
    triangle[row][0] = 1;
    triangle[row][row] = 1;

    for (int col = 1; col < row; col++) {
        triangle[row][col] =
                triangle[row - 1][col - 1] + triangle[row - 1][col];
    }
}

for (int row = 0; row < triangle.length; row++) {
    for (int col = 0; col < triangle[row].length; col++) {
        System.out.print(triangle[row][col] + " ");
    }
    System.out.println();
}
    }
}
