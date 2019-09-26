package com.cg.LabAssgn.q1;

import java.util.*;
public class Number1_3 {

	public boolean checkNumber(int n) {
		
		boolean flag = true;
		Integer number = n;
		String num = number.toString();
		int length = num.length();
		for(int i=0; i<length-1; i++) {
			if(num.charAt(i)>num.charAt(i+1)) {
				flag = false;
			}
		}
		if(flag == false) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 
		int number = sc.nextInt();
		Number num = new Number();
		boolean flag = num.checkNumber(number);
		if(flag) {
			System.out.println("Number "+number+" is an increasing number");
		}
		else {
			System.out.println("Number "+number+" is not an increasing number");
		}
	}

}
