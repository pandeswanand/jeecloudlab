package com.cg.LabAssgn.q3;

import java.util.*;
public class secondSmallest3_1 {

	public int getSecondSmallest(Integer[] num) {
		
		int i, j, temp;
		//int small = 0;
		int length = num.length;
		for(i=0; i<length; i++) {
			for(j=0; j<length-1; j++) {
				if(num[j]>num[j+1]) {
					temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
		}
		return num[1];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		Integer[] num = new Integer[n];
		System.out.println("Enter "+n+" elements");
		for(int i = 0; i<n; i++) {
			num[i] = sc.nextInt();
		}
		secondSmallest ss = new secondSmallest();
		int small = ss.getSecondSmallest(num);
		System.out.println("Second Smallest element is "+small);
	}

}
