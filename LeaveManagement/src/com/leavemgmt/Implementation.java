package com.leavemgmt;

import java.sql.Date;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.List;

public class Implementation {

	public static void main(String[] args) {
		LeaveAutomation la=new DAL();
		List<Employee> emps=la.viewEmpData("nh62763");
		List<String> names=la.viewSuperiorNames("nh62763");
		System.out.println("The employee details are :");
		for(Employee e:emps){
			System.out.println(e.getSuper_id()+"["+names.get(1)+"]");
		}

		java.sql.Date date= java.sql.Date.valueOf("2016-08-10");
		Employee e=new Employee("ml98765","Malini","Female",date,"malini@gmail.com","873476579","Perungudi, Chennai","CSIPL","Sonar","nh62763","rv63224","hm12345",0,10,10,30,90,15,0);
		String message=la.addEmployee(e);
		System.out.println(message);
	}

}
