package Menu;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.LineBorder;

import Employee.binarySearch;
import Mobile.HashTable;
import vendor.HashTableVendor;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class MainMenu extends JPanel {


	
	public static HashTableVendor ctable = new HashTableVendor();
	
	/**
	 * Create the panel.
	 */
	public MainMenu() {
		setBorder(new LineBorder(new Color(0, 0, 0), 3));
		setLayout(null);
		
		JButton btnProductHashTable = new JButton("Mobiles");
		btnProductHashTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				HashTable table = HashTable.getInstance();
				table.insert(1,"Samsung", 28,3);
				table.insert(2,"iPhone", 50,4);
				table.insert(3,"MI8",35,5);
				table.insert(4,"OnePlus 5", 56,5);
				table.insert(5,"Nokia",22,2);
				table.insert(6,"honor", 56,5);
				table.insert(7,"huawei",39,8);
			}
		});
		btnProductHashTable.setForeground(SystemColor.desktop);
		btnProductHashTable.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnProductHashTable.setBounds(12, 177, 141, 25);
		add(btnProductHashTable);
		
		JLabel lblStoreManagementSystem = new JLabel("Mobile Management System");
		lblStoreManagementSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblStoreManagementSystem.setForeground(Color.BLACK);
		lblStoreManagementSystem.setFont(new Font("Arial Black", Font.BOLD, 24));
		lblStoreManagementSystem.setBounds(12, 30, 469, 50);
		add(lblStoreManagementSystem);
		
		JLabel lblInitializeStructures = new JLabel("Initialize The Entries");
		lblInitializeStructures.setHorizontalAlignment(SwingConstants.CENTER);
		lblInitializeStructures.setForeground(SystemColor.desktop);
		lblInitializeStructures.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblInitializeStructures.setBounds(12, 111, 481, 23);
		add(lblInitializeStructures);
		
		JButton btnEmployees = new JButton("Employees");
		btnEmployees.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				binarySearch btree = binarySearch.getInstance();
				btree.insert(1,"Jason",25, 200);
				btree.insert(2,"Logan",42, 663);
				btree.insert(3,"Edward",26, 225);
				btree.insert(4,"Cobra",31, 459);
				btree.insert(5,"Mike",69, 425);
				btree.insert(6,"Alita",25, 75);
				btree.insert(7,"Hortis",96, 36);
			}
		});
		btnEmployees.setForeground(SystemColor.desktop);
		btnEmployees.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnEmployees.setBounds(354, 177, 149, 25);
		add(btnEmployees);
		
		JButton btnCustomers = new JButton("Vendors");
		btnCustomers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ctable.insertCustomer(1, "Pavol");
				ctable.insertCustomer(2, "Ravol");
				ctable.insertCustomer(3, "Trevor");
				ctable.insertCustomer(4, "Clover");
				ctable.insertCustomer(5, "Tristen");
				ctable.insertCustomer(6, "Thompson");
				ctable.insertCustomer(7, "Kim");
			}
		});
		btnCustomers.setForeground(SystemColor.desktop);
		btnCustomers.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnCustomers.setBounds(180, 177, 135, 25);
		add(btnCustomers);

		
	}
}
