package relearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RsaKeys {

	public static void main(String[] args) {

		ArrayList<Integer> primes = new ArrayList<Integer>(Arrays.asList(2, 3,
				5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61,
				67, 71, 73, 83, 89, 97));

		// get two prime numbers p and q from user
		Scanner in = new Scanner(System.in);

		int p;
		int q;
		boolean firstTry = true;
		// get first prime and validate input
		do {

			if (firstTry) {
				System.out.println("Enter one of the following numbers: ");
				firstTry = false;
			} else
				System.out.println("That's not on the list. Try again: ");

			for (Integer i : primes)
				System.out.print(i + " ");
			System.out.println();
			while (!in.hasNextInt()) {
				System.out.println("That's not on the list. Try again.");
				in.next(); // needed to advance the scanner so we don't go into
							// infinite loop
				// also allows the user to enter another value

			}
			p = in.nextInt();

		} while (!primes.contains(p)); // keeping looping and asking user for
										// valid input
		// while input is not a number from the list
		
		ArrayList <Integer> primesMinusP = primes;
		int iP = primes.indexOf(p); //get the index of p 
		primesMinusP.remove(iP); //remove p from the arraylist

		// get second prime
		firstTry = true;
		do {
			
			if (firstTry) {
				System.out.println("Good. Now pick a different one from the list.");
				firstTry = false;
			} else
				System.out.println("That's not on the list. Try again.");
			
			//create an copy of the list of primes and remove the first choice from it
	

			for (Integer i : primesMinusP)
				System.out.print(i + " ");
			System.out.println();
			while (!in.hasNextInt()) {
				System.out.println("That's not on the list. Try again.");
				in.next(); // needed to advance the scanner so we don't go into
							// infinite loop
				// also allows the user to enter another value

			}
			q = in.nextInt();

		} while (!primesMinusP.contains(q));
		
		//determine the max number we can use and the number of primes less than max (phi)
		int max = p*q;
		int phi = (p-1)*(q-1);
		
		

		

	}

}
