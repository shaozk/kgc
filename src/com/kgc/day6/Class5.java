package com.kgc.day6;

import java.util.Scanner;

public class Class5 {
	public static void main(String[] args) {
		int arr[] = {1, 2,3,5,5,5,6,7,8,9}, N = 10;
		Scanner in = new Scanner(System.in);
		int a, flag = 0;
		System.out.println("顺序数组：");
		for(int t : arr) {
			System.out.print(t + " ");
		}
		System.out.println();
		System.out.println("请输入一个数：");
		while((a = in.nextInt()) != -1) {
			// 删除指定数字
			int i = 0, j = 1, step = 1;
			for(i = 0; i < N; i++) {
				if(a == arr[i]) {
					flag = 1;
					while(arr[j] == arr[i]) {
						step++;
						j++;
					}
					for(int k = i; k < N - step; k++) {
						arr[k] = arr[k + step];
					}
					for(int k = N- 1; k >= N - step; k--) {
						arr[k] = 0;
					}
					break;
				}
				j++;
			}
			if(flag == 1) {
				for(int t : arr) {
					System.out.print(t + " ");
				}
			} else {
				System.out.println("不存在");
			}
			flag  = 0;
			
		}
	}

}
