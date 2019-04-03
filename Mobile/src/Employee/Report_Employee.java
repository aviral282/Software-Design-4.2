package Employee;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Report_Employee extends JPanel {

	public Report_Employee() {
		initializeUI();
	}

	private void initializeUI() {
		setPreferredSize(new Dimension(539, 323));
		setLayout(null);

		JTable table = new JTable(25, 15);

	
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		JScrollPane pane = new JScrollPane(table);
		pane.setBounds(76, 120, 372, 187);
		add(pane);

		JButton btn_Generate = new JButton("GENERATE");
		btn_Generate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				binarySearch tree = binarySearch.getInstance();
				
				tree.printTree();
				table.setModel(tree.model);
			}
		});
		btn_Generate.setForeground(SystemColor.desktop);
		btn_Generate.setFont(new Font("Arial Black", Font.BOLD, 18));
		btn_Generate.setBounds(114, 77, 288, 25);
		add(btn_Generate);

		JLabel lblEmployeeReport = new JLabel("Employee Report");
		lblEmployeeReport.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmployeeReport.setForeground(SystemColor.desktop);
		lblEmployeeReport.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblEmployeeReport.setBounds(161, 1, 218, 50);
		add(lblEmployeeReport);

	}

	public static void showFrame() {
		JPanel panel = new Report_Employee();
		panel.setOpaque(true);
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setTitle("Employees Report");
		frame.setContentPane(panel);
		frame.pack();
		frame.setVisible(true);
	}

}