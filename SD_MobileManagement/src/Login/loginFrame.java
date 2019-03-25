package Login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Core.MainFrame;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class loginFrame {

	private JFrame frame;
	private JTextField uname;
	private JPasswordField pf1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginFrame window = new loginFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public loginFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 485, 394);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(45, 122, 97, 25);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(45, 196, 116, 22);
		frame.getContentPane().add(lblNewLabel_1);

		uname = new JTextField();
		uname.setBounds(274, 125, 116, 22);
		frame.getContentPane().add(uname);
		uname.setColumns(10);

		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (pf1.getText().equals("admin") && uname.getText().equals("admin")) {
					DialogMessage.showInfoDialog("Login Sucessful");
					MainFrame m = new MainFrame();
					m.setVisible(true);
				}
			}
		});
		btnNewButton.setBounds(293, 275, 97, 25);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.setBounds(45, 275, 97, 25);
		frame.getContentPane().add(btnNewButton_1);

		JLabel lblNewLabel_2 = new JLabel("Mobile management System");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_2.setBounds(45, 33, 345, 28);
		frame.getContentPane().add(lblNewLabel_2);

		pf1 = new JPasswordField();
		pf1.setBounds(274, 198, 116, 22);
		frame.getContentPane().add(pf1);
	}
}
