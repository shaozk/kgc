package com.kgc.day8;

import java.util.Scanner;

public interface Utils {
	
	/**
	 * 正确输入数字
	 * 1.输入不是数字，重新输入（异常提示）
	 * 2.直到输入是数字，保存输入结果并返回
	 * @param num
	 * @param message
	 * @return
	 */
	static int correctInput(int num, String message) {
		while(true) {
			try {
				Scanner in = new Scanner(System.in);
				System.out.print(message);
				num= in.nextInt();
				break;
			} catch(Exception e) {
				System.out.println("数据格式不正确!!!");
			}
		}
		return num;
	}
	
	/**
	 * 数字-->对应字符
	 * 0-->"已预订"
	 * 1-->"已完成"
	 * @param n
	 * @return
	 */
	static String changNumber(int n) {
		if(n == 0) {
			return "已预订";
		} else if(n == 1) {
			return "已完成";
		}
		return "";
	}
	
	/**
	 * 计算总金额
	 * 1.总金额<50 总金额+=60
	 */
	static double sumPrice(int number, double price) {
		double sumPrice = number * price;
		if(sumPrice < 50) {
			sumPrice += 6;
		}
		return sumPrice;
	}
	

}
