package com.leavemgmt;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.TitledBorder;

public class ApplyLeave {

	public static void main(String[] args) {

		JFrame fr = new JFrame();
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel lpanel = new JPanel();
		lpanel.setLayout(new BorderLayout());
		lpanel.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
		lpanel.setBackground(new Color(245,245,245));
		JPanel profile_pane = new JPanel();
		profile_pane.setLayout(new BorderLayout(100,100));
		profile_pane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY, 3), "NAME [SOEID]", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("times new roman",Font.ROMAN_BASELINE,16), Color.DARK_GRAY));
		profile_pane.setBackground(Color.white);
		
		
		lpanel.add(profile_pane, BorderLayout.CENTER);
		
		JTabbedPane tpane = new JTabbedPane();
//		tpane.addTab("HOME", null, spane, "Go to tab 1");
//		tpane.addTab("VIEW EMPLOYEE DETAILS", null, panel, "Go to tab 2");
//		tpane.addTab("ADD EMPLOYEE", null, pane4, "Go to tab 3");
//		tpane.setEnabledAt(1,true);
		tpane.addTab("APPLY LEAVE", null, lpanel, "Apply for a leave");
		
		fr.getContentPane().add(tpane);
		fr.setSize(1680, 1000);
		fr.setVisible(true);
		
	}
	

}
