package com.jmrcalc;

import java.util.Scanner;

public class calculator {
	
	public static void main(String[] args) {
		
		boolean run = true;
		
		System.out.println("Welcome to SimpleCalc");
		
		while(run) {
			
			Scanner input = new Scanner(System.in);
			Scanner operator = new Scanner(System.in);
			Scanner restart = new Scanner(System.in);
			
			System.out.println("\nEnter first number...");
			int fn = input.nextInt();
			
			System.out.println("\nChoose an operator +, -, *, or /...");
			String op = operator.nextLine();
			
			System.out.println("\nEnter second number...");
			int sn = input.nextInt();
			
			
			int answer = 0;
			String startOver = "";
			
			if("+".equals(op)) {
				answer = fn + sn;
			} else if("-".equals(op)) {
				answer = fn - sn;
			} else if("*".equals(op)) {
				answer = fn * sn;
			} else if("/".equals(op)) {
				answer = fn / sn;
			} else {
				
				System.out.println("\n Sorry. You must enter a valid operator.");
				System.out.println("\nWould you like to try another calculation? y/n");
				startOver = restart.nextLine();
				System.out.println("AWESOME! Let's do this again...");
				
			}
			
			System.out.println("\nAnswer...");
			System.out.println(fn + " " + op + " " + sn + " " + "= " + answer);
			
			System.out.println("\nWould you like to make another calculation? y/n");
			startOver = restart.nextLine();
			
			if("n".equals(startOver)) {
				run = false;
				System.out.println("\n Okay. Thanks for using SimpleCalc");
				input.close();
				operator.close();
				restart.close();
			} else {
				System.out.println("\nAWESOME! Let's do this again...");
			}
		}
		
			
	}

	
	
}


