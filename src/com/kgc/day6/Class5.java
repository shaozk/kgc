package com.kgc.day6;

import java.util.Scanner;

public class Class5 {
	public static void main(String[] args) {
		int n[] = {1, 2,3,4,5,5, 6,7,8,9}, N = 10;
		Scanner in = new Scanner(System.in);
		int a, flag = 0;
		System.out.println("顺序数组：");
		for(int t : n) {
			System.out.print(t + " ");
		}
		System.out.println();
		System.out.println("请输入一个数：");
		while((a = in.nextInt()) != -1) {
			// 删除指定数字
			int i = 0, j = 1, k = 0;
			while(i < N) {
				if(n[i] == a) {
					while(n[j] == n[i]) {
						j++;
						k++;
					}
				}
				i++;
			}
		}
		
	}

}
