package com.kgc.day7;

import java.util.*;

public class Class2 {
	public static void main(String[] args) {
		int arr[] = {1,3,2,4,5};
		System.out.println("原数组");
		for(int t : arr) {
			System.out.print(t + " ");
		}
		System.out.println();
		Arrays.sort(arr);
		System.out.println("新数组");
		for(int t : arr) {
			System.out.print(t + " ");
		}
		System.out.println();
		int n = 0, ind = -1;
		Scanner in = new Scanner(System.in);
		while ((n = in.nextInt()) != -1) {
			for(int i = 0; i < 5; i++) {
				if(arr[i] == n) {
					ind = i;
				}
			}
			System.out.println("下标数组:" + ind);
			ind = -1;
		}
		
		
		
		
	}
}
