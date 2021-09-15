package com.kgc.day3;

import java.util.Scanner;

public class Class4 {
	public static void main(String[] args) {
		int a, b;
		char c;
		Scanner inScanner = new Scanner(System.in);
		a = inScanner.nextInt();
		b = inScanner.nextInt();
		c = inScanner.next().charAt(0);
		System.out.println(a + " " + b + " " + c);
		int result = 0;
		switch(c) {
			case '+':
				result = a + b; break;
			case '-':
				result = a - b; break;
			case '*':
				result = a * b; break;
			case '/':
				result = a / b; break;
			case '%':
				result = a % b; break;
		}
		System.out.println(result);
	}
}
