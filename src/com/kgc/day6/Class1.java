package com.kgc.day6;

import java.util.Scanner;

public class Class1 {
	public static void main(String[] args) {
		int sum = 0;
		int a[] = {8, 4, 2, 1, 23, 344, 12};
		for(int t : a) {
			sum += t;
			System.out.print(t + " ");
		}
		System.out.println();
		System.out.println("sum:" + sum);
		int n, flag = 0;
		Scanner in = new Scanner(System.in);
		while((n = in.nextInt()) != -1) {
			for(int t : a) {
				if(t == n) {
					System.out.println("yes");
					flag = 1;
				}
			}
			if(flag == 0) {
				System.out.println("no");
			}
			flag = 0;
		}
		
	}

}
