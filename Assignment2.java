// Assignment #: 2
//         Name: Alan Griffieth
//    StudentID: 1212575453
//      Lecture: MWF 9:40 - 10:30
//  Description: This class reads an unspecified number of integers until the number 0 is entered. The program
//				 will take these numbers and determine identifiers about the numbers such as the lowest number,
//				 the sum of positive integers, the number of negative integers, and the number of integers divisible
//				 by 3.

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
	int minimum = 0, sumPositiveEven = 0, negativeCount = 0, sumDivisible = 0;
	int number;
	
	while((number = scan.nextInt()) != 0) {
		
		if (number < 0) {
			negativeCount++;
		}
		
		if (number % 3 == 0) {
			sumDivisible += number;
		}
		
		if (number > 0 && number % 2 == 0) {
			sumPositiveEven += number;
		}
		
		if (number < minimum) {
			minimum = number;
		}
		
	}
	
	scan.close();
	
	System.out.println("The minimum integer is " + minimum);
	System.out.println("The sum of positive even integers is " + sumPositiveEven);
	System.out.println("The count of negative integers is " + negativeCount);
	System.out.print("The sum of numbers divisible by 3 is " + sumDivisible);

	}

}