package com.cg.eis.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.eis.bean.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	Map<Integer, Employee> map = new HashMap<Integer, Employee>();
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		map.put(employee.getEmpId(), employee);
		return employee;
	}

	public Employee showDetails(Integer empId) {
		// TODO Auto-generated method stub
		return map.get(empId);
	}

	
}
