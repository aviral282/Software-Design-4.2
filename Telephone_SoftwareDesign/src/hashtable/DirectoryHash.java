package hashtable;

import java.awt.EventQueue;
import java.io.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import startUpGUI.StartScreen;

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

public class DirectoryHash extends JFrame implements Serializable {

	private JFrame teleFrame;
	private JTextField txtNum;
	private JTextField txtName;
	private JTextArea textArea1;
	Hashtable<String, String> htable = new Hashtable<String, String>();

	String str;

	public void iterate() {
		Set<String> keys = htable.keySet();
		Iterator<String> itr = keys.iterator();
		while (itr.hasNext()) {
			str = itr.next();

			textArea1.append("Telephone Number: " + str + " & Name: " + htable.get(str) + "\n");
		}
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DirectoryHash window = new DirectoryHash();
					window.teleFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DirectoryHash() {
		initialize();
		teleFrame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		teleFrame = new JFrame();
		teleFrame.getContentPane().setBackground(SystemColor.menu);
		teleFrame.setForeground(Color.WHITE);
		teleFrame.setBackground(Color.WHITE);
		teleFrame.setTitle("Hash Table Implementaion");
		teleFrame.setBounds(100, 100, 525, 708);
		teleFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		teleFrame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Telephone Directory Implemented Using Hash Table");
		lblNewLabel.setForeground(UIManager.getColor("Button.foreground"));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(12, 31, 491, 41);
		teleFrame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_2 = new JLabel("Enter Number");
		lblNewLabel_2.setForeground(UIManager.getColor("Button.foreground"));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(23, 102, 147, 17);
		teleFrame.getContentPane().add(lblNewLabel_2);

		textArea1 = new JTextArea();
		textArea1.setBackground(SystemColor.activeCaptionBorder);
		textArea1.setBounds(40, 421, 408, 216);
		teleFrame.getContentPane().add(textArea1);

		txtNum = new JTextField();
		txtNum.setBounds(229, 99, 262, 20);
		teleFrame.getContentPane().add(txtNum);
		txtNum.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Enter Name");
		lblNewLabel_3.setForeground(UIManager.getColor("Button.foreground"));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(23, 151, 110, 18);
		teleFrame.getContentPane().add(lblNewLabel_3);

		txtName = new JTextField();
		txtName.setBounds(229, 150, 262, 20);
		teleFrame.getContentPane().add(txtName);
		txtName.setColumns(10);

		JButton btnClear = new JButton("Clear");
		btnClear.setBackground(SystemColor.activeCaption);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				txtNum.setText("");
				txtName.setText("");
				textArea1.setText("");
			}
		});
		btnClear.setBounds(12, 345, 179, 41);
		teleFrame.getContentPane().add(btnClear);

		JButton btnSearch = new JButton("Search Number");
		btnSearch.setBackground(SystemColor.activeCaption);
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String search = txtNum.getText().toString().trim();
				if (htable.containsKey(search) == true) {
					// DialogMessage.showInfoDialog("Telephone Number of:" +search+" is
					// "+hashtable.get(search));
					DialogMessage.showInfoDialog("Telephone Number of : " + htable.get(search) + " is " + search);

				} else {

					DialogMessage.showInfoDialog("Doesn't Exist In the Directory");
				}

			}
		});
		btnSearch.setBounds(313, 259, 179, 41);
		teleFrame.getContentPane().add(btnSearch);

		JButton btnInsert = new JButton("Insert");
		btnInsert.setForeground(Color.BLACK);
		btnInsert.setBackground(SystemColor.activeCaption);
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String key = txtNum.getText().toString().trim();
				String value = txtName.getText().toString().trim();
				htable.put(key, value);
				DialogMessage.showInfoDialog("Successfully Inserted Into Directory:" + key);

			}
		});
		btnInsert.setBounds(313, 195, 179, 41);
		teleFrame.getContentPane().add(btnInsert);

		JButton btnIterate = new JButton("Iterate");
		btnIterate.setBackground(SystemColor.activeCaption);
		btnIterate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iterate();

			}
		});
		btnIterate.setBounds(12, 259, 179, 41);
		teleFrame.getContentPane().add(btnIterate);

		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new StartScreen();
				teleFrame.dispose();
			}
		});
		btnNewButton.setBounds(313, 343, 179, 44);
		teleFrame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Initialize");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				htable.put("0894444056", "Aviral");
				htable.put("0894444055", "Travis");
				htable.put("0894444054", "Mark");
				htable.put("0894444053", "Pavol");
				htable.put("0894444052", "Jason");
				htable.put("0894444051", "Scott");
				htable.put("0894444049", "Jonson");
				htable.put("0894444048", "Daniel");
				htable.put("0894444047", "Michael");
				htable.put("0894444046", "Edward");
				DialogMessage.showInfoDialog("List Initialized !");

			}
		});
		btnNewButton_1.setBackground(SystemColor.activeCaption);
		btnNewButton_1.setBounds(12, 195, 178, 41);
		teleFrame.getContentPane().add(btnNewButton_1);

	}
}
