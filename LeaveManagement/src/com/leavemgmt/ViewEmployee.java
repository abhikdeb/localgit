package com.leavemgmt;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.AbstractButton;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.ButtonModel;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;


public class ViewEmployee {

	public static void main(String[] args) {
		
		JFrame f1 = new JFrame();
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTabbedPane tpane = new JTabbedPane();
		
		JPanel opanel = new JPanel();
		opanel.setLayout(new BorderLayout());
		opanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		/*
		 * 
		 */
		
		JLabel hlabel = new JLabel("EMPLOYEE DETAILS");
		hlabel.setFont(new Font("",160,40));
		hlabel.setHorizontalAlignment(0);
		
		JPanel ipanel = new JPanel();
		ipanel.setLayout(new BorderLayout());
		ipanel.setBorder(BorderFactory.createEmptyBorder());
		
		JPanel spanel = new JPanel();
		spanel.setLayout(new FlowLayout());
		JLabel slabel = new JLabel("Enter SOEID : ");
		slabel.setHorizontalAlignment(0);
		JTextField tfield = new JTextField(10);
		slabel.setLabelFor(tfield);
		JButton sbtn = new JButton("GET DETAILS");
		
		JPanel dpanel = new JPanel();
		dpanel.setLayout(null);
		dpanel.setVisible(false);
		
		sbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dpanel.setVisible(true);
			}
		});
		
		
		JLabel jl0 = new JLabel("NAME : ",JLabel.TRAILING);
		JTextField tf0 = new JTextField(10);
		tf0.setEditable(false);
//		tf0.setText(emp.getDoj().toString());tf0.setHorizontalAlignment(0);
		JLabel jl1 = new JLabel("DOJ : ",JLabel.TRAILING);
		JTextField tf1 = new JTextField(10);
		tf1.setEditable(false);
//		tf1.setText(emp.getDoj().toString());tf1.setHorizontalAlignment(0);
		JLabel jl2 = new JLabel("GENDER : ",JLabel.TRAILING);
		JTextField tf2 = new JTextField(10);
		tf2.setEditable(false);
//		tf2.setText(emp.getGender());tf2.setHorizontalAlignment(0);
		JLabel jl3 = new JLabel("ADDRESS : ",JLabel.TRAILING);
		JTextArea jta1 = new JTextArea(10,10);
		jta1.setBackground(new Color(245,245,245));
		JScrollPane jsp1 = new JScrollPane(jta1);
		jta1.setEditable(false);
//		jta1.setText(emp.getAddr());jta1.setHorizontalAlignment(0);
		JLabel jl4 = new JLabel("EMAIL : ",JLabel.TRAILING);
		JTextField tf3 = new JTextField(10);
		tf3.setEditable(false);
//		tf3.setText(emp.getEmail());tf3.setHorizontalAlignment(0);
		JLabel jl5 = new JLabel("PHONE : ",JLabel.TRAILING);
		JTextField tf4 = new JTextField(10);
		tf4.setEditable(false);
//		tf4.setText(emp.getPhone());tf4.setHorizontalAlignment(0);
		JLabel jl6 = new JLabel("TEAM : ",JLabel.TRAILING);
		JTextField tf5 = new JTextField(10);
		tf5.setEditable(false);
//		tf5.setText(emp.getTeam());tf5.setHorizontalAlignment(0);
		JLabel jl7 = new JLabel("COMPANY : ",JLabel.TRAILING);
		JTextField tf6 = new JTextField(10);
		tf6.setEditable(false);
//		tf6.setText(emp.getCompany());tf6.setHorizontalAlignment(0);
		JLabel jl8 = new JLabel("SUPERVISOR ID : ",JLabel.TRAILING);
		JTextField tf7 = new JTextField(10);
		tf7.setEditable(false);
//		tf7.setText(names.get(0)+"["+emp.getSuper_id()+"]");tf7.setHorizontalAlignment(0);
		JLabel jl9 = new JLabel("PROJECT MANAGER ID : ",JLabel.TRAILING);
		JTextField tf8 = new JTextField(10);
		tf8.setEditable(false);
//		tf8.setText(names.get(1)+"["+emp.getManager_id()+"]");tf8.setHorizontalAlignment(0);
		JLabel jl10 = new JLabel("ALTERNATE MANAGER ID : ",JLabel.TRAILING);
		JTextField tf9 = new JTextField(10);
		tf9.setEditable(false);		
//		tf9.setText(names.get(2)+"["+emp.getAlt_man_id()+"]");tf9.setHorizontalAlignment(0);
		JLabel jl11 = new JLabel("SICK LEAVE : ",JLabel.TRAILING);
		JTextField tf10 = new JTextField(10);
		tf10.setEditable(false);
