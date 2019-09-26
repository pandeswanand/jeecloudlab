package com.cg.LabAssgn.q5;
import java.util.*;


public class validateAge5_5 extends Exception{

	public validateAge5_5(String s) {
		super(s);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter age of person");
		age = scanner.nextInt();
		try {
			validate(age);
		}
		catch(validateAge5_5 va) {
			System.out.println(va.getMessage());
		}
	}
	
	public static void validate(int age) throws validateAge5_5 {
		if(age<15) {
			throw new validateAge5_5("Age is less than 15 years");
		}
	}

}
