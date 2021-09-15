package com.kgc.day4;

public class Class5 {
	public static void main(String[] args) {
		int m  = 2, n = 1;
		while(true) {
			if((m * n == 6 * (m + n)) && m != n && (m - n) <= 8) {
				System.out.println(m + " " + n);
				break;
			}
			m++;
			if(m - n > 8) {
				n++;
				m = n+1;
			}
		}
	}
}
