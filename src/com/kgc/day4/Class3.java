package com.kgc.day4;

public class Class3 {
	public static void main(String[] args) {
		System.out.println("前一步：");
		for(int i = 1; i <= 38; i++) {
			if(i % 3 == 1) {
				System.out.print(i + " ");
			}
			
		}
		System.out.println();
		System.out.println("后一步：");
		for(int i = 1; i <= 38; i++) {
			if(i % 3 == 2) {
				System.out.print(i + " ");
			}
		}
	}
}
