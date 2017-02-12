package com.leavemgmt;

import java.sql.*;
import java.util.*;

public class DAL implements LeaveAutomation{

	@Override
	public List<Employee> viewEmpData(String soeid) {
		Connection conn = null;
		ResultSet rs=null;
		CallableStatement proc_stmt=null;
		List<Employee> employees = new ArrayList<Employee>();
		try {
			 conn=DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS;DatabaseName=LeaveMgmt","sa","Pa$$w0rd");
	         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	         proc_stmt=conn.prepareCall(" { call fetchBasicData(?) }");
	         proc_stmt.setString(1, soeid);
	         rs=proc_stmt.executeQuery();
	         while(rs.next()!=false){
	        	 employees.add(new Employee(rs.getString(1),rs.getString(2),rs.getString(3),rs.getDate(4),rs.getString(5),rs.getString(6),
	        			 rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(11),rs.getString(11),rs.getString(12),rs.getInt(13),rs.getFloat(14),
	        			 rs.getFloat(15),rs.getFloat(16),rs.getFloat(17),rs.getFloat(18),rs.getInt(19)));
	         }
	         conn.close();
	         rs.close();
		}
		catch (ClassNotFoundException e) {
           System.out.println("Error loading driver: " + e.getMessage());
		}
		catch(SQLException e){
			System.err.println(e.getMessage());
		}
		return employees;
	}

	@Override
	public List<String> viewSuperiorNames(String soeid) {
		Connection conn = null;
		ResultSet rs=null;
		CallableStatement proc_stmt=null;
		List<String> names=new ArrayList<String>();
		try {
			 conn=DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS;DatabaseName=LeaveMgmt","sa","Pa$$w0rd");
	         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	         proc_stmt=conn.prepareCall(" { call fetchSuperiorNames(?) }");
	         proc_stmt.setString(1, soeid);
	         rs=proc_stmt.executeQuery();
	         if(!rs.next()){
	        	 names.add("-");
	        	 names.add("-");
	        	 names.add("-");
	         }
	         else{
	        	 names.add(rs.getString(1));
	        	 names.add(rs.getString(2));
	        	 names.add(rs.getString(3));
	         }
	         conn.close();
	         rs.close();
		}
		catch (ClassNotFoundException e) {
          System.out.println("Error loading driver: " + e.getMessage());
		}
		catch(SQLException e){
			System.err.println(e.getMessage());
		}
		return names;
	}

	@Override
	public String addEmployee(Employee e) {
		Connection conn = null;
		CallableStatement proc_stmt=null;
		String message=null;
		try {
			 conn=DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS;DatabaseName=LeaveMgmt","sa","Pa$$w0rd");
	         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	         proc_stmt=conn.prepareCall(" { call addUser(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) }");
	         proc_stmt.setString(1,e.getSoeid());
	         proc_stmt.setString(2,e.getName());
	         proc_stmt.setString(3,e.getGender());
	         proc_stmt.setDate(4, e.getDoj());
	         proc_stmt.setString(5, e.getEmail());
	         proc_stmt.setString(6, e.getPhone());
	         proc_stmt.setString(7, e.getAddr());
	         proc_stmt.setString(8, e.getCompany());
	         proc_stmt.setString(9, e.getTeam());
	         proc_stmt.setString(10, e.getSuper_id());
	         proc_stmt.setString(11, e.getManager_id());
	         proc_stmt.setString(12, e.getAlt_man_id());
	         proc_stmt.setInt(13, e.getShift_time());
	         proc_stmt.setFloat(14, e.getSl());
	         proc_stmt.setFloat(15, e.getCl());
	         proc_stmt.setFloat(16, e.getMl());
	         proc_stmt.setFloat(17, e.getMatl());
	         proc_stmt.setFloat(18, e.getCol());
	         proc_stmt.setInt(19, e.getEmp_level());
	         proc_stmt.registerOutParameter(20,java.sql.Types.NVARCHAR);
	         proc_stmt.executeUpdate();
	         
	         message=proc_stmt.getString(20);
	         conn.close();
		}
		catch (ClassNotFoundException e1) {
           System.out.println("Error loading driver: " + e1.getMessage());
		}
		catch(SQLException e1){
			System.err.println(e1.getMessage());
		}
		return message;
	}
	
}
