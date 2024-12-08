package src.DAY_3;

public class SnakeAndLadderProblem {

    public static final int WINNING_POSITION = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to the Snake and Ladder Game!");
        System.out.println("Two Players start at Position 0");

        int posPlayer1 = 0, posPlayer2 = 0;
        int diceCountPlayer1 = 0, diceCountPlayer2 = 0;

        boolean isPlayer1Turn = true;

        while (posPlayer1 < WINNING_POSITION && posPlayer2 < WINNING_POSITION) {
            if (isPlayer1Turn) {
                System.out.println("Player 1's Turn:");
                posPlayer1 = playTurn(posPlayer1);
                diceCountPlayer1++;
                if (posPlayer1 == WINNING_POSITION) {
                    System.out.println("Player 1 Wins the Game!");
                    break;
                }
            } else {
                System.out.println("Player 2's Turn:");
                posPlayer2 = playTurn(posPlayer2);
                diceCountPlayer2++;
                if (posPlayer2 == WINNING_POSITION) {
                    System.out.println("Player 2 Wins the Game!");
                    break;
                }
            }
            isPlayer1Turn = !isPlayer1Turn;
        }

        System.out.println("Game Over!");
        System.out.println("Player 1 rolled the dice " + diceCountPlayer1 + " times.");
        System.out.println("Player 2 rolled the dice " + diceCountPlayer2 + " times.");
    }

    public static int playTurn(int currentPosition) {
        int diceRoll = rollDice();
        System.out.println("Rolled a: " + diceRoll);
        int option = getOption();

        switch (option) {
            case 1:
                System.out.println("NO PLAY: Player stays at position " + currentPosition);
                break;
            case 2:
                System.out.println("LADDER! Player moves ahead by " + diceRoll);
                currentPosition += diceRoll;
                if (currentPosition > WINNING_POSITION) {
                    currentPosition -= diceRoll; // Revert move if it exceeds 100
                }
                currentPosition = playTurn(currentPosition); // Extra turn for ladder
                break;
            case 3:
                System.out.println("SNAKE! Player moves back by " + diceRoll);
                currentPosition -= diceRoll;
                if (currentPosition < 0) {
                    currentPosition = 0; // Reset position to 0 if it goes below
                }
                break;
        }
        System.out.println("Player's new position: " + currentPosition + "\n");
        return currentPosition;
    }

    public static int rollDice() {
        return (int) (Math.random() * 6 + 1);
    }

    public static int getOption() {
        return (int) (Math.random() * 3 + 1);
    }
}
