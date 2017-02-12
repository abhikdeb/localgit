package com.leavemgmt;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class AddEmployee {
	
	
		public static int gflag = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/*
		 * 
		 */
		JTextArea   textareaT = new JTextArea(10, 30);
		JTextArea   textareaB = new JTextArea(10, 30);
		JScrollPane paneT     = new JScrollPane(textareaT);
		JScrollPane paneB     = new JScrollPane(textareaB);
		
		/*
		 * 
		 */
		
		JSplitPane spane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, paneT, paneB);
		spane.setOneTouchExpandable(true);
		spane.setDividerLocation(100);
		paneT.setMinimumSize(new Dimension(100,50));
		paneB.setMinimumSize(new Dimension(100,50));
		
		/*
		 * 
		 */
		
		JTextField t = new JTextField();
		t.setText("This cannot be changed");
		t.setEditable(false);
		JButton b1 = new JButton("OK");
		JPanel panel = new JPanel();
		panel.add(b1);
		panel.add(t);
		/*
		 * 
		 */

		JPanel pane3 = new JPanel();
		JPanel pane4 = new JPanel();
		pane3.setLayout(null);
		pane4.setLayout(new BorderLayout(10,10));
		pane4.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 80));
		/*
		 * 
		 */
		JRadioButton rb1 = new JRadioButton("MALE");
		rb1.setActionCommand("male");
		rb1.setSelected(true);
		 
		JRadioButton rb2 = new JRadioButton("FEMALE");
		rb2.setActionCommand("female");
		RadioButtonActionListener listener = new RadioButtonActionListener();
		  rb1.addActionListener(listener);
		  rb2.addActionListener(listener);
		ButtonGroup group = new ButtonGroup();
		group.add(rb1);
		group.add(rb2);
		
		
		JLabel l0 = new JLabel("NEW EMPLOYEE");l0.setFont(new Font("NEW EMPLOYEE",160,40));
		l0.setHorizontalAlignment(0);
		pane4.add(l0, BorderLayout.NORTH);
		JLabel l1 = new JLabel("SOEID : ",JLabel.TRAILING);
		JTextField tf1 = new JTextField(10);tf1.setToolTipText("SOEID");
		JLabel l2 = new JLabel("DOJ : ",JLabel.TRAILING);
//		JTextField tf2 = new JTextField();
//		JButton db1 = new JButton("CAL");
		JLabel l2a = new JLabel("\\");
		JLabel l2b = new JLabel("\\");
		JTextField tf2d = new JTextField(2);tf2d.setToolTipText("DAY");
		JTextField tf2m = new JTextField(2);tf2m.setToolTipText("MONTH");
		JTextField tf2y = new JTextField(4);tf2y.setToolTipText("YEAR");
		JLabel l3 = new JLabel("NAME : ",JLabel.TRAILING);		
		JTextField tf3 = new JTextField(10);tf3.setToolTipText("FULL NAME");		
		JLabel l4 = new JLabel("GENDER : ",JLabel.TRAILING);				
		JLabel l5 = new JLabel("ADDRESS : ",JLabel.TRAILING);
		JTextArea ta1 = new JTextArea();
		JScrollPane tf5 = new JScrollPane(ta1);tf5.setToolTipText("PERMANENT ADDRESS");		
		JLabel l6 = new JLabel("EMAIL : ",JLabel.TRAILING);
		JTextField tf6 = new JTextField(10);tf6.setToolTipText("EMAIL ID");
		JLabel l7 = new JLabel("PHONE : ",JLabel.TRAILING);		
		JTextField tf7 = new JTextField();tf7.setToolTipText("PHONE NUMBER");
		JLabel l8 = new JLabel("TEAM : ",JLabel.TRAILING);		
		JTextField tf8 = new JTextField();tf8.setToolTipText("TEAM NAME");
		JLabel l9 = new JLabel("COMPANY : ",JLabel.TRAILING);		
		JTextField tf9 = new JTextField();tf9.setToolTipText("COMPANY NAME");
		JLabel l10 = new JLabel("SUPERVISOR ID : ",JLabel.TRAILING);		
		JTextField tf10 = new JTextField();tf10.setToolTipText("SUPERVISOR SOEID");
		JLabel l11 = new JLabel("PROJECT MANAGER ID : ",JLabel.TRAILING);		
		JTextField tf11 = new JTextField();tf11.setToolTipText("PROJECT MANAGER SOEID");		
		JLabel l12 = new JLabel("ALTERNATE MANAGER ID : ",JLabel.TRAILING);		
		JTextField tf12 = new JTextField();tf12.setToolTipText("ALTERNATE MANAGER SOEID");
		
		JLabel l13 = new JLabel("SICK LEAVE : ",JLabel.TRAILING);		
		JTextField tf13 = new JTextField();tf13.setToolTipText("Number of days available on SICK LEAVE");	
		JLabel l14 = new JLabel("CASUAL LEAVE : ",JLabel.TRAILING);		
		JTextField tf14 = new JTextField();tf14.setToolTipText("Number of days available on CASUAL LEAVE");	
		JLabel l15 = new JLabel("MANDATORY LEAVE : ",JLabel.TRAILING);		
		JTextField tf15 = new JTextField();tf15.setToolTipText("Number of days available on MANDATORY LEAVE");	
		JLabel l16 = new JLabel("MATERNITY LEAVE : ",JLabel.TRAILING);		
		JTextField tf16 = new JTextField();tf16.setToolTipText("Number of days available on MATERNITY LEAVE");	
		JLabel l17 = new JLabel("COMPENSATION LEAVE : ",JLabel.TRAILING);		
		JTextField tf17 = new JTextField();tf17.setToolTipText("Number of days available on COMPENSATION LEAVE");	

		String desc[] = {"ADMINISTRATOR","MANAGER","SUPERVISOR","EMPLOYEE"};
		JLabel l18 = new JLabel("ACCESS LEVEL* : ",JLabel.TRAILING);
		JComboBox<String> cb = new JComboBox<String>();
		for(int j=0;j<desc.length;j++){
			cb.addItem(desc[j]);
		}
		
		
		
		JButton sb1 = new JButton("SUBMIT");
		sb1.setBackground(Color.green);
		sb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
