package com.kgc.day7;

import java.util.Scanner;

public class Class3 {
	public static void main(String[] args) {
		int arr[][] = new int[3][5];
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			System.out.println("*****第" + (i + 1) + "个班*****");
			for(int j = 0; j < 5; j++) {
				System.out.print("请输入第" + (j + 1) + "个学生的成绩:");
				arr[i][j] = in.nextInt();
			}
		}
		for(int i = 0; i < 3; i++) {
			for(int j = 1; j < 5; j++) {
				arr[i][0] += arr[i][j];
			}
		}
		System.out.println("*****成绩统计*****");
		for(int i = 0; i < 3; i++) {
			System.out.println((i + 1) + "班总成绩：" + arr[i][0]);
		}
	}

}
