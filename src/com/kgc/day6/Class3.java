package com.kgc.day6;

import java.util.Scanner;

public class Class3 {
	public static void main(String[] args) {
		System.out.println("请输入会员本月的消费记录：");
		double n1[] = {0, 0, 0, 0, 0}, sum = 0;
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			System.out.println("请输入第" + (i + 1) + "笔购物的价格：");
			n1[i] = in.nextDouble();
			sum += n1[i];
		}
		System.out.println("序号\t\t\t金额（元）");
		for(int i = 0; i < 5; i++) {
			System.out.println((i + 1) +"\t\t\t" + n1[i]);
		}
		System.out.println("总金额：" + sum);
	}
}
