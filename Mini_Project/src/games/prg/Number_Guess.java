package games.prg;

import java.util.*;

public class Number_Guess extends Ouija_Board {
	
	public static void execute4() {
        Random rand = new Random();
        int number = rand.nextInt(10) + 1; // generate a random number between 1 and 100
        Scanner sc = new Scanner(System.in);
        
        System.out.println("I'm thinking of a number between 1 and 10. Can you guess it?");
        

       
        while (true) {
        	
        	
           
            int guess = sc.nextInt();
            if (guess == number) {
                System.out.println("Congratulations! You guessed the number correctly.\nThanks for Playing");
                break;
            } 
            
            else if (guess < number) {
                System.out.println("Your guess is too low. Try again.");
            }
            else if(guess > number){
                System.out.println("Your guess is too high. Try again.");
            }
            else {
            	System.out.println("invalid");
            	
            }
        }
    }

}
