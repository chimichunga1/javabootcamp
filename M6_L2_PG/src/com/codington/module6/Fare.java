package com.codington.module6;


	/**
	 * This is an abstract class which contains Fare details.
	 *
	 */
		//TODO 1. Add access modifier abstract to the Fare class.
		public  class Fare{

			public Fare(double serviceTax) {
				
			}
			
			final private double baseFare = 1000.2;
			protected double serviceTax = 0.0;
			

	       // method to set the name in the object  
			
	
			
			final public double computeFare() {
				double calculateFare = baseFare + serviceTax;
				return calculateFare;
			}


			public void setServiceTax(double serviceTax) {
				this.serviceTax = serviceTax;
			}
			

		     //TODO 6.Create a setter method for service tax which takes a double parameter, service tax.

		
			
			
			 /*
			  * TODO 2. Create the parameterized constructor of Fare class.Follow the below instructions to complete the constructor code.
			  * TODO 2.a The  constructor should have public access modifier and it should have one parameter of type double for initializing service tax variable of the class.
			  * TODO 2.b Invoke superclass's constructor within the  constructor.
			  * TODO 2.b Assign the argument value to the instance variable service tax.
			  */
			 //TODO 3.Define a final private double variable for base fare and initialize it to 1000.2
			 //TODO 4.Define protected double variable for service tax and initialize it to 0.0;
		     /*
		      * TODO 5.Define a final public method for calculating the fare, which returns a double value.Follow the below instructions to complete the method.
		      * TODO 5.a.For fare calculation, add base fare value and service tax value.
		      * TODO 5.b return the calculated fare value.
		      *
		      */
		     //TODO 6.Create a setter method for service tax which takes a double parameter, service tax.

	}

