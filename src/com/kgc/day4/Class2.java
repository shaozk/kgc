package com.kgc.day4;

import java.nio.channels.NonWritableChannelException;
import java.util.Scanner;

public class Class2 {
	public static void main(String[] args) {
		int n = 0;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		// 判断是否是水仙花数
		int ge = n % 10;
		int shi = n % 100 / 10;
		int bai = n / 100;
		if(n == (pow(bai, 3) + pow(ge, 3) + pow(shi, 3))) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	private static int pow(int bai, int i) {
		return bai *bai * bai;
	}
}
