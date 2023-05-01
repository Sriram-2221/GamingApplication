package games.prg;

import java.io.FileNotFoundException;

import java.util.Scanner;

import javazoom.jl.decoder.JavaLayerException;

public class Gaming_Application extends Number_Guess {

	public static void main(String[] args) throws FileNotFoundException, JavaLayerException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("APPLICATION RUNNING\nGAME STARTS NOW");
		while(true) {
		System.out.println("Which Game You Want to play");
		System.out.println("For TIC TAC TOE game Press-1\nFor ROCK PAPER SCISSORS game Press-2\nFor OUIJA BOARD game Press-3\nFor NUMBER GUESS game Press-4\nPress-5 to close the application");
		int userdecision = sc.nextInt();
		
		if(userdecision == 1) {
			System.out.println("TIC TAC TOE");
			execute();	
		}
		else if(userdecision == 2){
			System.out.println("ROCK PAPER SCISSORS");
			execute2();
		}
		else if(userdecision == 3) {
			System.out.println("OUIJA BOARD");
			execute3();
		}
		else if(userdecision == 4) {
			System.out.println("NUMBER GUESS");
			execute4();
		}
		else if(userdecision == 5) {
			System.out.println("THANKS FOR PLAYING\nAPPLICATION CLOSED");
			System.exit(0);
		}
		else {
			System.out.println("INVALID COMMEND\nyou are allowed choose between 1 to 4 number");
		}
		}
		}
}
