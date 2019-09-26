package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface Service {

	public Employee addEmployee(Employee employee);
	public String findInsuranceScheme(Integer empId);
	public Employee showDetails(Integer empId);
}
