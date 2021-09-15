package com.kgc.day5;

public class Class6 {
	public static void main(String[] args) {
		double h = 0.005;
		int n = 0;
		while(h < 8844.43) {
			n++;
			h *= 2;
		}
		System.out.println(n);
	}
}
