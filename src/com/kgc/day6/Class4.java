package com.kgc.day6;

import java.util.Scanner;

public class Class4 {
	public static void main(String[] args) {
		// 判断是否是回文数
		int n[] = {0,0,0,0,0};
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			n[i] = in.nextInt();
		}
		int j = 4, flag = 1;
		for(int i = 0; i < 5; i++) {
			if(n[i] != n[j]) {
				flag = 0;
			}
			j--;
		}
		if(flag == 1) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		
	}

}
