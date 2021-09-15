package com.kgc.day5;

import java.util.Scanner;

public class Class3 {
	public static void main(String[] args) {
		System.out.println("请输入一个1-7的数字，输入0退出程序");
		Scanner nScanner = new Scanner(System.in);
		int n = 0;
		while((n = nScanner.nextInt()) != 0) {
			if(n < 1 || n > 7) {
				System.out.println("你输入的数不合格，只能输入1-7范围的数字");
			}
			switch(n) {
			case 1:
				System.out.println("星期一");
				break;
			case 2:
				System.out.println("星期二");
				break;
			case 3:
				System.out.println("星期三");
				break;
			case 4:
				System.out.println("星期四");
				break;
			case 5:
				System.out.println("星期五");
				break;
			case 6:
				System.out.println("星期六");
				break;
			case 7:
				System.out.println("星期天");
				break;
		
			}
		}
		System.out.println("程序结束");
		
		
	}
}
