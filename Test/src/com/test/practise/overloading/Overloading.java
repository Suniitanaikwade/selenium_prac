package com.test.practise.overloading;

public class Overloading {
	
	public int Addition(int a, int b) {
		
		int c=a+b;
		return c;
		
	}
	
	public int Addition(int a, int b, int c) {
		
		int d= a+b+c;
		return d;
		
	}

	public static void main(String[] args) {
		Overloading ovr = new Overloading();
		
		System.out.println(ovr.Addition(2, 6));
		
	}
}
