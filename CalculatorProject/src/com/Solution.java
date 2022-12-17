package com;

import java.util.Scanner;

public class Solution {
	static Scanner s=new Scanner(System.in);
	static int a;
	static int b;

	static void acceptinput() {
		System.out.println("Enter 1'st Number");
		a=s.nextInt();
		System.out.println("Enter 2'st Number");
		b=s.nextInt();

	}

	public static void main(String[] args) {

		Calculator calc=new CalculatorImpl();

		while(true) {

			Scanner s=new Scanner(System.in);

			System.out.println("1.Addition\n3.Substraction\n3.Multiplication\n4.Division\n5:EXIT");
			System.out.println("Enter Choice");
			int choice=s.nextInt();
			if(choice>=1 && choice<=4) {
				acceptinput();
			}
			switch(choice) {
			case 1:
				System.out.println(calc.add(a,b));
				break;
			case 2:
				System.out.println(calc.sub(a,b));
				break;
			case 3:
				System.out.println(calc.mul(a,b));
				break;
			case 4:
				System.out.println(calc.div(a,b));
				break;
			case 5:
				System.out.println("THANKOU");
				System.exit(0);
			default:
				System.out.println(calc.displayErrorMessage());
			}
		}
	}
}
