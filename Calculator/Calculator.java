//**********************************************************
// Author: Tanveer Singh Sran
// Uploaded to Github
//
//
//**********************************************************

import java.util.Scanner;
public class Calculator {
	
	public static void main(String[] args) {
		Calculator self = new Calculator();
		self.calculations(); // calling the method
	}
	
	 // creating method to perform the calculations
	public void calculations() {
		
		//creating scanner object
		Scanner input = new Scanner(System.in);
		
		//input 1st digit
		System.out.println("Please enter the digit 1");
		double number1 = input.nextDouble();
		
		//input 2nd digit
		System.out.println("Please enter the digit 2");
		double number2 = input.nextDouble();
	
		System.out.println("Thank you!\nPlease type the arithmatic operation you want to perform" );
		
		//ask to input the arithmatic operation to perform
		String output = input.nextLine();
		output = input.nextLine();
		
		if (output.equals("Multiply") ) 
			System.out.println(number1 * number2);
		
		else if (output.equals("Add"))
			System.out.println(number1 + number2);
			
		else if (output.equals("Subtract"))
			System.out.println(number1 - number2);
			
		else if (output.equals("Remainder"))
			System.out.println(number1 % number2);
		
		else if (output.equals("Divide"))
			System.out.println(number1 / number2);
		else
			System.out.println("Please enter a valid input");
	}
}
	
		
		
		