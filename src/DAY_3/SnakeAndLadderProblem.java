package src.DAY_3;

public class SnakeAndLadderProblem {
    public static void main(String[] args) {
        System.out.println("Welcome to the Snake and Ladder Game!");
        System.out.println("Single Player at Start Position 0");
        int dieRolled = (int) (Math.random() * 6 + 1);
        System.out.println("Player 1 rolled the die and got: " + dieRolled);
    }
}