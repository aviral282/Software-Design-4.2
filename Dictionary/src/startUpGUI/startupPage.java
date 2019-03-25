package startUpGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import hashtable.DictionaryGUIhash;
import java.awt.Color;
import javax.swing.UIManager;;
public class startupPage extends JFrame{

	private JFrame frmStartUpPage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					startupPage window = new startupPage();
					window.frmStartUpPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public startupPage() {
		initialize();
		frmStartUpPage.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStartUpPage = new JFrame();
		frmStartUpPage.getContentPane().setBackground(Color.WHITE);
		frmStartUpPage.setTitle("Start Up Page");
		frmStartUpPage.setBounds(100, 100, 503, 551);
		frmStartUpPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStartUpPage.getContentPane().setLayout(null);
		
		JButton btnHashtable = new JButton("Start");
		btnHashtable.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnHashtable.setBackground(Color.RED);
		btnHashtable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DictionaryGUIhash(); 
				frmStartUpPage.dispose();
			}
		});
		btnHashtable.setBounds(138, 282, 200, 80);
		frmStartUpPage.getContentPane().add(btnHashtable);
		
		JLabel lblNewLabel = new JLabel("Telephone Directory Implementation");
		lblNewLabel.setForeground(UIManager.getColor("Button.darkShadow"));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel.setBounds(28, 91, 410, 64);
		frmStartUpPage.getContentPane().add(lblNewLabel);
		
		JLabel lblUsingHashTable = new JLabel("Using Hash Table");
		lblUsingHashTable.setForeground(UIManager.getColor("Button.darkShadow"));
		lblUsingHashTable.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblUsingHashTable.setBounds(153, 169, 152, 64);
		frmStartUpPage.getContentPane().add(lblUsingHashTable);
	}
}
