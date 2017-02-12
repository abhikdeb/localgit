package com.leavemgmt;

import java.util.List;

public interface LeaveAutomation {
	List<Employee> viewEmpData(String soeid);
	List<String> viewSuperiorNames(String soeid);
	String addEmployee(Employee e);
}
