package com.cg.eis.pl;

import java.util.*;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.Service;
import com.cg.eis.service.ServiceImpl;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Service service = new ServiceImpl();
		int choice;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Enter your choice:");
			System.out.println("1.Add Employee");
			System.out.println("2.Find Insurance Scheme of Employee");
			System.out.println("3.Show Employee Details");
			System.out.println("4.Exit");
			choice = scanner.nextInt();
			
			switch(choice) {
			case 1:	
				System.out.println("Enter Employee Id");
				int empId = scanner.nextInt();
				System.out.println("Enter Employee Name");
				String empName = scanner.next();
				System.out.println("Enter Employee Salary");
				double empSalary = scanner.nextDouble();
				System.out.println("Enter Employee Designation");
				String empDesignation = scanner.next();
				scanner.nextLine();
				System.out.println("Enter Insurance Scheme");
				String scheme = scanner.nextLine();
				
				Employee employee = new Employee();
				employee.setEmpId(empId);
				employee.setEmpName(empName);
				employee.setEmpSalary(empSalary);
				employee.setEmpDesignation(empDesignation);
				employee.setInsuranceScheme(scheme);
				Employee addedEmployee = service.addEmployee(employee);
				
				if(addedEmployee != null) {
					System.out.println("Employee added successfully!!");
				}
				else {
					System.out.println("Employee could not be added!!");
				}
				break;
			case 2:
				System.out.println("Enter Employee Id whose Insurance Scheme is to be found");
				int id = scanner.nextInt();
				String ischeme = service.findInsuranceScheme(id);
				System.out.println("Employee Insurance Scheme : "+ischeme);
				break;
			case 3:
				System.out.println("Enter Employee Id whose details are to be found");
				int eid = scanner.nextInt();
				Employee foundEmployee = service.showDetails(eid);
				if(foundEmployee != null) {
					System.out.println(foundEmployee.toString());
				}
				else {
					System.out.println("Employee Not Present!!");
				}
				break;
			case 4:
				System.exit(0);
			default:	System.out.println("Enter choice between 1 and 4 only!");
				break;	
			}
		}while(choice != 4);
	}

}
