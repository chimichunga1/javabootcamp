package com.codington.module6;
/**
 * Interface for implementing common methods for PARK and ZOO classes
 */
public interface RidesHosting {

	
	int LOW_THRILL = 1 ;
	int HIGH_THRILL = 2 ;
	
	public static void assignRideCategory() {
	
	}
	public static String getRideDetails() {
		String rideName = null;
		return rideName;
	}		
	
	// TODO 1 - Create an integer CONSTANT LOW THRILL to be used in the derived classes of RidesHosting and assign it value 1.
	//TODO 2 - Create an integer CONSTANT HIGH THRILL to be used in the derived classes of RidesHosting and assign it value 2.
	//TODO 3 - Define an abstract method - assignRideCategory, having public access modifier, empty parameter and return type void to be overridden in sub classes.
	//TODO 4 - Define an abstract method - getRideDetails, having public access modifier, empty parameter and return type String to be overridden in sub classes.


}
