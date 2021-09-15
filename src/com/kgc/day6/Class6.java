package com.kgc.day6;

import java.util.*;

public class Class6 {
	public static void main(String[] args) {
		int arr[] = new int[]{5,82,3,88,6,9};
		System.out.println("原数组：");
		for(int t : arr) {
			System.out.print(t + " ");
		}
		System.out.println();
		int arr2[] = new int[arr.length];
		int ind = arr.length - 1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[ind] % 2 == 1) {
				arr2[i] = arr[ind--];
			} else {
				arr2[i] = 2;
				ind--;
			}
		
		}
		System.out.println("逆序处理后的数组：");
		for(int t : arr2) {
			System.out.print(t + " ");
		}
	}
	
}
