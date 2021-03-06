package com.codington.module5;

/**
 *
 * EventPassDetails is about displaying participants and entry pass details for
 * various events taking place in New Codington town.
 */

public class EventPassDetails {



	private static final float childrenFare = 5;
	private static final float adultsFare = 8;
	public static void main(String[] args) {





		int noOfChildren;
		int noOfAdults;
		int noOfTickets;
		double totalFare;
		double totalChildrenFare;
		double totalAdultsFare;
		noOfChildren = 5;
		noOfAdults = 2;
		noOfTickets = noOfChildren + noOfAdults;


		boolean eveningPass;


		// a. Regular pass can be used between 9 AM till 5 PM
		// b. Evening pass can be used between 5 PM till 9 PM

		// short variable to identify pass validity
		// A pass can be valid for 1 day, 3 days or 5 days

		short passValidity;

		// Initialize newly declared variable for pass validity to 3
		passValidity = 3; // Try changing values between 1, 3 or 5

		System.out.println("Hello New Codington Visitors!");


		System.out.println("Children Fare : " + noOfChildren);
		System.out.println("Adults Fare : " + noOfAdults);
		totalChildrenFare = noOfChildren * childrenFare;
		totalAdultsFare = noOfChildren * childrenFare;
		totalFare = totalChildrenFare + totalAdultsFare;
		System.out.println("Children Fare : " + totalChildrenFare);
		System.out.println("Adults Fare : " + totalAdultsFare);
		System.out.println("Total Fare : " + totalFare);

		eveningPass = false; // Try changing values true or false

		// (IV) Usage of If/Else structure

		if(eveningPass == true){
			System.out.println("Evening pass hours are from 5 PM - 9 PM, additional evening charge applicable for each pass.");
		}else{
			System.out.println("Regular pass hours are from 9 AM - 5 PM, no additional charge applicable.");
		}
		if(eveningPass == true && passValidity == 1){
			System.out.println("Use of an evening pass incurs additional charge for each ticket.");
		}else if(eveningPass == true && passValidity == 3 || passValidity == 5){
			System.out.println("Use of a Evening pass incurs an additional charge, a discount is provided for use of an 3 or 5 day pass.");
		}else if(eveningPass == true || eveningPass == false && passValidity != 1 || passValidity != 3 || passValidity != 5){
			System.out.println("Please choose either 1, 3 or 5 days for pass duration.");
		}else{
			System.out.println("Regular pass offers discount based on pass duration.");
		}


		// TODO 22.a. For evening pass and 1 day duration, print "Use of an evening pass incurs additional charge for each ticket."
		// TODO 22.b. For evening pass and 3 or 5 day duration, print "Use of a Evening pass incurs an additional charge, a discount is provided for use of an 3 or 5 day pass."
		// TODO 22.c. For any pass duration that is not equal to 1, 3 or 5, print "Please choose either 1, 3 or 5 days for pass duration."
		// TODO 22.d. otherwise, print "Regular pass offers discount based on pass duration."

		// (VI)- Usage of switch-case structure *
		// TODO 23. Declare String no of day and initialize it to "one".
		// TODO 23.a Use Switch-Case to verify pass duration and print appropriate message to the console
		// TODO 23.b On choosing a 1 day pass, print 'No discount on 1 day pass'
		// TODO 23.c. On choosing a 3 day pass, print '3 day pass offers 15% discount'
		// TODO 23.d On choosing a 5 day pass, print '5 day pass offers 25% discount'
		// TODO 23.e If an invalid option is chosen print 'Please choose only 1, 3 or 5 for valid pass duration.'

		// (VII):- Usage of for loop and while loop
		//TODO 24. Use single dimension array to store travel pass IDs and initialize it to total number of children and number of adults participating in an event.

		/*TODO 25. Use for loop to generate travel pass ID as :
				* No of tickets as upper bound
				* Initialize it with integer i as zero
				* Increment i by 1.
				  In the for Loop, each element of the travel pass single dimension array is assigned with a value calculated as the sum of i and one.
		           */
		System.out.println();
		System.out.println("Travel Pass Ids:");
		//TODO  26.	Print the values of the travel pass IDs using the do/while loop.
		//TODO  27. Use while loop to check if the participation of children is more than the adults and print the message that the participation of children is more than adult if the check is passed.
		//Use break to come out of the while loop.


	}

}
