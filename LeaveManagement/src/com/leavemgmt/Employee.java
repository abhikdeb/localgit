package com.leavemgmt;

import java.sql.Date;

public class Employee {
	private String soeid;
	private String name;
	private String gender;
	private Date doj;
	private String email;
	private String phone;
	private String addr;
	private String company;
	private String team;
	private String super_id;
	private String manager_id;
	private String alt_man_id;
	private int shift_time;
	private float sl;
	private float cl;
	private float ml;
	private float matl;
	private float col; 
	private int emp_level;
	
	public Employee(String soeid, String name, String gender, Date doj, String email, String phone, String addr,
			String company, String team, String super_id, String manager_id, String alt_man_id, int shift_time,
			float sl, float cl, float ml, float matl, float col, int emp_level) {
		super();
		this.soeid = soeid;
		this.name = name;
		this.gender = gender;
		this.doj = doj;
		this.email = email;
		this.phone = phone;
		this.addr = addr;
		this.company = company;
		this.team = team;
		this.super_id = super_id;
		this.manager_id = manager_id;
		this.alt_man_id = alt_man_id;
		this.shift_time = shift_time;
		this.sl = sl;
		this.cl = cl;
		this.ml = ml;
		this.matl = matl;
		this.col = col;
		this.emp_level = emp_level;
	}

	public String getSoeid() {
		return soeid;
	}

	public void setSoeid(String soeid) {
		this.soeid = soeid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getSuper_id() {
		return super_id;
	}

	public void setSuper_id(String super_id) {
		this.super_id = super_id;
	}

	public String getManager_id() {
		return manager_id;
	}

	public void setManager_id(String manager_id) {
		this.manager_id = manager_id;
	}

	public String getAlt_man_id() {
		return alt_man_id;
	}

	public void setAlt_man_id(String alt_man_id) {
		this.alt_man_id = alt_man_id;
	}

	public int getShift_time() {
		return shift_time;
	}

	public void setShift_time(int shift_time) {
		this.shift_time = shift_time;
	}

	public float getSl() {
		return sl;
	}

	public void setSl(float sl) {
		this.sl = sl;
	}

	public float getCl() {
		return cl;
	}

	public void setCl(float cl) {
		this.cl = cl;
	}

	public float getMl() {
		return ml;
	}

	public void setMl(float ml) {
		this.ml = ml;
	}

	public float getMatl() {
		return matl;
	}

	public void setMatl(float matl) {
		this.matl = matl;
	}

	public float getCol() {
		return col;
	}

	public void setCol(float col) {
		this.col = col;
	}

	public int getEmp_level() {
		return emp_level;
	}

	public void setEmp_level(int emp_level) {
		this.emp_level = emp_level;
	}

	@Override
	public String toString() {
		return "Employee [soeid=" + soeid + ", name=" + name + ", gender=" + gender + ", doj=" + doj + ", email="
				+ email + ", phone=" + phone + ", addr=" + addr + ", company=" + company + ", team=" + team
				+ ", super_id=" + super_id + ", manager_id=" + manager_id + ", alt_man_id=" + alt_man_id
				+ ", shift_time=" + shift_time + ", sl=" + sl + ", cl=" + cl + ", ml=" + ml + ", matl=" + matl
				+ ", col=" + col + ", emp_level=" + emp_level + "]";
	}
	
	
	
}
