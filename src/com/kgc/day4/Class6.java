package com.kgc.day4;

public class Class6 {
	public static void main(String[] args) {
		double n = 2.3, m = 1.9;
		double sum = 82.3;
		int nnum = 0, mnum = 1;
		while(true) {
			if((2.3 * nnum + 1.9 * mnum) == 82.3) {
				System.out.println(mnum);
				break;
			} 
			mnum++;
			if((2.3 * nnum + 1.9 * mnum) > 82.3) {
				nnum++;
				mnum = nnum + 1;
			}
		}
	}

}
