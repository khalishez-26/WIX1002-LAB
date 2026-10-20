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

public class Question4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of the seconds: ");
        int totalSeconds = sc.nextInt();
        
        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int minute = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;
        
        System.out.println(totalSeconds + " Seconds is " 
                + hours + " Hours " 
                + minute + " Minutes "
                + seconds + " Seconds");
    }
}
