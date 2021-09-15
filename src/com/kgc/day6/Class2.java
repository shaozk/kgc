package com.kgc.day6;

import java.util.Scanner;

public class Class2 {
	public static void main(String[] args) {
		System.out.println("输入4家店的最低手机价格：");
		int n1[] = {0, 0, 0, 0}, min = 0;
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < 4; i++) {
			System.out.println("请输入" + (i + 1) + "家手机店的价格：");
			n1[i] = in.nextInt();
			if(i == 0) {
				min = n1[i];
			} else {
				if(n1[i] < min) {
					min = n1[i];
				}
			}
			
		}
		System.out.println("最低价格是：" + min);
	}

}
