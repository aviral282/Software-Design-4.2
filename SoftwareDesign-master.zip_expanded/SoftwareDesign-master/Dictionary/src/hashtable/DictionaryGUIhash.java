package hashtable;

import java.awt.EventQueue;
import java.io.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import startUpGUI.startupPage;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class DictionaryGUIhash extends JFrame implements Serializable{

	private JFrame frmDictionaryhashTable;
	private JTextField txtWord;
	private JTextField txtMeaning;
	Hashtable<String, String> hashtable = new Hashtable<String, String>();
	
	 String str;
	 
	 public void iterate()
	 {
		 Set<String> keys = hashtable.keySet();
			Iterator<String> itr = keys.iterator();
		 while(itr.hasNext())
		 {
			 str = itr.next();
		     System.out.println("Key: "+str+" & Value: "+hashtable.get(str));
		 }
	 }
	 /**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DictionaryGUIhash window = new DictionaryGUIhash();
					window.frmDictionaryhashTable.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DictionaryGUIhash() {
		initialize();
		frmDictionaryhashTable.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDictionaryhashTable = new JFrame();
		frmDictionaryhashTable.getContentPane().setBackground(Color.WHITE);
		frmDictionaryhashTable.setForeground(Color.WHITE);
		frmDictionaryhashTable.setBackground(Color.WHITE);
		frmDictionaryhashTable.setTitle("Dictionary (Hash Table)");
		frmDictionaryhashTable.setBounds(100, 100, 433, 450);
		frmDictionaryhashTable.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDictionaryhashTable.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dictionary Implemented Using Hash Table");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(57, 31, 315, 41);
		frmDictionaryhashTable.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Enter word");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_2.setBounds(23, 83, 110, 14);
		frmDictionaryhashTable.getContentPane().add(lblNewLabel_2);
		
		txtWord = new JTextField();
		txtWord.setBounds(135, 81, 262, 20);
		frmDictionaryhashTable.getContentPane().add(txtWord);
		txtWord.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Enter Meaning");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_3.setBounds(23, 119, 110, 18);
		frmDictionaryhashTable.getContentPane().add(lblNewLabel_3);
		
		txtMeaning = new JTextField();
		txtMeaning.setBounds(135, 119, 262, 20);
		frmDictionaryhashTable.getContentPane().add(txtMeaning);
		txtMeaning.setColumns(10);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBackground(Color.ORANGE);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				txtWord.setText("");
				txtMeaning.setText("");
			}
		});
		btnClear.setBounds(23, 304, 373, 41);
		frmDictionaryhashTable.getContentPane().add(btnClear);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBackground(Color.ORANGE);
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String search = txtWord.getText().toString().trim();
					 if(hashtable.containsKey(search)==true)
					   {
						   System.out.println("Meaning of "+search+"is"+hashtable.get(search));
					   }
				       else
				       {
				    	   System.out.println("Doesn't Exist");
				       }
				 
			}
		});
		btnSearch.setBounds(24, 252, 373, 41);
		frmDictionaryhashTable.getContentPane().add(btnSearch);
		
		JButton btnInsert = new JButton("Insert");
		btnInsert.setForeground(Color.BLACK);
		btnInsert.setBackground(Color.ORANGE);
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String key = txtWord.getText().toString().trim();
				String value = txtMeaning.getText().toString().trim();
				hashtable.put(key, value);
				DialogMessage.showInfoDialog("Successfully inserted:" +key);
			}
		});
		btnInsert.setBounds(23, 148, 373, 41);
		frmDictionaryhashTable.getContentPane().add(btnInsert);
		
		JButton btnIterate = new JButton("Iterate");
		btnIterate.setBackground(Color.ORANGE);
		btnIterate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iterate();
			}
		});
		btnIterate.setBounds(24, 200, 373, 41);
		frmDictionaryhashTable.getContentPane().add(btnIterate);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new startupPage();
				frmDictionaryhashTable.dispose();
			}
		});
		btnNewButton.setBounds(23, 356, 374, 44);
		frmDictionaryhashTable.getContentPane().add(btnNewButton);
	}
}