//		tf10.setText(Float.toString(emp.getSl()));tf10.setHorizontalAlignment(0);
		JLabel jl12 = new JLabel("CASUAL LEAVE : ",JLabel.TRAILING);
		JTextField tf11 = new JTextField(10);
		tf11.setEditable(false);
//		tf11.setText(Float.toString(emp.getCl()));tf11.setHorizontalAlignment(0);
		JLabel jl13 = new JLabel("MANDATORY LEAVE : ",JLabel.TRAILING);
		JTextField tf12 = new JTextField(10);
		tf12.setEditable(false);
//		tf12.setText(Float.toString(emp.getMl()));tf12.setHorizontalAlignment(0);
		JLabel jl14 = new JLabel("MATERNITY LEAVE : ",JLabel.TRAILING);
		JTextField tf13 = new JTextField(10);
		tf13.setEditable(false);
//		tf13.setText(Float.toString(emp.getMatl()));tf13.setHorizontalAlignment(0);
		JLabel jl15 = new JLabel("COMPENSATION LEAVE : ",JLabel.TRAILING);
		JTextField tf14 = new JTextField(10);
		tf14.setEditable(false);
//		tf14.setText(Float.toString(emp.getCol()));tf14.setHorizontalAlignment(0);
		JLabel jl16 = new JLabel("ACCESS LEVEL : ",JLabel.TRAILING);
		JTextField tf15 = new JTextField(10);
		tf15.setEditable(false);
		
		String lev = "Employee";
//		switch(emp.getEmp_level()){
//		case 3 : lev = "Administrator";break;
//		case 2 : lev = "Manager";break;
//		case 1 : lev = "Supervisor";break;
//		default	: lev = "Employee";
//		}
		tf15.setText(lev);tf15.setHorizontalAlignment(0);
		JLabel jl17 = new JLabel("SHIFT TIME : ",JLabel.TRAILING);
		JTextField tf16 = new JTextField(10);
		tf16.setEditable(false);
		String shift = "General shift (9 AM to 5 PM)";
//		switch(emp.getShift_time()){
//		case 3 : shift = "Night shift (10 PM to 6:30 AM)";break;
//		case 2 : shift = "Afternoon shift (2 PM to 10:30 PM)";break;
//		case 1 : shift = "Morning shift (6 AM to 2 PM)";break;
//		default	: shift = "General shift (9 AM to 5 PM)";
//		}
		tf16.setText(shift);tf16.setHorizontalAlignment(0);
		JLabel jl18 = new JLabel("EMPLOYMENT STATUS : ",JLabel.TRAILING);
		JTextField tf17 = new JTextField(10);
		tf17.setEditable(false);
		String active = "Active";
//		if(state==1){
//			active="Active";
//		}
//		else{
//			active="Not Active";
//		}
		tf17.setText(active);tf17.setHorizontalAlignment(0);
		
		JButton jedit = new JButton("EDIT");
		jedit.setVisible(true);
		
		
		JButton jsave = new JButton("SAVE");
		jsave.setVisible(false);
		
		
		/*
		 * TOGGLE BUTTON FOR EMPLOYEE ACTIVE/INACTIVE
		 */
		
		ActionListener actionListener = new ActionListener() {
		      public void actionPerformed(ActionEvent actionEvent) {
		        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
		        boolean selected = abstractButton.getModel().isSelected();
		        System.out.println("Action - selected=" + selected + "\n");
		        if(selected){
		        	tf17.setText("ACTIVE");tf17.setHorizontalAlignment(0);
		        }
		        else{
		        	tf17.setText("INACTIVE");tf17.setHorizontalAlignment(0);
		        }
		      }
		    };
		    ChangeListener changeListener = new ChangeListener() {
		      public void stateChanged(ChangeEvent changeEvent) {
		        AbstractButton abstractButton = (AbstractButton) changeEvent
		            .getSource();
		        ButtonModel buttonModel = abstractButton.getModel();
		        boolean armed = buttonModel.isArmed();
		        boolean pressed = buttonModel.isPressed();
		        if(pressed){
//		        	buttonModel.
		        }
		        boolean selected = buttonModel.isSelected();
		        System.out.println("Changed: " + pressed + "/"
		            + selected);
		      }
		    };
		    ItemListener itemListener = new ItemListener() {
		      public void itemStateChanged(ItemEvent itemEvent) {
		        int state = itemEvent.getStateChange();
		        if (state == ItemEvent.SELECTED) {
		          System.out.println("Selected");
		        } else {
		          System.out.println("Deselected");
		        }
		      }
		    };

		
		JToggleButton tb1 = new JToggleButton("CHANGE EMPLOYMENT STATUS",true);
		tb1.setEnabled(false);
		tb1.addActionListener(actionListener);
	    tb1.addChangeListener(changeListener);
	    tb1.addItemListener(itemListener);
	    
