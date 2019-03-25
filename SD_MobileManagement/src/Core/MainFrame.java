package Core;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/*
import Customer.Add_Customers;
import Customer.Report_Customer;
import Customer.Search_Customer;
import Employee.Add_Employee;
import Employee.Search_Employee;
import Misc.DialogMessage;
import Products.Add_Products;
import Products.Report_Products;
import Products.Update_Products;
*/
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JMenuItem;
import java.awt.Panel;
import java.awt.CardLayout;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	static CardLayout cardLayout;
	static JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		init();
	}

	public void init() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 741, 588);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 740, 26);
		contentPane.add(menuBar);

		JMenu mnFile = new JMenu("Back");
		mnFile.setBackground(new Color(192, 192, 192));
		mnFile.setForeground(new Color(65, 105, 225));
		mnFile.setFont(new Font("Arial Black", Font.BOLD, 16));
		menuBar.add(mnFile);

		JMenu mnEmployees = new JMenu("Employees");
		mnEmployees.setForeground(new Color(65, 105, 225));
		mnEmployees.setFont(new Font("Arial Black", Font.BOLD, 16));
		mnEmployees.setBackground(Color.LIGHT_GRAY);
		menuBar.add(mnEmployees);
		JMenuItem menu_Add_Employee = new JMenuItem("Add Employee");
		menu_Add_Employee.setBackground(new Color(255, 228, 196));
		menu_Add_Employee.setForeground(new Color(65, 105, 225));
		menu_Add_Employee.setFont(new Font("Arial", Font.BOLD, 14));

		mnEmployees.add(menu_Add_Employee);

		JMenuItem menu_emp_SearchEmp = new JMenuItem("Search Employee");
		menu_emp_SearchEmp.setForeground(new Color(65, 105, 225));
		menu_emp_SearchEmp.setFont(new Font("Arial", Font.BOLD, 14));
		menu_emp_SearchEmp.setBackground(new Color(255, 228, 196));
		mnEmployees.add(menu_emp_SearchEmp);

		JMenu mnProducts = new JMenu("Products");
		mnProducts.setForeground(new Color(65, 105, 225));
		mnProducts.setFont(new Font("Arial Black", Font.BOLD, 16));
		mnProducts.setBackground(Color.LIGHT_GRAY);
		menuBar.add(mnProducts);

		JMenuItem menu_Add_Products = new JMenuItem("Add Products");
		menu_Add_Products.setForeground(new Color(65, 105, 225));
		menu_Add_Products.setFont(new Font("Arial", Font.BOLD, 14));
		menu_Add_Products.setBackground(new Color(255, 228, 196));
		mnProducts.add(menu_Add_Products);

		JMenuItem menu_Search_Products = new JMenuItem("Update Products");
		menu_Search_Products.setForeground(new Color(65, 105, 225));
		menu_Search_Products.setFont(new Font("Arial", Font.BOLD, 14));
		menu_Search_Products.setBackground(new Color(255, 228, 196));
		mnProducts.add(menu_Search_Products);

		JMenuItem mntmSearchProducts = new JMenuItem("Search Products");
		mntmSearchProducts.setForeground(new Color(65, 105, 225));
		mntmSearchProducts.setFont(new Font("Arial", Font.BOLD, 14));
		mntmSearchProducts.setBackground(new Color(255, 228, 196));
		mnProducts.add(mntmSearchProducts);

		JMenu mnCustomers = new JMenu("Customers");
		mnCustomers.setForeground(new Color(65, 105, 225));
		mnCustomers.setFont(new Font("Arial Black", Font.BOLD, 16));
		mnCustomers.setBackground(Color.LIGHT_GRAY);
		menuBar.add(mnCustomers);

		JMenuItem mntmAddCustomer = new JMenuItem("Add Customer");
		mntmAddCustomer.setForeground(new Color(65, 105, 225));
		mntmAddCustomer.setFont(new Font("Arial", Font.BOLD, 14));
		mntmAddCustomer.setBackground(new Color(255, 228, 196));
		mnCustomers.add(mntmAddCustomer);

		JMenuItem mntmSearchCustomer = new JMenuItem("Search Customer");
		mntmSearchCustomer.setForeground(new Color(65, 105, 225));
		mntmSearchCustomer.setFont(new Font("Arial", Font.BOLD, 14));
		mntmSearchCustomer.setBackground(new Color(255, 228, 196));
		mnCustomers.add(mntmSearchCustomer);

		JMenu mnReports = new JMenu("Reports");
		mnReports.setForeground(new Color(65, 105, 225));
		mnReports.setFont(new Font("Arial Black", Font.BOLD, 16));
		mnReports.setBackground(Color.LIGHT_GRAY);
		menuBar.add(mnReports);

		JMenuItem mntmProductsReport = new JMenuItem("Products Report");
		mntmProductsReport.setForeground(new Color(65, 105, 225));
		mntmProductsReport.setFont(new Font("Arial", Font.BOLD, 14));
		mntmProductsReport.setBackground(new Color(255, 228, 196));
		mnReports.add(mntmProductsReport);

		JMenuItem mntmCustomerReport = new JMenuItem("Customer Report");
		mntmCustomerReport.setForeground(new Color(65, 105, 225));
		mntmCustomerReport.setFont(new Font("Arial", Font.BOLD, 14));
		mntmCustomerReport.setBackground(new Color(255, 228, 196));
		mnReports.add(mntmCustomerReport);

		cardLayout = new CardLayout();
		panel = new JPanel(cardLayout);
		panel.setBounds(0, 27, 723, 501);
		contentPane.add(panel);

		/*
		 * JPanel MainMenu = new MainMenu(); panel.add(MainMenu,"Main");
		 * 
		 * JPanel Search_Employee = new Search_Employee();
		 * panel.add(Search_Employee,"Search_Emp");
		 * 
		 * JPanel Search_Customer = new Search_Customer();
		 * panel.add(Search_Customer,"Search_Cust");
		 * 
		 * JPanel Add_Customers = new Add_Customers();
		 * panel.add(Add_Customers,"Add_Cust");
		 * 
		 * JPanel Add_Employee = new Add_Employee(); panel.add(Add_Employee,"Add_Emp");
		 * JPanel Add_Products = new Add_Products();
		 * panel.add(Add_Products,"Add_Product"); JPanel Update_Products = new
		 * Update_Products(); panel.add(Update_Products,"Update_Products");
		 * 
		 * JPanel Report_Products = new Report_Products();
		 * panel.add(Report_Products,"Rep_Prod");
		 * 
		 * JPanel Report_Customer = new Report_Customer();
		 * panel.add(Report_Customer,"Rep_Cust");
		 * 
		 * JPanel Search_Products = new Products.Search_Products();
		 * panel.add(Search_Products,"Search_Prod");
		 * 
		 */

		menu_emp_SearchEmp.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(panel, "Search_Emp");
			}
		});

		menu_Add_Employee.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				cardLayout.show(panel, "Add_Emp");
			}
		});
		menu_Add_Products.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(panel, "Add_Product");
			}
		});

		menu_Search_Products.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(panel, "Update_Products");
			}
		});

		mntmAddCustomer.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(panel, "Add_Cust");
			}
		});

		mntmSearchCustomer.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(panel, "Search_Cust");
			}
		});

		mntmProductsReport.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(panel, "Rep_Prod");
			}
		});

		mntmSearchProducts.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(panel, "Search_Prod");
			}
		});

		mntmCustomerReport.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.show(panel, "Rep_Cust");
			}
		});
	}

	public static void backHome() {
		// JPanel MainMenu = new MainMenu();
		cardLayout.show(panel, "Main");
	}
}

/*
 * import java.awt.EventQueue;
 * 
 * import javax.swing.JFrame; import javax.swing.JMenuBar; import
 * javax.swing.JMenu; import java.awt.CardLayout; import javax.swing.JPanel;
 * 
 * public class MainFrame {
 * 
 * private JFrame frame;
 * 
 * public static void main(String[] args) { EventQueue.invokeLater(new
 * Runnable() { public void run() { try { MainFrame window = new MainFrame();
 * window.frame.setVisible(true); } catch (Exception e) { e.printStackTrace(); }
 * } }); }
 * 
 * /** Create the application.
 */
/*
 * public MainFrame() { initialize(); }
 * 
 * /** Initialize the contents of the frame.
 */
/*
 * 
 * private void initialize() { frame = new JFrame(); frame.setBounds(100, 100,
 * 648, 566); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 * frame.getContentPane().setLayout(new CardLayout(0, 0));
 * 
 * JPanel panel = new JPanel(); panel.setBounds(20,20,20,20);
 * frame.getContentPane().add(panel, "name_84114921818600");
 * 
 * JPanel panel_1 = new JPanel(); frame.getContentPane().add(panel_1,
 * "name_89522282501500"); } }
 */
