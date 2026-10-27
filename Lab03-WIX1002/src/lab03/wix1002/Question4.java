package lab03.wix1002;

import java.util.Random;

public class Question4 {
    public static void main(String[] args) {
        Random randomGen = new Random();

        int player1Roll1 = randomGen.nextInt(6) + 1;
        int player1Roll2 = randomGen.nextInt(6) + 1;
        int player2Roll1 = randomGen.nextInt(6) + 1;
        int player2Roll2 = randomGen.nextInt(6) + 1;

        int player1Score = player1Roll1 + player1Roll2;
        int player2Score = player2Roll1 + player2Roll2;

        System.out.println("Player 1 rolls: "
                + player1Roll1 + " and " + player1Roll2);
        System.out.println("Player 1 total: " + player1Score);
        System.out.println("Player 2 rolls: "
                + player2Roll1 + " and " + player2Roll2);
        System.out.println("Player 2 total: " + player2Score);

        if (player1Score > player2Score) {
            System.out.println("Player 1 wins!");
        } else if (player2Score > player1Score) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It is a draw!");
        }
    }
}
