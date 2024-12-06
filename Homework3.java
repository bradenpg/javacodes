//Braden Green
import java.util.Random;

import java.util.Scanner;


public class Homework3 {

	public static void main(String[] args) {
		//scans for user input
		Scanner key = new Scanner(System.in);
		//randomizes answer from computer
		Random random = new Random();
		//setting choices for user to choose
		String[] choices = {"rock", "paper", "scissors"};
		//to play again
		boolean playAgain = true;
		while (playAgain) {
		//sets each wins at 0 for the start
		int personWins = 0;
		int computerWins = 0;
		//if the person or computer hasn't won yet, it will print the message and accepts the input
		while (personWins < 2 && computerWins < 2) {
			System.out.print("Let's play rock, paper, scissors! Enter rock, paper, or scissors: ");

			String personChoice = key.nextLine();

			String computerChoice = choices[random.nextInt(3)];
			//shows computer choice
			System.out.println("Computer chose: " + computerChoice);
			//ties if the choice is the same
			if (personChoice.equals(computerChoice)) {
				
				System.out.println("It's a tie!");
		    //the other scenarios that decides the person wins
			} else if ((personChoice.equals("rock") && computerChoice.equals("scissors")) ||
		                       
					(personChoice.equals("scissors") && computerChoice.equals("paper")) ||
		                       
					(personChoice.equals("paper") && computerChoice.equals("rock"))) {
		                
				System.out.println("You win this round!");
		                
				personWins++;
		    //if anything else, the computer wins
			} else {
				
				System.out.println("Computer wins this round!");
				
				computerWins++;
				
			}
			//shows the score after every round
			System.out.println("Score - You: " + personWins + ", Computer: " + computerWins);
		        
		}

		//if person gets 2 wins then they win, if else the computer wins
		if (personWins == 2) {
		            
			System.out.println("Congratulations! You won!");
		        
		} else {
		            
			System.out.println("Computer wins the game. Try Again!");
		        
		}
		System.out.print("Do you want to play again? (yes/no): ");
		
        String response = key.nextLine();
        
        if (response.equalsIgnoreCase("no")) {
        	
        playAgain = false;    
        
    }
		}
		
		
		

		        
		    }
		}

	
