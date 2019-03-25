package binarysearchtree;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import startUpGUI.startupPage;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class DictionaryGUI extends JFrame{

	private JFrame frmDictionarybinarySearch;
	private JTextField txtKey;
	private JTextField txtWord;
	private JTextField txtMeaning;
	BSTree obj = new BSTree();String arr[] = new String[100];
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DictionaryGUI window = new DictionaryGUI();
					window.frmDictionarybinarySearch.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DictionaryGUI() {
		initialize();
		frmDictionarybinarySearch.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDictionarybinarySearch = new JFrame();
		frmDictionarybinarySearch.getContentPane().setBackground(Color.WHITE);
		frmDictionarybinarySearch.setTitle("Dictionary (Binary Search Tree)");
		frmDictionarybinarySearch.setBounds(100, 100, 438, 486);
		frmDictionarybinarySearch.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDictionarybinarySearch.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dictionary Implemented Using Binary Search Tree");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(45, 27, 367, 25);
		frmDictionarybinarySearch.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Unique ID");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1.setBounds(24, 78, 202, 14);
		frmDictionarybinarySearch.getContentPane().add(lblNewLabel_1);
		
		txtKey = new JTextField();
		txtKey.setBounds(140, 76, 262, 20);
		frmDictionarybinarySearch.getContentPane().add(txtKey);
		txtKey.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Enter word");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_2.setBounds(24, 125, 110, 14);
		frmDictionarybinarySearch.getContentPane().add(lblNewLabel_2);
		
		txtWord = new JTextField();
		txtWord.setBounds(140, 123, 262, 20);
		frmDictionarybinarySearch.getContentPane().add(txtWord);
		txtWord.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Enter Meaning");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_3.setBounds(24, 181, 110, 18);
		frmDictionarybinarySearch.getContentPane().add(lblNewLabel_3);
		
		txtMeaning = new JTextField();
		txtMeaning.setBounds(140, 179, 262, 20);
		frmDictionarybinarySearch.getContentPane().add(txtMeaning);
		txtMeaning.setColumns(10);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBackground(Color.ORANGE);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtKey.setText("");
				txtWord.setText("");
				txtMeaning.setText("");
			}
		});
		btnClear.setBounds(24, 350, 378, 39);
		frmDictionarybinarySearch.getContentPane().add(btnClear);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBackground(Color.ORANGE);
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int k = Integer.parseInt(txtKey.getText().toString());
				try
				{
					DialogMessage.showInfoDialog("Value Found:"+obj.search(k).readName()+ "  "+"Meaning is:"+arr[k]);
				}
				catch(Exception ex)
				{
					DialogMessage.showInfoDialog("Value Not Found");
				}
			}
		});
		btnSearch.setBounds(24, 300, 378, 39);
		frmDictionarybinarySearch.getContentPane().add(btnSearch);
		
		JButton btnMeaning = new JButton("Insert Meaning");
		btnMeaning.setBackground(Color.ORANGE);
		btnMeaning.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int k = Integer.parseInt(txtKey.getText().toString());
				String n = txtWord.getText().toString().trim();
				String meaning = txtMeaning.getText().toString().trim();
				
				String res = obj.search(k).readName();
				if(res.equals(n))
				{
					DialogMessage.showInfoDialog("Word exists, Meaning added");
					arr[k] = meaning;
				}obj.display_tree();
			}
		});
		btnMeaning.setBounds(24, 251, 378, 38);
		frmDictionarybinarySearch.getContentPane().add(btnMeaning);
		
		JButton btnInsert = new JButton(" Insert Word");
		btnInsert.setBackground(Color.ORANGE);
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int k = Integer.parseInt(txtKey.getText().toString());
				String n = txtWord.getText().toString().trim();
				obj.insert(k, n);obj.display_tree();
			}
		});
		btnInsert.setBounds(24, 206, 378, 38);
		frmDictionarybinarySearch.getContentPane().add(btnInsert);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new startupPage();
				frmDictionarybinarySearch.dispose();
			}
		});
		btnNewButton.setBounds(24, 400, 378, 36);
		frmDictionarybinarySearch.getContentPane().add(btnNewButton);
	}
}