//				String gender = "Male";
////				LeaveAutomation la=new DAL();
//				String date=tf2y.getText()+"-"+tf2m.getText()+"-"+tf2d.getText();
//				java.sql.Date dt= java.sql.Date.valueOf(date);
//				if(rb1.isSelected())
//				{
//					gender = "Male";
//				}
//				else
//				{
//					gender = "Female";
//				}
//				String s = (String) cb.getSelectedItem();
//				int lev = 0;
//				switch(s){
//				case "ADMINISTRATOR" : lev = 3;break;
//				case "MANAGER" 		 : lev = 2;break;
//				case "SUPERVISOR"	 : lev = 1;break;
//				default				 : lev = 0;
//				}
				int result;
				result = JOptionPane.showConfirmDialog(
				           null,"SUBMIT?","Information Dialogue",JOptionPane.YES_NO_CANCEL_OPTION);

				if (result == JOptionPane.YES_OPTION) { 
//					Employee e=new Employee(tf1.getText(),tf3.getText(),gender,dt,tf6.getText(),tf7.getText(),ta1.getText(),tf9.getText(),tf8.getText(),tf9.getText(),tf11.getText(),tf12.getText(),0,Float.parseFloat(tf13.getText()),Float.parseFloat(tf14.getText()),Float.parseFloat(tf15.getText()),Float.parseFloat(tf16.getText()),Float.parseFloat(tf17.getText()),lev);
//					la.addEmployee(e);
					JOptionPane.showMessageDialog(null,"Data was added successfully!","SUCCESS",JOptionPane.INFORMATION_MESSAGE);
				}
				else if(result == JOptionPane.NO_OPTION)
				{ 
					JOptionPane.showMessageDialog(null,"Data entry interrupted!","FAILURE",JOptionPane.WARNING_MESSAGE);
				}
				else if(result == JOptionPane.CANCEL_OPTION){
					
				}				
			}
		});
		
		JButton sb2 = new JButton("RESET");
		sb2.setBackground(Color.red);
		sb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==sb2){	
				resetTextFields(frame);}
			}
		});
		
		JProgressBar jp = new JProgressBar();
		jp.setStringPainted(true);
		
		l1.setLabelFor(tf1);
		l3.setLabelFor(tf3);
		l5.setLabelFor(tf5);
		l6.setLabelFor(tf6);
		l7.setLabelFor(tf7);
		l8.setLabelFor(tf8);
		l9.setLabelFor(tf9);
		l10.setLabelFor(tf10);
		l11.setLabelFor(tf11);
		l12.setLabelFor(tf12);
		l13.setLabelFor(tf13);
		l14.setLabelFor(tf14);
		l15.setLabelFor(tf15);
		l16.setLabelFor(tf16);
		l17.setLabelFor(tf17);
		
		l1.setBounds(80, 50, 160, 40);
		tf1.setBounds(280,50,320,40);
		l2.setBounds(680, 50, 160, 40);
		tf2d.setBounds(880,50,80,40);
		l2a.setBounds(980, 50, 40, 40);
		tf2m.setBounds(1000,50,80,40);
		l2b.setBounds(1100, 50, 40, 40);
		tf2y.setBounds(1120,50,80,40);
		l3.setBounds(80, 150, 160, 40);
		tf3.setBounds(280,150,320,40);
		l4.setBounds(680, 150, 160, 40);
		rb1.setBounds(880,150,120,40);
		rb2.setBounds(1020,150,120,40);
		l5.setBounds(80, 250, 160, 40);
		tf5.setBounds(280,250,920,80);
		l6.setBounds(80, 350, 160, 40);
		tf6.setBounds(280,350,320,40);
		l7.setBounds(680, 350, 160, 40);
		tf7.setBounds(880,350,320,40);
		l8.setBounds(80, 450, 160, 40);
		tf8.setBounds(280,450,320,40);
		l9.setBounds(680, 450, 160, 40);
		tf9.setBounds(880,450,320,40);
		l10.setBounds(80, 550, 160, 40);
		tf10.setBounds(280,550,320,40);
		l11.setBounds(680, 550, 160, 40);
		tf11.setBounds(880,550,320,40);
		l12.setBounds(80, 650, 160, 40);
		tf12.setBounds(280,650,320,40);
		l18.setBounds(680,650,160,40);
		cb.setBounds(880, 650, 320, 40);
		
		l13.setBounds(120, 750, 120, 40);
		tf13.setBounds(250,750,40,40);
		l14.setBounds(350, 750, 120, 40);
		tf14.setBounds(480,750,40,40);
		l15.setBounds(540, 750, 160, 40);
		tf15.setBounds(710,750,40,40);
		l16.setBounds(810, 750, 120, 40);
		tf16.setBounds(940,750,40,40);
		l17.setBounds(1000, 750, 160, 40);
		tf17.setBounds(1170,750,40,40);
		
		
		
		pane3.add(l1);pane3.add(tf1);
		pane3.add(l2);pane3.add(tf2d);pane3.add(tf2m);pane3.add(tf2y);pane3.add(l2a);pane3.add(l2b);
		pane3.add(l3);pane3.add(tf3);
		pane3.add(l4);pane3.add(rb1);pane3.add(rb2);
		pane3.add(l5);pane3.add(tf5);
		pane3.add(l6);pane3.add(tf6);
		pane3.add(l7);pane3.add(tf7);
		pane3.add(l8);pane3.add(tf8);
		pane3.add(l9);pane3.add(tf9);
		pane3.add(l10);pane3.add(tf10);
		pane3.add(l11);pane3.add(tf11);
		pane3.add(l12);pane3.add(tf12);
		pane3.add(l18);pane3.add(cb);
		pane3.add(l13);pane3.add(tf13);
		pane3.add(l14);pane3.add(tf14);
		pane3.add(l15);pane3.add(tf15);
		pane3.add(l16);pane3.add(tf16);
		pane3.add(l17);pane3.add(tf17);
		/*
		 * 
		 */
		pane4.add(jp,BorderLayout.SOUTH);
		pane4.add(pane3,BorderLayout.CENTER);
		pane4.add(sb2,BorderLayout.WEST);
		pane4.add(sb1,BorderLayout.EAST);
		/*
		 * 
		 */
		JTabbedPane tpane = new JTabbedPane();
		tpane.addTab("HOME", null, spane, "Go to tab 1");
		tpane.addTab("VIEW EMPLOYEE DETAILS", null, panel, "Go to tab 2");
		tpane.addTab("ADD EMPLOYEE", null, pane4, "Go to tab 3");
		tpane.setEnabledAt(1,true);
		/*
		 * 
		 */
		frame.getContentPane().add(tpane);
		frame.setSize(1680, 1000);
		frame.setMinimumSize(new Dimension(1680, 1000));	
//		frame.pack();	
		frame.setVisible(true);
		
	}

	static class RadioButtonActionListener implements ActionListener {

		  public void actionPerformed(ActionEvent e) {

		    if ("male".equals(e.getActionCommand())) {
//		      JOptionPane.showMessageDialog(null,"Male","Item selected",JOptionPane.PLAIN_MESSAGE);
		    	AddEmployee.gflag = 0;

		    } else if ("female".equals(e.getActionCommand())) {
//		      JOptionPane.showMessageDialog(null,"Female","Item selected",JOptionPane.PLAIN_MESSAGE);
		    	AddEmployee.gflag = 1;
		    }
		  }
		}

	 public static void resetTextFields(Container c) {
		   Component[] components = c.getComponents();
		   for (int i = 0; i < components.length; i++ ) {
		     if (components[i] instanceof Container)
		       {resetTextFields((Container) components[i]) ;} 
		     else if (components[i] instanceof TextField) 
		     { ((TextField) components[i]).setText("") ;}
		     else if(components[i] instanceof TextArea){
		    	 ((TextArea) components[i]).setText("");}
		   	}
		   }

		
	
}

