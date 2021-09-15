package com.kgc.day3;

import java.util.Scanner;

public class Class1 {
	static boolean huoJiang(int card) {
		int random = (int)(Math.random()* 10);
		if(card % 1000 / 100 == random) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println("我行我素购物管理系统》幸运抽奖");
		System.out.println("请输入四位会员号：");
		int card;
		Scanner inScanner = new Scanner(System.in);
		card = inScanner.nextInt();
		
		// 产生随机数
		if(huoJiang(card)) {
			System.out.println(card + "客户号是幸运的客户，获得一个精美的mac");
		} else {
			System.out.println(card + "号客户，谢谢惠顾");
		}
	}
}
