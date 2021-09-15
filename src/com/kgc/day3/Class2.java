package com.kgc.day3;

import java.util.Scanner;

public class Class2 {
	public static void main(String[] args) {
		int n;
		Scanner inScanner = new Scanner(System.in);
		n = inScanner.nextInt();
		char c = 0;
		if(n > 100 || n < 0) {
			System.out.println("error");
		}
		else if(n >= 90) {
			c = 'A';
		} else if(n >= 80 && n < 90) {
			c = 'B';
		}
		System.out.println(c);
	}
}
