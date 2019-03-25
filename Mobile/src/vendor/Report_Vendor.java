package vendor;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import Menu.MainFrame;
import Menu.MainMenu;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Report_Vendor extends JPanel {

	public Report_Vendor() {
		initializeUI();
	}

	private void initializeUI() {
		setPreferredSize(new Dimension(539, 323));
		setLayout(null);

		JTable table = new JTable(25, 15);

		// Turn off JTable's auto resize so that JScrollPane will show a
		// horizontal scroll bar.
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		JScrollPane pane = new JScrollPane(table);
		pane.setBounds(76, 120, 372, 187);
		add(pane);

		JButton btn_Generate = new JButton("GENERATE");
		btn_Generate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = MainMenu.ctable.printReport();
				table.setModel(model);
			}
		});
		btn_Generate.setForeground(SystemColor.desktop);
		btn_Generate.setFont(new Font("Arial Black", Font.BOLD, 18));
		btn_Generate.setBounds(114, 77, 288, 25);
		add(btn_Generate);

		JLabel lblProductReport = new JLabel("Vendor Report");
		lblProductReport.setHorizontalAlignment(SwingConstants.CENTER);
		lblProductReport.setForeground(SystemColor.desktop);
		lblProductReport.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblProductReport.setBounds(161, 1, 218, 50);
		add(lblProductReport);

	}

	public static void showFrame() {
		JPanel panel = new Report_Vendor();
		panel.setOpaque(true);
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setTitle("Employees Report");
		frame.setContentPane(panel);
		frame.pack();
		frame.setVisible(true);
	}

	/*
	 * public static void main(String[] args) { SwingUtilities.invokeLater(new
	 * Runnable() { public void run() { Report_Customer.showFrame(); } }); }
	 */
}