package com.cg.eis.service;

import com.cg.eis.bean.Employee;
import com.cg.eis.dao.EmployeeDao;
import com.cg.eis.dao.EmployeeDaoImpl;

public class ServiceImpl implements Service{

	EmployeeDao dao = new EmployeeDaoImpl();
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return dao.addEmployee(employee);
	}

	public String findInsuranceScheme(Integer empId) {
		// TODO Auto-generated method stub
		Employee employee = dao.showDetails(empId);
		if(employee.getEmpSalary()<5000) {
			return "No Scheme";
		}
		else {
			if(employee.getEmpSalary()>=5000 && employee.getEmpSalary()<20000) {
				return "Scheme C";
			}
			else {
				if(employee.getEmpSalary()>=20000 && employee.getEmpSalary()<40000) {
					return "Scheme B";
				}
				else {
					return "Scheme A";
				}
			}
		}
	}

	public Employee showDetails(Integer empId) {
		// TODO Auto-generated method stub
		return dao.showDetails(empId);
	}

}
