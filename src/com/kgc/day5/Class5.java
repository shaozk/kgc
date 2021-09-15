package com.kgc.day5;

import java.util.Scanner;

public class Class5 {
	public static void main(String[] args) {
		int a;
		Scanner inScanner = new Scanner(System.in);
		a = inScanner.nextInt();
		int s = 0;
		int tmp = 0;
		for(int i = 0; i < a; i++) {
			tmp = tmp * 10 + a;
			s = s + tmp;
		}
		System.out.println(s);
	
	}
}
