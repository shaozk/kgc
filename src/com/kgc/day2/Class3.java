package com.kgc.day2;

import java.util.*;

public class Class3 {
	public static void main(String[] args) {
		System.out.println("请输入4位会员卡号码");
		Scanner in = new Scanner(System.in);
		int card = in.nextInt();
		System.out.println("会员卡号是：" + card);
		int qian = card / 1000;
		int bai = card % 1000 / 100;
		int shi = card % 100 / 10;
		int ge = card % 10;
		System.out.println("千位数：" + qian + "， 百位数：" + bai + ", 十位数： " + shi + ", 各位数：" + ge);
		int sum = qian + bai + shi + ge;
		System.out.println("会员卡号" + card + "各位数之和：" + sum);
	}
}
