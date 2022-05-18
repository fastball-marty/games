/**
 * Emma Carlson
 * Scrabble Calculator
 * Program calculates how many Scrabble points generated
 * by user-input String
 * 
 * 5/18/2022
 */

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myWord = collectWord();
		int myScore = calculate(myWord);
		
		System.out.println("Your Scrabble score for " + 
		myWord + " is " + myScore);
	}

	
	public static String collectWord() {
		System.out.println("Please enter a word (use * for blank tiles):");
		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		
		String input = myObj.next();		    // Stores user input
		myObj.close();
		
		return input;
		
	}
	
	public static int calculate(String word) {
		int score = 0;
		
		word = word.toLowerCase();
		
		for (int i = 0; i < word.length(); i++) {	// loop adds points for each char
			switch (word.charAt(i)) {				
		        case 'a' :  score += 1;
		                 break;
		        case 'b' :  score += 3;
		                 break;
		        case 'c' :  score += 3;
		                 break;
		        case 'd' :  score += 2;
		                 break;
		        case 'e' :  score += 1;
		                 break;
		        case 'f' :  score += 4;
		                 break;
		        case 'g' :  score += 2;
		                 break;
		        case 'h' :  score += 4;
		                 break;
		        case 'i' :  score += 1;
		                 break;
		        case 'j' :  score += 8;
		                 break;
		        case 'k' :  score += 5;
		                 break;
		        case 'l' :  score += 1;
		                 break;
		        case 'm' :  score += 3;
		                 break;
		        case 'n' :  score += 1;
		                 break;
		        case 'o' :  score += 1;
		                 break;
		        case 'p' :  score += 3;
		                 break;
		        case 'q' :  score += 10;
		                 break;
		        case 'r' :  score += 1;
		                 break;
		        case 's' :  score += 1;
		                 break;
		        case 't' :  score += 1;
		                 break;
		        case 'u' :  score += 1;
		                 break;
		        case 'v' :  score += 4;
		                 break;
		        case 'w' :  score += 4;
		                 break;
		        case 'x' :  score += 8;
		                 break;
		        case 'y' :  score += 4;
		                 break;
		        case 'z' :  score += 10;
		                 break;
		        case '*' :  score += 0;
		                 break;
			}
		}
		return score;
	}
}
