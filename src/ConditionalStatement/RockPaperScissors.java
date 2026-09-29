package ConditionalStatement;

public class RockPaperScissors {

    public static void main(String[] args) {

        String player1 = "Rock";
        String player2 = "Paper";

        boolean isvalid1 = player1.equals("Rock") || player1.equals("Paper") || player1.equals("Scissors");
        boolean isvalid2 = player2.equals("Rock") || player2.equals("Paper") || player2.equals("Scissors");

        if (!isvalid1 || !isvalid2) {
            System.out.println("Invalid choice");
        } else if (player1.equals(player2)) {
            System.out.println("Game draw");
        } else if (player1.equals("Rock") && player2.equals("Scissors") ||
                   player1.equals("Scissors") && player2.equals("Paper") ||
                   player1.equals("Paper") && player2.equals("Rock")) {

            System.out.println("Player 1 wins");

        } else {
            System.out.println("Player 2 wins");
        }
    }
}
