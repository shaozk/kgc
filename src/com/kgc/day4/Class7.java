package com.kgc.day4;

public class Class7 {
	public static void main(String[] args) {
		for(int i = 1; i <= 10000; i++) {
			if(func(i + 100) && func(i + 100 + 168)) {
				System.out.println(i + " ");
			}
		
		}
	}

	private static boolean func(int n) {
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (i * i == n)
				return true;
		}
		return false;
	}

}
