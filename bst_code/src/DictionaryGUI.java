
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DictionaryGUI {

	private JFrame frame;
	private JTextField txtKey;
	private JTextField txtWord;
	private JTextField txtMeaning;
	BSTree obj = new BSTree();
	String arr[] = new String[100];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DictionaryGUI window = new DictionaryGUI();
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
	public DictionaryGUI() {
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 608, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Dictionary Implemented Using Binary Search Tree");
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
		lblNewLabel.setBounds(154, 27, 315, 25);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Enter ID which is not in the tree");
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(24, 78, 202, 14);
		frame.getContentPane().add(lblNewLabel_1);

		txtKey = new JTextField();
		txtKey.setBounds(249, 76, 262, 20);
		frame.getContentPane().add(txtKey);
		txtKey.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Enter word");
		lblNewLabel_2.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(24, 125, 110, 14);
		frame.getContentPane().add(lblNewLabel_2);

		txtWord = new JTextField();
		txtWord.setBounds(249, 123, 262, 20);
		frame.getContentPane().add(txtWord);
		txtWord.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Enter Meaning");
		lblNewLabel_3.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(24, 181, 93, 14);
		frame.getContentPane().add(lblNewLabel_3);

		txtMeaning = new JTextField();
		txtMeaning.setBounds(249, 179, 262, 20);
		frame.getContentPane().add(txtMeaning);
		txtMeaning.setColumns(10);

		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtKey.setText("");
				txtWord.setText("");
				txtMeaning.setText("");
			}
		});
		btnClear.setBounds(28, 239, 106, 23);
		frame.getContentPane().add(btnClear);

		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int k = Integer.parseInt(txtKey.getText().toString());
				try {
					DialogMessage
							.showInfoDialog("Value Found:" + obj.search(k).readName() + "  " + "Meaning is:" + arr[k]);
				} catch (Exception ex) {
					DialogMessage.showInfoDialog("Value Not Found");
				}
			}
		});
		btnSearch.setBounds(422, 239, 89, 23);
		frame.getContentPane().add(btnSearch);

		JButton btnMeaning = new JButton("Insert Meaning");
		btnMeaning.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int k = Integer.parseInt(txtKey.getText().toString());
				String n = txtWord.getText().toString().trim();
				String meaning = txtMeaning.getText().toString().trim();

				String res = obj.search(k).readName();
				if (res.equals(n)) {
					DialogMessage.showInfoDialog("Word exists, Meaning added");
					arr[k] = meaning;
				}
				obj.display_tree();
			}
		});
		btnMeaning.setBounds(288, 239, 124, 23);
		frame.getContentPane().add(btnMeaning);

		JButton btnInsert = new JButton(" Insert Word");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int k = Integer.parseInt(txtKey.getText().toString());
				String n = txtWord.getText().toString().trim();
				obj.insert(k, n);
				obj.display_tree();
			}
		});
		btnInsert.setBounds(140, 239, 138, 23);
		frame.getContentPane().add(btnInsert);
	}
}
