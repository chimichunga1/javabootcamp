package com.codington.module6;

/**
 * Topic: Inheritance
 *
 * Instructions:
 * 	Zoo class overrides the methods inherited from the interface RidesHosting
 * 	Zoo hosts High Thrill rides.
 * 	The variable zooRide is used to represent different types of rides.
 * 	The zooRide value is 1 if the ride is a Low Thrill ride for Children and 2 if the
 *  ride is a High Thrill ride for teens and adults.
 */

public class Zoo extends Fare{

	public Zoo(double serviceTax) {
		super(serviceTax);
		// TODO Auto-generated constructor stub
	}

	// A class that implements interface. 
	class interfaceRidesHosting implements RidesHosting 
	{ 

	} 
	
	private int noOfAnimals = 0;
	String[] animalNames;	
	
	private Safari Safari1 = new Safari();
	private int zooRide = 0;
	

	//TODO 1 - implement RidesHosting interface
	//TODO 2 - Declare a local private integer variable to hold number of animals value and initialize it to zero.
	//TODO 3 - Declare an array of String to hold animal names and initialize it to empty string.
	//TODO 4 - Declare an instance of Safari class with private access modifier and assign null value to it.The Safari class will be composed in Zoo class.
	//TODO 5 - Declare a local private integer variable to hold zoo ride value and initialize it to zero.
	//TODO 6 -  Create parameterized constructor of Zoo class that takes a double value, service tax as an argument.
	//TODO 7 - Invoke superclass's constructor  by passing the service tax argument value.
	//TODO 8 - Generate the setters and getters for the instance variables.
	//TODO 9 - override assignRideCategory() method by assigning the high thrill value to the zooRide instance variable.
	//	Hint: use the HIGH_THRILL constant defined in the RideHosting interface.
	/*TODO 10 - override the getRideDetails method and complete its implementation by following below instructions.
	 *TODO 10.a- create a string variable rideDetails and initialize it with null Value
	 *TODO 10.b - Check the value of zooRide,
	 * 			  assign the string "Low Thrill Rides for Children" to rideDetails if the zooRide is a low thrill ride and
	 * 			 assign the string "High Thrill Rides for Teens and Adults" to rideDetails if zooRide is a high thrill ride
	 * TODO 10.c - return the rideDetails.
	 */

}
