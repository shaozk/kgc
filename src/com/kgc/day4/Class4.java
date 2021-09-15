package com.kgc.day4;

import java.util.Scanner;

public class Class4 {
	public static void main(String[] args) {
		for(int n = 200; n <= 300; n++) {
			int ge = n % 10;
			int shi = n % 100 / 10;
			int bai = n / 100;
			if((ge + shi + bai) == 12 && (ge * shi * bai) == 42) {
				System.out.print(n + " ");
			}
		}
		
	}

}
