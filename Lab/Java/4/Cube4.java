package com.cg.LabAssgn.q4;

import java.util.*;
public class Cube4 {

	public int sumOfCubes(int n) {
		
		int i, sum = 0, digit;
		Integer num = n;
		String number = num.toString();
		int length = number.length();
		for(i=0; i<length; i++) {
			digit = n%10;
			sum = sum + (digit*digit*digit);
			n = n/10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		Cube c = new Cube();
		int sum = c.sumOfCubes(number);
		System.out.println("Sum is "+sum);
	}

}
