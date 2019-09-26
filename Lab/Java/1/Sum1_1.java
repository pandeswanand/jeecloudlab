package com.cg.LabAssgn.q1;
import java.util.*;

public class Sum1_1 {

	public int calculateSum(int n) {
		
		int sum = 0, count = 0;
		int i = 1;
		while(count != n) {
			if(i%3 == 0 || i%5 == 0) {
				sum = sum + i;
				count = count + 1;
			}
			i++;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		Sum s = new Sum();
		int sum = s.calculateSum(number);
		System.out.println("Sum is "+sum);
	}

}
