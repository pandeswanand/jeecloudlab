package com.cg.eis.exception;
import java.util.*;


public class EmployeeException5_6 extends Exception{

	
	public EmployeeException5_6(String s) {
		super(s);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Employee Salary");
		double sal = scanner.nextDouble();
		
		try {
			if(sal<3000) {
				throw new EmployeeException5_6("Salary is less than Rs.3000");
			}
		}
		catch(EmployeeException5_6 ee) {
			System.out.println(ee.getMessage());
		}
	}

}
