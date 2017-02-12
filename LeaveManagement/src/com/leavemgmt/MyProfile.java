package com.leavemgmt;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.LayoutManager;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class MyProfile {

	public static Employee emp=null;
	public static List<String> names=null;
	public static int state=0;
	public MyProfile(){
		LeaveAutomation la = new DAL();
		emp=la.viewEmpData("rv63224");
		names=la.viewSuperiorNames("rv63224");
		state=la.viewActiveState("rv63224");
		System.out.println(state);
		System.out.println(emp.getName());
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyProfile mp=new MyProfile();
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel pane=new JPanel();
		pane.setLayout(new BorderLayout(10,10));
		pane.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
		pane.setBackground(new Color(245,245,245));
		JPanel profile_pane = new JPanel();
		profile_pane.setLayout(new BorderLayout(100,100));
		profile_pane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY, 3), emp.getName()+" ["+emp.getSoeid()+"]", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("times new roman",Font.ROMAN_BASELINE,16), Color.DARK_GRAY));
		profile_pane.setBackground(Color.white);
		
		JPanel inner_pane=new JPanel();
		inner_pane.setLayout(null);
		inner_pane.setBackground(Color.white);

		
		
		JLabel jl1 = new JLabel("DOJ : ",JLabel.TRAILING);
		JTextField tf1 = new JTextField(10);
		tf1.setEditable(false);
		tf1.setText(emp.getDoj().toString());
		JLabel jl2 = new JLabel("GENDER : ",JLabel.TRAILING);
		JTextField tf2 = new JTextField(10);
		tf2.setEditable(false);
		tf2.setText(emp.getGender());
		JLabel jl3 = new JLabel("ADDRESS : ",JLabel.TRAILING);
		JTextArea jta1 = new JTextArea(10,10);
		jta1.setBackground(new Color(245,245,245));
		JScrollPane jsp1 = new JScrollPane(jta1);
		jta1.setEditable(false);
		jta1.setText(emp.getAddr());
		JLabel jl4 = new JLabel("EMAIL : ",JLabel.TRAILING);
		JTextField tf3 = new JTextField(10);
		tf3.setEditable(false);
		tf3.setText(emp.getEmail());
		JLabel jl5 = new JLabel("PHONE : ",JLabel.TRAILING);
		JTextField tf4 = new JTextField(10);
		tf4.setEditable(false);
		tf4.setText(emp.getPhone());
		JLabel jl6 = new JLabel("TEAM : ",JLabel.TRAILING);
		JTextField tf5 = new JTextField(10);
		tf5.setEditable(false);
		tf5.setText(emp.getTeam());
		JLabel jl7 = new JLabel("COMPANY : ",JLabel.TRAILING);
		JTextField tf6 = new JTextField(10);
		tf6.setEditable(false);
		tf6.setText(emp.getCompany());
		JLabel jl8 = new JLabel("SUPERVISOR ID : ",JLabel.TRAILING);
		JTextField tf7 = new JTextField(10);
		tf7.setEditable(false);
		tf7.setText(names.get(0)+"["+emp.getSuper_id()+"]");
		JLabel jl9 = new JLabel("PROJECT MANAGER ID : ",JLabel.TRAILING);
		JTextField tf8 = new JTextField(10);
		tf8.setEditable(false);
		tf8.setText(names.get(1)+"["+emp.getManager_id()+"]");
		JLabel jl10 = new JLabel("ALTERNATE MANAGER ID : ",JLabel.TRAILING);
		JTextField tf9 = new JTextField(10);
		tf9.setEditable(false);		
		tf9.setText(names.get(2)+"["+emp.getAlt_man_id()+"]");
		JLabel jl11 = new JLabel("SICK LEAVE : ",JLabel.TRAILING);
		JTextField tf10 = new JTextField(10);
		tf10.setEditable(false);
		tf10.setText(Float.toString(emp.getSl()));
		JLabel jl12 = new JLabel("CASUAL LEAVE : ",JLabel.TRAILING);
		JTextField tf11 = new JTextField(10);
		tf11.setEditable(false);
		tf11.setText(Float.toString(emp.getCl()));
		JLabel jl13 = new JLabel("MANDATORY LEAVE : ",JLabel.TRAILING);
		JTextField tf12 = new JTextField(10);
		tf12.setEditable(false);
		tf12.setText(Float.toString(emp.getMl()));
		JLabel jl14 = new JLabel("MATERNITY LEAVE : ",JLabel.TRAILING);
		JTextField tf13 = new JTextField(10);
		tf13.setEditable(false);
		tf13.setText(Float.toString(emp.getMatl()));
		JLabel jl15 = new JLabel("COMPENSATION LEAVE : ",JLabel.TRAILING);
		JTextField tf14 = new JTextField(10);
		tf14.setEditable(false);
		tf14.setText(Float.toString(emp.getCol()));
		JLabel jl16 = new JLabel("ACCESS LEVEL : ",JLabel.TRAILING);
		JTextField tf15 = new JTextField(10);
		tf15.setEditable(false);
		String lev;
		switch(emp.getEmp_level()){
		case 3 : lev = "Administrator";break;
		case 2 : lev = "Manager";break;
		case 1 : lev = "Supervisor";break;
		default	: lev = "Employee";
		}
		tf15.setText(lev);
		JLabel jl17 = new JLabel("SHIFT TIME : ",JLabel.TRAILING);
		JTextField tf16 = new JTextField(10);
		tf16.setEditable(false);
		String shift;
		switch(emp.getShift_time()){
		case 3 : shift = "Night shift (10 PM to 6:30 AM)";break;
		case 2 : shift = "Afternoon shift (2 PM to 10:30 PM)";break;
		case 1 : shift = "Morning shift (6 AM to 2 PM)";break;
		default	: shift = "General shift (9 AM to 5 PM)";
		}
		tf16.setText(shift);
		JLabel jl18 = new JLabel("EMPLOYMENT STATUS : ",JLabel.TRAILING);
		JTextField tf17 = new JTextField(10);
		tf17.setEditable(false);
		String active;
		if(state==1){
			active="Active";
		}
		else{
			active="Not Active";
		}
		tf17.setText(active);
		
		jl1.setLabelFor(tf1);
		jl2.setLabelFor(tf2);
		jl3.setLabelFor(jsp1);
		jl4.setLabelFor(tf3);
		jl5.setLabelFor(tf4);
		jl6.setLabelFor(tf5);
		jl7.setLabelFor(tf6);
		jl8.setLabelFor(tf7);
		jl9.setLabelFor(tf8);
		jl10.setLabelFor(tf9);
		jl11.setLabelFor(tf10);
		jl12.setLabelFor(tf11);
		jl13.setLabelFor(tf12);
		jl14.setLabelFor(tf13);
		jl15.setLabelFor(tf14);
		jl16.setLabelFor(tf15);
		jl17.setLabelFor(tf16);
		jl18.setLabelFor(tf17);
		inner_pane.add(jl1);inner_pane.add(tf1);
		inner_pane.add(jl2);inner_pane.add(tf2);
		inner_pane.add(jl3);inner_pane.add(jsp1);
		inner_pane.add(jl4);inner_pane.add(tf3);
		inner_pane.add(jl5);inner_pane.add(tf4);
		inner_pane.add(jl6);inner_pane.add(tf5);
		inner_pane.add(jl7);inner_pane.add(tf6);
		inner_pane.add(jl8);inner_pane.add(tf7);
		inner_pane.add(jl9);inner_pane.add(tf8);
		inner_pane.add(jl10);inner_pane.add(tf9);
		inner_pane.add(jl11);inner_pane.add(tf10);
		inner_pane.add(jl12);inner_pane.add(tf11);
		inner_pane.add(jl13);inner_pane.add(tf12);
		inner_pane.add(jl14);inner_pane.add(tf13);
		inner_pane.add(jl15);inner_pane.add(tf14);
		inner_pane.add(jl16);inner_pane.add(tf15);
		inner_pane.add(jl17);inner_pane.add(tf16);
		inner_pane.add(jl18);inner_pane.add(tf17);

		jl1.setBounds(80, 50, 160, 30);
		tf1.setBounds(280,50,320,30);
		jl2.setBounds(680, 50, 160, 30);
		tf2.setBounds(880,50,320,30);		
		jl3.setBounds(80, 125, 160, 30);
		jsp1.setBounds(280,125,320,30);
		jl4.setBounds(680, 125, 160, 30);
		tf3.setBounds(880,125,320,30);		
		jl5.setBounds(80, 200, 160, 30);
		tf4.setBounds(280,200,320,30);
		jl6.setBounds(680, 200, 160, 30);
		tf5.setBounds(880,200,320,30);
		jl7.setBounds(80, 275, 160, 30);
		tf6.setBounds(280,275,320,30);
		jl8.setBounds(680, 275, 160, 30);
		tf7.setBounds(880,275,320,30);
		jl9.setBounds(80, 350, 160, 30);
		tf8.setBounds(280,350,320,30);
		jl10.setBounds(680, 350, 160, 30);
		tf9.setBounds(880,350,320,30);
		jl11.setBounds(80, 425, 160, 30);
		tf10.setBounds(280,425,320,30);
		jl12.setBounds(680, 425, 160, 30);
		tf11.setBounds(880,425,320,30);
		jl13.setBounds(80,500,160,30);
		tf12.setBounds(280,500,320,30);
		jl14.setBounds(680, 500, 160, 30);
		tf13.setBounds(880,500,320,30);
		jl15.setBounds(80,575,160,30);
		tf14.setBounds(280,575,320,30);
		jl16.setBounds(680, 575, 160, 30);
		tf15.setBounds(880,575,320,30);
		jl17.setBounds(80,650,160,30);
		tf16.setBounds(280,650,320,30);
		jl18.setBounds(680, 650, 160, 30);
		tf17.setBounds(880,650,320,30);
		
		if(emp.getEmp_level()!=3){
			jl18.setVisible(false);
			tf17.setVisible(false);
		}
		
		profile_pane.add(inner_pane,BorderLayout.CENTER);
		pane.add(profile_pane,BorderLayout.CENTER);
		JTabbedPane tpane = new JTabbedPane();
		tpane.addTab("MY  PROFILE", null,pane , "Go to tab 1");
		//tpane.setEnabledAt(1,true);
		
		frame.getContentPane().add(tpane);
		frame.setSize(1680, 1000);
		frame.setMinimumSize(new Dimension(1680, 1000));	
//		frame.pack();	
		frame.setVisible(true);
	}

}