jedit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				jedit.setVisible(false);
				jsave.setVisible(true);
				tb1.setEnabled(true);
				tf0.setEditable(true);
				tf1.setEditable(true);
				tf2.setEditable(true);
				tf3.setEditable(true);
				tf4.setEditable(true);
				tf5.setEditable(true);
				tf6.setEditable(true);
				tf7.setEditable(true);
				tf8.setEditable(true);
				tf9.setEditable(true);
				tf10.setEditable(true);
				tf11.setEditable(true);
				tf12.setEditable(true);
				tf13.setEditable(true);
				tf14.setEditable(true);
				tf15.setEditable(true);
				tf16.setEditable(true);
				tf17.setEditable(true);
				
				/*
				 * 
				 */
				
			}
		}); 
		jsave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				jedit.setVisible(true);
				jsave.setVisible(false);
				tb1.setEnabled(false);
				tf0.setEditable(false);
				tf1.setEditable(false);
				tf2.setEditable(false);
				tf3.setEditable(false);
				tf4.setEditable(false);
				tf5.setEditable(false);
				tf6.setEditable(false);
				tf7.setEditable(false);
				tf8.setEditable(false);
				tf9.setEditable(false);
				tf10.setEditable(false);
				tf11.setEditable(false);
				tf12.setEditable(false);
				tf13.setEditable(false);
				tf14.setEditable(false);
				tf15.setEditable(false);
				tf16.setEditable(false);
				tf17.setEditable(false);
				/*
				 * 
				 */
				
			}
		}); 
		
	    
	/*
	 * 
	 */
	    jl0.setLabelFor(tf0);
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
	    
//		jl0.setBounds(,,,);
//		tf0.setBounds()
		jl1.setBounds(80, 0, 160, 30);
		tf1.setBounds(280,0,320,30);
		jl2.setBounds(680, 0, 160, 30);
		tf2.setBounds(880,0,320,30);		
		jl3.setBounds(80, 50, 160, 30);
		jsp1.setBounds(280,50,320,30);
		jl4.setBounds(680, 50, 160, 30);
		tf3.setBounds(880,50,320,30);		
		jl5.setBounds(80, 100, 160, 30);
		tf4.setBounds(280,100,320,30);
		jl6.setBounds(680, 100, 160, 30);
		tf5.setBounds(880,100,320,30);
		jl7.setBounds(80, 150, 160, 30);
		tf6.setBounds(280,150,320,30);
		jl8.setBounds(680, 150, 160, 30);
		tf7.setBounds(880,150,320,30);
		jl9.setBounds(80, 200, 160, 30);
		tf8.setBounds(280,200,320,30);
		jl10.setBounds(680, 200, 160, 30);
		tf9.setBounds(880,200,320,30);
		jl11.setBounds(80, 250, 160, 30);
		tf10.setBounds(280,250,320,30);
		jl12.setBounds(680, 250, 160, 30);
		tf11.setBounds(880,250,320,30);
		jl13.setBounds(80,300,160,30);
		tf12.setBounds(280,300,320,30);
		jl14.setBounds(680, 300, 160, 30);
		tf13.setBounds(880,300,320,30);
		jl15.setBounds(80,350,160,30);
		tf14.setBounds(280,350,320,30);
		jl16.setBounds(680, 350, 160, 30);
		tf15.setBounds(880,350,320,30);
		jl17.setBounds(80,400,160,30);
		tf16.setBounds(280,400,320,30);
		jl18.setBounds(680, 400, 160, 30);
		tf17.setBounds(880,400,320,30);
		
		jedit.setBounds(280,550,320,30);
		jsave.setBounds(280,550,320,30);
		tb1.setBounds(880,450,320,30);
		
		dpanel.add(jl1);dpanel.add(tf1);
		dpanel.add(jl2);dpanel.add(tf2);
		dpanel.add(jl3);dpanel.add(jsp1);
		dpanel.add(jl4);dpanel.add(tf3);
		dpanel.add(jl5);dpanel.add(tf4);
		dpanel.add(jl6);dpanel.add(tf5);
		dpanel.add(jl7);dpanel.add(tf6);
		dpanel.add(jl8);dpanel.add(tf7);
		dpanel.add(jl9);dpanel.add(tf8);
		dpanel.add(jl10);dpanel.add(tf9);
		dpanel.add(jl11);dpanel.add(tf10);
		dpanel.add(jl12);dpanel.add(tf11);
		dpanel.add(jl13);dpanel.add(tf12);
		dpanel.add(jl14);dpanel.add(tf13);
		dpanel.add(jl15);dpanel.add(tf14);
		dpanel.add(jl16);dpanel.add(tf15);
		dpanel.add(jl17);dpanel.add(tf16);
		dpanel.add(jl18);dpanel.add(tf17);

		dpanel.add(tb1);dpanel.add(jedit);dpanel.add(jsave);
		
		spanel.add(slabel);
		spanel.add(tfield);
		spanel.add(sbtn);
		
		
		ipanel.add(dpanel,BorderLayout.CENTER);
		ipanel.add(spanel,BorderLayout.NORTH);
		
		/*
		 * 
		 */
		
		
		JPanel i1panel = new JPanel();
		i1panel.setLayout(new BorderLayout());
		
		JButton tedit = new JButton("EDIT");
		JButton apply = new JButton("EDIT");
		
		Object ColumnNames[] = {"SOEID","NAME","EMAIL ID","PHONE NUMBER","TEAM","TIME SHIFT","","","Apply Leave"};
		Object RowData[][] = {{"AD62479","AD","ad.citi.com","984069113","ASD","MORNING SHIFT","EDIT","SAVE","APPLY LEAVE"},
				{"AD62479","AD","ad.citi.com","984069113","ASD","MORNING SHIFT","EDIT","SAVE","APPLY LEAVE"}};
		
		DefaultTableModel model = new DefaultTableModel(RowData, ColumnNames);
		JTable table = new JTable( model );
		Class<?> col_class = table.getColumnClass(0);
		table.setDefaultEditor(col_class, null);
		
		JScrollPane sp = new JScrollPane(table);
		table.setFillsViewportHeight(true);
		table.setDragEnabled(false);
		
		TableColumn tc = table.getColumnModel().getColumn(0);
		
		Action delete = new AbstractAction()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		        JTable table = (JTable)e.getSource();
		        int modelRow = Integer.valueOf( e.getActionCommand() );
		        ((DefaultTableModel)table.getModel()).removeRow(modelRow);
		    }
		};
		
		Action update = new AbstractAction()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		        JTable table = (JTable)e.getSource();
		        int modelRow = Integer.valueOf( e.getActionCommand() );
		        System.out.println(modelRow);
		        /*
		         * 
		         */
		    }
		};
		
		Action edit = new AbstractAction()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		        JTable table = (JTable)e.getSource();
		        int modelRow = Integer.valueOf( e.getActionCommand() );
