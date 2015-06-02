package relearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RsaKeys {
	
	
		
		
	
	
		
	
	public static void main(String[] args) {
		
		ArrayList <Integer> primes = new ArrayList <Integer> (Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31,
				37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 83, 89, 97));
		
		
		// get two prime numbers p and q from user
		Scanner in = new Scanner(System.in);
		
		
		//validate input
		int p;
		boolean firstTry = true;
		do {
			
			if (firstTry) {
				System.out.println("Enter one of the following numbers: ");
				firstTry = false;
			}
			else System.out.println("That's not on the list. Try again: ");
			
			
			for (Integer i : primes) System.out.print(i + " ");
			System.out.println();
			while(!in.hasNextInt()) {
				System.out.println("That's not on the list. Try again.");
				in.next(); //needed to advance the scanner so we don't go into infinite loop
				//also allows the user to enter another value
				
			}
			p = in.nextInt();
			
		} while(!primes.contains(p)); //keeping looping and asking user for valid input 
		//while input is not a number from the list
		
		System.out.println("You entered " + p);
		
			
		
		
		
		
		
		

	}

}
