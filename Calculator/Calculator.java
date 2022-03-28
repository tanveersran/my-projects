//**********************************************************
// Author: Tanveer Singh Sran
// Up
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
		
		System.out.println("Thank you!");
		System.out.println("Please type the arithmatic operation you want to perform");
		
		//ask to input the arithmatic operation to perform
		String output = input.next();
		
		
		if (output == "Multiply" || output == "*" )
			System.out.println(number1 * number2);
		
		
		if (output == "Add" || output == "+")
			System.out.println(number1 + number2);
			
			
		if (output == "Subtract" || output == "-")
			System.out.println(number1 - number2);
			
			
		if (output == "Remainder" || output == "%")
			System.out.println(number1 % number2);
			
			
		if (output == "Divide" || output == "/")
			System.out.println(number1 / number2);
		
		else 
			System.out.println("Invalid input, please try again.");
	}
	
	
		
	
}
	
		
		
		