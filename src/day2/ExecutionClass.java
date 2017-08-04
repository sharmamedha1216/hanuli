package day2;

import java.util.Scanner;

public class ExecutionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// using constructor
		
	/*	Calci obj = new Calci(5,3);
		int temp = obj.toAdd();
		System.out.println(temp);
	}   */

		//how to user Scanner class
		
		System.out.println("What is your name ?");
		Scanner scan = new Scanner(System.in);
		String result= scan.nextLine();
		System.out.println("Hi "+result);
		
		System.out.println("what is your Age ?");
		int i = scan.nextInt();
		System.out.println("Oh I see you are "+i+" years old");
	}	
		
}
