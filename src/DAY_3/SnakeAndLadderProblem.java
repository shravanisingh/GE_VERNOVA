package src.DAY_3;

import java.util.Scanner;

public class SnakeAndLadderProblem {
    public static void main(String[] args) {
        System.out.println("Welcome to the Snake and Ladder Game!");
        System.out.println("Single Player at Start Position 0");
        int posFirstPlayer = 0, count = 0;
        boolean currTurn = true;
        while(posFirstPlayer != 100){
            if(currTurn == true){
                System.out.println("Player 1 is currently at the Position: " + posFirstPlayer);
                // UC - 2
                // random function used
                int dieRolled = (int) (Math.random() * 6 + 1);
                // UC - 3
                System.out.println("Dice rolls by: " + dieRolled);
                // using random to get option
                int Option = (int) (Math.random() * 3 + 1);
                switch(Option)
                {
                    case 1:
                        System.out.println("NO PLAY: " + posFirstPlayer);
                        System.out.println("Player stays at the same position");
                        break;
                    case 2:
                        System.out.println("LADDER: " + (dieRolled + posFirstPlayer));
                        System.out.println("Player moves ahead by: " + dieRolled);
                        posFirstPlayer = posFirstPlayer + dieRolled;
                        break;
                    case 3:
                        System.out.println("SNAKE: " + (dieRolled + posFirstPlayer));
                        System.out.println("Player moves behind by: " + dieRolled);
                        posFirstPlayer = posFirstPlayer - dieRolled;
                        break;
                }
                count++;
                if(posFirstPlayer < 0){
                    posFirstPlayer = 0;
                }
                // UC - 5 Exact 100
                if(posFirstPlayer > 100){
                    posFirstPlayer -= dieRolled;
                }
                System.out.println();
            }
        }
        System.out.println("Player 1 Rolled Dice " + count + " times");
        System.out.println("Player 1 has reached the winning Position 100");
    }
}