package com.kgc.day7;

import java.util.Scanner;

public class Class1 {
	public static void main(String[] args) {
		int arr[] = new int[6], n = 5;
		arr[0] = 0;
		System.out.println("请输5个数字：");
		Scanner in = new Scanner(System.in);
		for(int i = 1; i <= n; i++) {
			arr[i] = in.nextInt();
		}
		for(int i = 1; i < n; i++) {
			for(int j = n; j > i; j--) {
				if(arr[j] > arr[j - 1]) {
					arr[0] = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = arr[0];
				}
			}
		}
		
		for(int i = 1; i <= 5; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
