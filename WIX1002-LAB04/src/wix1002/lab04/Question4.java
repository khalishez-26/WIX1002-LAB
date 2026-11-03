/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wix1002.lab04;

/**
 *
 * @author khalishezanee
 */
import java.util.Scanner;

public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a year:");
            int year = sc.nextInt();

            System.out.println("Enter the first day of the year (0-6): ");
            int firstDayOfYear = sc.nextInt();

            // 2. Perform required calculation Processing
            boolean isLeapYear =
                    (year % 4 == 0 && year % 100 != 0)
                    || (year % 400 == 0);

            int dayUntilMay = 31 + (isLeapYear ? 29 : 28) + 31 + 30;
            int dayUntilAug = dayUntilMay + 31 + 30 + 31;

            int firstDayOfMay = (firstDayOfYear + dayUntilMay) % 7;
            int firstDayOfAug = (firstDayOfYear + dayUntilAug) % 7;

            int daysUntilNovember =
                    31 + (isLeapYear ? 29 : 28) + 31 + 30
                    + 31 + 30 + 31 + 31 + 30 + 31;

            int firstDayOfNovember =
                    (firstDayOfYear + daysUntilNovember) % 7;

            String columnFormat = "%4s";
            String format = "%4s%4s%4s%4s%4s%4s%4s%n";

            // 3. Print the calendar of May
            System.out.printf(format,
                    "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");

            for (int i = 0; i < firstDayOfMay; i++) {
                System.out.printf(columnFormat, "");
            }

            for (int i = 1; i <= 31; i++) {
                System.out.printf(columnFormat, i);

                if ((i + firstDayOfMay) % 7 == 0) {
                    System.out.println();
                }
            }

            System.out.println();

            // 4. Print the calendar of August
            System.out.printf(format,
                    "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");

            for (int i = 0; i < firstDayOfAug; i++) {
                System.out.printf(columnFormat, "");
            }

            for (int i = 1; i <= 31; i++) {
                System.out.printf(columnFormat, i);

                if ((i + firstDayOfAug) % 7 == 0) {
                    System.out.println();
                }
            }

            // 5. Print the calendar of November
            System.out.println();
            System.out.println();
            System.out.println("November " + year);

            System.out.printf(format,
                    "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");

            for (int i = 0; i < firstDayOfNovember; i++) {
                System.out.printf(columnFormat, "");
            }

            for (int i = 1; i <= 30; i++) {
                System.out.printf(columnFormat, i);

                if ((i + firstDayOfNovember) % 7 == 0) {
                    System.out.println();
                }
            }
        }

        System.out.println();
    }
}