//		        ((DefaultTableModel)table.getModel()).setValueAt(aValue, row, column);;
		        TableColumn sportColumn = table.getColumnModel().getColumn(5);
				JComboBox comboBox = new JComboBox();
				comboBox.addItem("MORNING SHIFT");
				comboBox.addItem("2nd SHIFT");
				comboBox.addItem("3rd SHIFT");
				sportColumn.setCellEditor(new DefaultCellEditor(comboBox));
				
		    }
		};
		
		Action applyleave = new AbstractAction()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		        tpane.setSelectedIndex(1);
		    }
		};
		
		ButtonColumn buttonColumn = new ButtonColumn(table, edit, 6);
		ButtonColumn buttonColumn1 = new ButtonColumn(table, update, 7);
		ButtonColumn buttonColumn2 = new ButtonColumn(table, applyleave, 8);
		
		
		i1panel.add(table.getTableHeader(), BorderLayout.PAGE_START);
		i1panel.add(table,BorderLayout.CENTER);
		
		
		ipanel.setVisible(false);
		i1panel.setVisible(true);

		JPanel cp = new JPanel();
		
		if(ipanel.isVisible()){
			cp = ipanel;
		}
		else if(i1panel.isVisible()){
			cp=i1panel;
		}
		opanel.add(hlabel,BorderLayout.NORTH);
		opanel.add(cp,BorderLayout.CENTER);
	/*
	 * 
	 */
		JPanel lpanel = new JPanel();
		lpanel.setLayout(new FlowLayout());
		JButton jhome = new JButton("GO BACK");
		jhome.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
		        tpane.setSelectedIndex(0);
			}
		});
		
		lpanel.add(jhome);
		
//		tpane.addTab("HOME", null, spane, "Go to tab 1");
		tpane.addTab("VIEW EMPLOYEE DETAILS", null, opanel, "Go to tab 2");
//		tpane.addTab("ADD EMPLOYEE", null, pane4, "Go to tab 3");
		tpane.addTab("APPLY LEAVE", null, lpanel, "Apply for a leave");
//		tpane.setEnabledAt(1,true);
		/*
		 * 
		 */
		f1.getContentPane().add(tpane);
		f1.setSize(1680, 1000);
		f1.setMinimumSize(new Dimension(1680,1000));
		f1.setVisible(true);
	}

}
