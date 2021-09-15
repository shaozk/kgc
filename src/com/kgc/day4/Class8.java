package com.kgc.day4;


public class Class8 {
	public static void main(String[] args) {
		int sum = 48, n = 3, m = 4;
		int nn = 1, mm = 1;
		while(true) {
			if((nn * 3 + mm * 4) == 172 && (mm + nn) == 48) {
				System.out.println(mm + " " + nn);
				break;
			}
			mm++;
			if(mm + nn > 48){
				nn++;
				mm = nn + 1;
			}
		}
	}

}
