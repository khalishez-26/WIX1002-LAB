/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab05.wix1002;

/**
 *
 * @author khalishezanee
 */
import java.util.Random;
import java.util.Scanner;

public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number of The Students: ");
        int N = sc.nextInt();
        
        if(N <= 0){
            System.out.println("Enter at least 1 Student");
            return;
        }
        
        int[] scores = new int[N];
        
        for(int i = 0; i < scores.length; i++){
            scores[i] = random.nextInt(1, 100);
        }
        
        int highest = scores[0];
        int lowest = scores[0];
        int sum = scores[0];
        
        for(int i = 0; i<N; i++){
            if( scores[i] > highest){
                highest = scores[i];
            }
            if(scores[i] < lowest){
                lowest = scores[i];
            }
            sum += scores[i];
        }
        
        System.out.println("The list of scores: ");
        for(int i=0; i<N; i++){
            System.out.print(scores[i] + " ");
        }
        System.out.println();
        
        System.out.println("Lowest Score : " + lowest);
        System.out.println("Highest Score : " + highest);
        System.out.printf("Average Score : %.2f\n", (sum / (N*1.0)));
        
    }
    
}
