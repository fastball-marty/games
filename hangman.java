/*
 * Simple hangman game
 */
package javaproj1;
import java.util.Scanner;

/**
 *
 * @author emmacarl7
 */
public class hangman 
{
    // creates board
    public static void createBoard(char[] board, String word)
    {
        for (int i = 0; i < word.length(); i++)
        {
            board[i] = '-';
        }   
    }
    
    // prints gameboard in current state
    public static void printBoard(char[] board)
    {
        System.out.println();
        for (int i = 0; i < board.length; i++)
            System.out.print(board[i]);
    }
    
    // method for guessing letters and updating board
    public static void guess(String word, char[] board)
    {
        while (new String (board).indexOf('-') >= 0)
        {
            Scanner input = new Scanner(System.in);
            System.out.println();
            System.out.println("Guess a  letter.");
            char currentGuess = input.next().charAt(0);
            
            if (word.contains(currentGuess + ""))
            {
                System.out.println("Correct!");
                for (int i = 0; i < word.length(); i++)
                {
                    if (word.charAt(i) == currentGuess)
                        board[i] = currentGuess;
                }
            }
            else
                System.out.println("Nope! Try another letter.");

            printBoard(board);
            System.out.println();
        }
        System.out.println("Congratulations! You win!");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("Welcome to Hangman. Here's your mystery word.");
        String guessWord = "pickleboy";
        char[] board = new char[guessWord.length()]; 
        
        createBoard(board, guessWord);
        printBoard(board); 
        guess(guessWord, board);   
    }
}
