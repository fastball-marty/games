/**
 * Emma Carlson
 * Scrabble Calculator
 * 
 * Program calculates how many Scrabble points 
 * generated by user-inputed String.
 * 
 * 5/18/2022
 */

import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		String myWord = collectWord();
		int myScore = calculateScore(myWord);
		
		System.out.println("Your Scrabble score for \"" + 
		myWord + "\" is " + myScore);
	}

	/*
	 * gets user input Scrabble word and returns the word
	 */
	public static String collectWord() {
		System.out.println("Please enter a word (use '*' for blank tiles). Then "
				+ "press enter:");
		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		
		String word = myObj.nextLine();		    // Stores user input
		
		// checks for empty input
		while (word.isEmpty()) {
			System.out.println("Oops! No word entered. Please try again.");
			word = myObj.nextLine();		    
		}
		return word;
	}
	
	/**
	 * calculates and returns score of Scrabble-word param
	 */
	public static int calculateScore(String word) {
		int score = 0;
		boolean isDouble = false;
		boolean isTriple = false;
		boolean allSeven = false;
		
		System.out.println("Is your word a double or triple word? Enter '2' "
				+ "for double and '3' for triple. Enter '0' for no.");
		
		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		
		int bonus = myObj.nextInt();
		
		System.out.println("Did you use all seven tiles? Enter '1' for yes "
				+ "and '0' for no.");
		
		int seven = myObj.nextInt();
		
		if (bonus == 2)
			isDouble = true;					// double word bonus
		if (bonus == 3)
			isTriple = true;					// triple word bonus
		
		if (seven == 1)							// seven tiles bonus +50 pts
			allSeven = true;
		
		myObj.close();
		
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
		        case '*' : score += 0;
		                 break;
		        default  : System.out.println("Error. Invalid word input.");
		        			return score = 0;
			}
		}
		
		// adding bonuses
		if (allSeven)	
			score += 50;
		
		if (isDouble)
			return score * 2;
		else if (isTriple)
			return score * 3;
		else
			return score;
	}
}
