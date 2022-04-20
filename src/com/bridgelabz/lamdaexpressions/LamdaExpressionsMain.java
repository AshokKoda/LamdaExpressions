package com.bridgelabz.lamdaexpressions;

public class LamdaExpressionsMain {

	public static void main(String[] args) {
		System.out.println("**************Welcome to Lamda Expressions**************");

		IMathFunction add = (x, y) -> x + y;

		System.out.println("Addition is : 5+4 = " + add.calculate(5, 4));
		
		IMathFunction multiply = (x, y) -> x * y;
		System.out.println("Multiplication is : 7*8 = " + multiply.calculate(7, 8));

		IMathFunction division = (x, y) -> x / y;
		System.out.println("Division is : 50/5 = " + division.calculate(50, 5));

	}

}
