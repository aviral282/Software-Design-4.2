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
import javax.swing.UIManager;
import javax.swing.JTextArea;
import java.awt.SystemColor;


public class DictionaryGUIhash extends JFrame implements Serializable{

	private JFrame frmDictionaryhashTable;
	private JTextField txtNum;
	private JTextField txtName;
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
		frmDictionaryhashTable.setBounds(100, 100, 525, 708);
		frmDictionaryhashTable.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDictionaryhashTable.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Telephone Directory Implemented Using Hash Table");
		lblNewLabel.setForeground(UIManager.getColor("Button.foreground"));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(12, 31, 491, 41);
		frmDictionaryhashTable.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Enter Number");
		lblNewLabel_2.setForeground(UIManager.getColor("Button.foreground"));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(23, 102, 147, 17);
		frmDictionaryhashTable.getContentPane().add(lblNewLabel_2);
		
		txtNum = new JTextField();
		txtNum.setBounds(229, 99, 262, 20);
		frmDictionaryhashTable.getContentPane().add(txtNum);
		txtNum.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Enter Name");
		lblNewLabel_3.setForeground(UIManager.getColor("Button.foreground"));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(23, 151, 110, 18);
		frmDictionaryhashTable.getContentPane().add(lblNewLabel_3);
		
		txtName = new JTextField();
		txtName.setBounds(229, 150, 262, 20);
		frmDictionaryhashTable.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBackground(Color.CYAN);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				txtNum.setText("");
				txtName.setText("");
			}
		});
		btnClear.setBounds(12, 345, 179, 41);
		frmDictionaryhashTable.getContentPane().add(btnClear);
		
		JButton btnSearch = new JButton("Search Number");
		btnSearch.setBackground(Color.CYAN);
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String search = txtNum.getText().toString().trim();
					 if(hashtable.containsKey(search)==true)
					   {
						// DialogMessage.showInfoDialog("Telephone Number of:" +search+" is "+hashtable.get(search));
						 DialogMessage.showInfoDialog("Telephone Number of:" +hashtable.get(search)+" is "+search);
						  
					   }
				       else
				       {
				    	 
				    	   DialogMessage.showInfoDialog("Doesn't Exist In the Directory");
				       }
				 
			}
		});
		btnSearch.setBounds(313, 259, 179, 41);
		frmDictionaryhashTable.getContentPane().add(btnSearch);
		
		JButton btnInsert = new JButton("Insert");
		btnInsert.setForeground(Color.BLACK);
		btnInsert.setBackground(Color.LIGHT_GRAY);
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String key = txtNum.getText().toString().trim();
				String value = txtName.getText().toString().trim();
				hashtable.put(key, value);
				DialogMessage.showInfoDialog("Successfully Inserted Into Directory:" +key);
			}
		});
		btnInsert.setBounds(12, 194, 480, 41);
		frmDictionaryhashTable.getContentPane().add(btnInsert);
		
		JButton btnIterate = new JButton("Iterate");
		btnIterate.setBackground(Color.CYAN);
		btnIterate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iterate();
			}
		});
		btnIterate.setBounds(12, 259, 179, 41);
		frmDictionaryhashTable.getContentPane().add(btnIterate);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new startupPage();
				frmDictionaryhashTable.dispose();
			}
		});
		btnNewButton.setBounds(313, 343, 179, 44);
		frmDictionaryhashTable.getContentPane().add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(SystemColor.menu);
		textArea.setBounds(40, 421, 408, 216);
		frmDictionaryhashTable.getContentPane().add(textArea);
	}
}
