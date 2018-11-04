
package com.codington.module3;


public class CodingtonEventPass {


	private static float baseFare = 10;
	private static float serviceTax = 5;

	public static void main(String[] args){

		int noOfChildren;
		int noOfAdults;
		String[] entryPasses= new String[2];
		entryPasses[0] = "Adult";
		entryPasses[1] = "Children";
		noOfChildren = 20;
		noOfAdults = 23;
		System.out.println("Hello New Codington Visitors!Select one of the below entry passes: ");
		for(int i = 0; i < 2 ; i++){
			System.out.println(entryPasses[i]);
		}
		System.out.println("Base Fare is : " + baseFare);
		System.out.println("Service Tax is : " + serviceTax);
		System.out.println("No. of Children attending the event is " + noOfChildren);
		System.out.println("No. of Adults attending the event is " + noOfAdults);
	}

}
