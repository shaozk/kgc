package com.kgc.day4;


public class Class1 {
	public static void main(String[] args) {
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		// for
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				sum1 += i;
			}
		}
		
		// while
		int ind = 1;
		while(ind <= 100) {
			if(ind % 2 == 0) {
				sum2 += ind;
			}
			ind++;
		}
		// do-while
		ind = 1;
		do {
			if(ind % 2 == 0) {
				sum3 += ind;
			}
			ind++;
		} while(ind <= 100);

		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		
	}

}
