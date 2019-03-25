package Login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

import Menu.MainFrame;
import Misc.DialogMessage;
import Mobile.HashTable;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.SystemColor;

public class LoginFrame extends JFrame {
	private JTextField txt_uname;
	private JPasswordField txt_pwd;
	private static boolean created = false;
	private static LoginFrame single;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { LoginFrame frame = new LoginFrame();
	 * frame.setVisible(true); } catch (Exception e) { e.printStackTrace(); } } });
	 * }
	 */

	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		setBounds(100, 100, 430, 320);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JLabel lbltitle = new JLabel("Mobile Management System");
		lbltitle.setFont(new Font("Arial Black", Font.BOLD, 20));
		lbltitle.setForeground(SystemColor.desktop);
		lbltitle.setBounds(36, 13, 382, 50);
		getContentPane().add(lbltitle);

		created = true;
		JLabel lblUsername = new JLabel("Username: ");
		lblUsername.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblUsername.setForeground(SystemColor.desktop);
		lblUsername.setBounds(46, 84, 125, 23);
		getContentPane().add(lblUsername);

		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setForeground(SystemColor.desktop);
		lblPassword.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblPassword.setBounds(47, 148, 125, 23);
		getContentPane().add(lblPassword);

		txt_uname = new JTextField();
		txt_uname.setForeground(new Color(65, 105, 225));
		txt_uname.setFont(new Font("Arial", Font.BOLD, 15));
		txt_uname.setBounds(219, 86, 116, 22);
		getContentPane().add(txt_uname);
		txt_uname.setColumns(10);

		JButton btn_SignIn = new JButton("Sign In");
		btn_SignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String uname = txt_uname.getText();
				String pwd = new String(txt_pwd.getPassword());

				if (uname.equals("admin") && pwd.equals("admin")) {
					DialogMessage.showInfoDialog("Logged in");
					txt_uname.setText("");
					txt_pwd.setText("");
					MainFrame m = new MainFrame();
					m.setVisible(true);
					setVisible(false);
				} else {
					DialogMessage.showWarningDialog("Wrong Credentials");
					txt_uname.setText("");
					txt_pwd.setText("");
				}
			}
		});
		btn_SignIn.setForeground(SystemColor.desktop);
		btn_SignIn.setFont(new Font("Arial Black", Font.BOLD, 18));
		btn_SignIn.setBounds(147, 215, 131, 25);
		getContentPane().add(btn_SignIn);

		txt_pwd = new JPasswordField();
		txt_pwd.setForeground(new Color(65, 105, 225));
		txt_pwd.setFont(new Font("Arial", Font.BOLD, 15));
		txt_pwd.setBounds(219, 150, 116, 22);
		getContentPane().add(txt_pwd);

	}

	public static LoginFrame getInstance() {
		if (!created) {
			single = new LoginFrame();
		}
		return single;
	}
}
