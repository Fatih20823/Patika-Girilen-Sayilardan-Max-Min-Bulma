package com.main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		int largestNumber=0,smallestNumber=Integer.MAX_VALUE,n,enteredNumber;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("How many numbers will you enter?");
		n = scan.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.print("Enter"+i+"st number: ");
			enteredNumber = scan.nextInt();
			if(largestNumber<enteredNumber) {
				largestNumber=enteredNumber;
			}
			if(smallestNumber>enteredNumber) {
				smallestNumber = enteredNumber;
			}
		}
		
		System.out.println("Largest Number: "+largestNumber+"\nSmallest Number: "+smallestNumber);

	}

}
