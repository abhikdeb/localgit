package com.leavemgmt;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class HomeScreen {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel spane = new JPanel();
		
		
		JTabbedPane tpane = new JTabbedPane();
		tpane.addTab("HOME SCREEN", null, spane, "HOME TAB");
//		tpane.addTab("VIEW EMPLOYEE DETAILS", null, panel, "Go to tab 2");
//		tpane.addTab("ADD EMPLOYEE", null, pane4, "Go to tab 3");
//		tpane.setEnabledAt(1,true);
		/*
		 * 
		 */
		frame.getContentPane().add(tpane);
		frame.setSize(1680, 1000);
		frame.setMinimumSize(new Dimension(1680, 1000));	
//		frame.pack();	
		frame.setVisible(true);	
	}

}
