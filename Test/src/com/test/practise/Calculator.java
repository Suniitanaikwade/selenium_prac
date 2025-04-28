package com.test.practise;

public class Calculator {
	public float add(int a, int b) {

		try {
			float c = a / b;
			System.out.println(c);

			return c;

		}

		catch (ArithmeticException e) {
			System.out.println("arethematic exception handeled");
			
		}

		catch (Exception e) {
			System.out.println("Exception e");

		}
		return b;

	}

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		cal.add(6, 0);
	}

}
