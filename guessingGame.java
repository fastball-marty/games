/**
 * The player tries to guess a randomly generated number between 0-200 in ten tries.
 * @author      emmacarl7
 * @version     1                
 */

import java.util.Random;
import java.util.Scanner;

public class GuessingGame
{
	public static void main(String[] args) 
	{
		int userInput;	
		String userInputStr;
		int attempts = 9;									
    Scanner in = new Scanner(System.in);   	 
		int myNumber;										
    Random rand = new Random(); 
		myNumber = rand.nextInt(201) + 0;		
		boolean run;									
		System.out.println("Do you want to play my amazing game? (Y/N): ");
		userInputStr = in.next(); 
		
		if (userInputStr.equals("Y") || userInputStr.equals("y"))
			run = true;
		else 
			run = false;

		while (run)
		{
			System.out.print ("Please type an integer between 0 and 200 in the console window and press return: " );
			userInput = in.nextInt();  
			
			if (userInput > 200)									
      {
				System.out.print ("Error: Please type an integer between 0 and 200 in the console window and press return: " );
				userInput = in.nextInt();  
			}
			
			
			while (attempts > 0 && userInput != myNumber)						
      {
				if (userInput + 50 < myNumber)		
					System.out.println("Guess way higher!");    
				else if (userInput < myNumber)
					System.out.println("Guess higher!");
          
				if (userInput - 50 > myNumber)
					System.out.println("Guess way lower!");
				else if (userInput > myNumber)
					System.out.println("Guess lower!");
				
				System.out.print ("Please type an integer in the console window and press return: ");		
				userInput = in.nextInt();  																	
				attempts--;																					
        System.out.println(attempts + " attempts left!");
        
				if (userInput == myNumber)															
					System.out.println("Correct! You guessed my number " + myNumber + " in only " + (10 - attempts) + " tries!");
          
				if (userInput != myNumber && attempts == 0)													
					System.out.println("Computer wins!");
			}
			
			System.out.println("You want to play again, right? (Y/N): ");									
			userInputStr = in.next();    
		
			if (userInputStr.equals("Y") || userInputStr.equals("y"))																
        run = true;
			else 
			{
				run = false;
				System.out.println("You hit the wrong option, you're supposed to play again!");
			}
			myNumber = rand.nextInt(201) + 0;															
			attempts = 9;																		
		}
	}	
}

