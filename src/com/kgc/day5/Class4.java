package com.kgc.day5;

import java.util.Scanner;

import javax.net.ssl.CertPathTrustManagerParameters;

public class Class4 {
	
	private static String addBlack(int n) {
		String string = "";
		if(n == 0) return "";
		while(n != 0) {
			string += "-";
			n--;
		}
		return string;
	}
	
	private static int getLine(int n) {
		int num = 0;
		while(n != 0) {
			n /= 10;
			num++;
		}
		return num;
	}
	
	public static void main(String[] args) {
		System.out.println("你想要几行数字？");
		int n = 0, t = 1, m = 0;
		char c = '-';
		Scanner inScanner = new Scanner(System.in);
		n = inScanner.nextInt();
		m = getLine(n);
		for(int i = n - 1; i >= 0; i--) {
			for(int j = i; j > 0; j--) {
				System.out.printf(addBlack(m - 1) + c);
			}
			int tmp = 2 * (n - i) - 1;
			for(int k = 0; k < tmp; k++) {
				System.out.printf(addBlack(m - getLine(t)) + t);
			}
			System.out.println();
			t++;
		}
	}
}
