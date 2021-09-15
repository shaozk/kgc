package com.kgc.day3;

import java.util.Scanner;

import javax.print.attribute.standard.PrinterMessageFromOperator;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Class3 {
	public static void main(String[] args) {
		int a, b, c;
		Scanner inScanner = new Scanner(System.in);
		a = inScanner.nextInt();
		b = inScanner.nextInt();
		c = inScanner.nextInt();
		int max = 0;
		if(a > c) {
		if(a > b) {
				max = a;
			} else {
				max = c;
			}
		} else {
			if(b > c) {
				max = b;
			} else {
				max = c;
			}
		}
		System.out.println(max);
	}

}
