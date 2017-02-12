package com.leavemgmt;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.Border;

public class Mainframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame netframe = new JFrame("LEAVE MANAGEMENT SYSTEM");
		netframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel netpane1 = new JPanel();
		JPanel netpane2 = new JPanel();
		JPanel netpane3 = new JPanel();
		JPanel netpane4 = new JPanel();
		JPanel netpane5 = new JPanel();
		
		
		
		
		JTabbedPane netpane = new JTabbedPane();
		netpane.addTab("HOME", null, netpane1, "HOME SCREEN");
		netpane.addTab("MY PROFILE", null, netpane2, "MY PROFILE");
		netpane.addTab("VIEW EMPLOYEE", null, netpane3, "VIEW EMPLOYEE");
		netpane.addTab("APPLY LEAVE", null, netpane4, "APPLY LEAVE");
		netpane.addTab("VIEW REPORTS", null, netpane5, "VIEW REPORTS");
		netpane.setFont(new Font("Dialog", Font.BOLD, 24));
		netpane.setBackground(Color.GRAY);
		
		netframe.getContentPane().add(netpane);
		netframe.setExtendedState(JFrame.MAXIMIZED_BOTH);
		netframe.setUndecorated(true);
		netframe.setResizable(false);
		netframe.setVisible(true);

	}

}
