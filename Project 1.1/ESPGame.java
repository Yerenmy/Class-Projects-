/*
 * Class: CMSC203 
 * Instructor:Ahmed Tarek
 * Description: This program lets the user play 11 rounds of ESP game, 
 * the program ask the user to guess the color. The color that the computer
 * is thinking is based on a random number generator
 * Due: 09/11/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Yerenmy Zelaya
*/


import java.util.Random;
import java.util.Scanner;

// Declare final variables to told the colors
public class ESPGame{
	private static final String COLOR_RED = "Red"; 
	private static final String COLOR_GREEN = "Green";
	private static final String COLOR_BLACK = "Black";
	private static final String COLOR_YELLOW = "Yellow";
	private static final String COLOR_ORANGE = "Orange";
	private static final String COLOR_PINK = "Pink";
	private static final String COLOR_BLUE = "Blue";
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
	//Get user's name
		System.out.println("Please enter your name ");
		String name = scanner.nextLine();
       
	//Get the user's description
		System.out.println("Please describe yourself ");
		String description = scanner.nextLine();
		
	//Get the due date
		System.out.println("Due Date:  ");
		String dueDate = scanner.nextLine();
		
	//Print out the lsit of colors
		System.out.println("CMSC 203 Assignmanet-1: Test your ESP Skills.");
		System.out.println("I am thinking of a color. "
				+ "Is it, Red, Green, Black, Yellow, Orange, Pink, Blue "
				+ "Enter your guess. ");
		
	//Initialize varibles to control the loop for 11 times and to hold the number of guesses right
		   int guessCount =  0;
		   int guesses = 0;
       
	  // Start the loop for 11 times
	        while (guesses < 11) {
	            System.out.println("Enter your guess:");
	            String guess = scanner.nextLine();
	            
	  // Generate a random number after each guess      
	            Random random = new Random();
	    		
	    		int min = 1;
	    		int max = 7; 
	   
	  // Generate a random number from 1 to 7		
	    		int number = random.nextInt((max - min) + 1) + min;
	    		
	    		String color;
	  
	   //Assign a color for each random number  		
	    		if (number == 1) {
	                color = COLOR_RED;
	            } else if (number == 2) {
	                color = COLOR_GREEN;
	            } else if (number == 3) {
	                color = COLOR_BLACK;
	            } else if (number == 4) {
	                color = COLOR_YELLOW;
	            } else if (number == 5) {
	                color = COLOR_ORANGE;
	            } else if (number == 6) {
	                color = COLOR_PINK;
	            } else {
	                color = COLOR_BLUE;
	            }
	    		
	   //Validate the user guess on the color		
	    		if (!guess.equalsIgnoreCase(COLOR_RED) && !guess.equalsIgnoreCase(COLOR_GREEN)
	                    && !guess.equalsIgnoreCase(COLOR_BLACK) && !guess.equalsIgnoreCase(COLOR_YELLOW)
	                    && !guess.equalsIgnoreCase(COLOR_ORANGE) && !guess.equalsIgnoreCase(COLOR_PINK)
	                    && !guess.equalsIgnoreCase(COLOR_BLUE)) {
	                System.out.println("Invalid color, the choices are: Red, Green, Black, Yellow, Orange, Pink, Blue");
	            } 
	   //Continue the loop if the input is correct		
	    		else {
	                if (guess.equalsIgnoreCase(color)) {
	                    System.out.println("Congratulations! You guessed right. I was thinking of " + color);
	                   
	                    guessCount += 1;
	      
	   //Continue the loop if the guess is wrong
	                } else {
	                    System.out.println("Wrong, I was thinking of " + color);
	                }
	                guesses++;
	            }
	        }

	   // Print out game over, the user's name, description, due date, number of guesses right,    
	         scanner.close();
	         System.out.println("Game over");
	         System.out.println();
	         System.out.println("Student Name: " + name);
	         System.out.println("Description: " + description);
	         System.out.println("Due Date: " + dueDate);
	         System.out.println("You guessed " + guessCount + " times right");
	         System.out.println();
	
			 
	         }
	}
	
