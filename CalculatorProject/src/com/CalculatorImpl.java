package com;

class CalculatorImpl implements Calculator{

	@Override
	public String add(int a, int b) {
		int sum=a+b;
		return "Sum of "+a+" & b is : "+sum;
	}

	@Override
	public String sub(int a, int b) {
		return "Substarction of "+a+" & b is : "+(a-b);
	}

	@Override
	public String mul(int a, int b) {
		return "Multiplication of "+a+" & b is : "+(a*b);
	}

	@Override
	public String div(int a, int b) {
		if(b!=0) {
			return "Division of "+a+" & b is : "+(a/b);
		}
		else {
			return "Denominator is 0!";
		}
	}

	@Override
	public String displayErrorMessage() {
		return "Invalid choice, please enter Valid Choice!!";
	}

	
}
