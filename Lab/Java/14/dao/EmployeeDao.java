package com.cg.eis.dao;

import com.cg.eis.bean.Employee;

public interface EmployeeDao {

	public Employee addEmployee(Employee employee);
	public Employee showDetails(Integer empId);
}
