/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab05.wix1002;

/**
 *
 * @author khalishezanee
 */
public class Question4 {
    public static void main(String[] args){
        int[][] matrix = {
            {1, 5, 7},
            {3, 6, 9},
            {5, 3, 8}
        };

        int size = matrix.length;
        int[][] rotated = new int[size][size];

        System.out.println("Original matrix:");

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(matrix[row][col] + " ");
                rotated[col][size - 1 - row] = matrix[row][col];
            }
            System.out.println();
        }

        System.out.println("After rotating 90 degrees clockwise:");

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
            System.out.print(rotated[row][col] + " ");
        }
        System.out.println();
        }
    }
}
