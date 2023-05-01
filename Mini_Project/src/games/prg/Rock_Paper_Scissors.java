package games.prg;

import java.util.*;  

public class Rock_Paper_Scissors extends Tic_Tac_Toe {

	public static void  execute2() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Welcome to Rock-Paper-Scissors!");

        while (true) {
            System.out.println("Make your move: (1) Rock, (2) Paper, (3) Scissors, or (4) Quit");
            int playerMove = sc.nextInt();

            if (playerMove == 4) {
                System.out.println("Thanks for playing");
                break;
                
            }
            
            int aiMove = rand.nextInt(3) + 1 ;

            if (playerMove == aiMove) {
                System.out.println("It's a tie!");
            } else if (playerMove == 1 && aiMove == 2) {
                System.out.println("You lose! Paper beats Rock.");
            } else if (playerMove == 1 && aiMove == 3) {
                System.out.println("You win! Rock beats Scissors.");
            } else if (playerMove == 2 && aiMove == 1) {
                System.out.println("You win! Paper beats Rock.");
            } else if (playerMove == 2 && aiMove == 3) {
                System.out.println("You lose! Scissors beats Paper.");
            } else if (playerMove == 3 && aiMove == 1) {
                System.out.println("You lose! Rock beats Scissors.");
            } else if (playerMove == 3 && aiMove == 2) {
                System.out.println("You win! Scissors beats Paper.");
            }
              else {
            	System.out.println("INVALID COMMEND\nyou are allowed choose between 1 to 4 number");
              }
            
        }
    }
}
