package games.prg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player; 


public class Tic_Tac_Toe {
	static char[][] board = new char[3][3];
    static boolean player1Turn = true;
    static boolean gameOver = false;
    static boolean singlePlayer = false;
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

public static void playerMove() {
    int row, col;
    do {
        System.out.print("Player 1, enter row (0, 1, 2): ");
        row = sc.nextInt();
        System.out.print("Player 1, enter col (0, 1, 2): ");
        col = sc.nextInt();
    } while (board[row][col] != ' ');

    board[row][col] = 'X';
    player1Turn = !player1Turn;
}

public static void player2Move() {
    int row, col;
    do {
        System.out.print("Player 2, enter row (0, 1, 2): ");
        row = sc.nextInt();
        System.out.print("Player 2, enter col (0, 1, 2): ");
        col = sc.nextInt();
    } while (board[row][col] != ' ');

    board[row][col] = 'O';
    player1Turn = !player1Turn;
}

public static void aiMove() {
    int row, col;
    do {
        row = rand.nextInt(3);
        col = rand.nextInt(3);
    } while (board[row][col] != ' ');

    board[row][col] = 'O';
    player1Turn = !player1Turn;
}

public static void checkForWin() throws FileNotFoundException, JavaLayerException 
{
	 FileInputStream file = new FileInputStream("C:\\Users\\Sriram Karthikeyan\\Desktop\\New folder (2)\\win.mp3");
     Player play = new Player(file);
     FileInputStream file1 = new FileInputStream("C:\\Users\\Sriram Karthikeyan\\Desktop\\New folder (2)\\lose.mp3");
     Player play1 = new Player(file1);
     
    // Check rows
    for (int i = 0; i < 3; i++) {
        if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') {
            if(board[i][0] == 'X'){
                System.out.println("Player 1 wins!");
                play.play();
            }else{
                System.out.println("Player 2 wins!");
                play1.play();
            }
            gameOver = true;
            return;
        }
    }
    // Check cols
    for (int i = 0; i < 3; i++) {
        if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != ' ') {
            if(board[0][i] == 'X'){
                System.out.println("Player 1 wins!");
                play.play();
            }else{
                System.out.println("Player 2 wins!");
                play1.play();
            }
            gameOver = true;
            return;
        }
    }

    // Check diagonals
    if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') {
        if(board[0][0] == 'X'){
            System.out.println("Player 1 wins!");
            play.play();
        }else{
            System.out.println("Player 2 wins!");
            play1.play();
        }
        gameOver = true;
        return;}
     
        if (!gameOver) {
            boolean draw = true;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == ' ') {
                        draw = false;
                        break;
                    }
                }
            }
            if (draw) {
                gameOver = true;
                System.out.println("It's a draw!");
            }
        }
    }
public static void execute() throws FileNotFoundException, JavaLayerException {
    System.out.println("Welcome to Tic Tac Toe\nWould you like to play Single player or Dual Player mode?\nFor Single Player Press-1\nFor Dual Player Press-2");
    int mode = sc.nextInt();
    if (mode == 1) {
        singlePlayer = true;
    }
    initializeBoard();
    while (!gameOver) {
        printBoard();
        if (player1Turn) {
            playerMove();
        } else if (singlePlayer) {
            aiMove();
        } else {
            player2Move();
        }
        checkForWin();
    }
}}
//out of program
/*public static void music1() throws FileNotFoundException, JavaLayerException {
	 FileInputStream file3 = new FileInputStream("C:\\Users\\Sriram Karthikeyan\\Desktop\\New folder (2)\\Big Bad Beast.mp3");
     Player play3 = new Player(file3);
     play3.play();

}
public static void music2() throws FileNotFoundException, JavaLayerException {
	 FileInputStream file = new FileInputStream("C:\\Users\\Sriram Karthikeyan\\Desktop\\New folder (2)\\Wasted.mp3");
    Player play = new Player(file);
    play.play();
}*/

