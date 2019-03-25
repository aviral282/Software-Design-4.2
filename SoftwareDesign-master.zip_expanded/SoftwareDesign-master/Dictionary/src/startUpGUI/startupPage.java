package startUpGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import binarysearchtree.DictionaryGUI;
import hashtable.DictionaryGUIhash;
import java.awt.Color;;
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
		frmStartUpPage.setBounds(100, 100, 259, 300);
		frmStartUpPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStartUpPage.getContentPane().setLayout(null);
		
		JButton btnHashtable = new JButton("Using HashTable");
		btnHashtable.setBackground(Color.ORANGE);
		btnHashtable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DictionaryGUIhash(); 
				frmStartUpPage.dispose();
			}
		});
		btnHashtable.setBounds(20, 83, 200, 59);
		frmStartUpPage.getContentPane().add(btnHashtable);
		
		JButton btnBST = new JButton("Using Binary Search Tree");
		btnBST.setBackground(Color.ORANGE);
		btnBST.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DictionaryGUI();
				frmStartUpPage.dispose();
			}
		});
		btnBST.setBounds(20, 153, 200, 59);
		frmStartUpPage.getContentPane().add(btnBST);
		
		JLabel lblNewLabel = new JLabel("Dictionary");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(73, 44, 113, 28);
		frmStartUpPage.getContentPane().add(lblNewLabel);
	}

}
