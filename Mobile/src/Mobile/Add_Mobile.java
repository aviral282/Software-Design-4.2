package Mobile;

import javax.swing.JPanel;
import javax.swing.JTextField;

import Menu.MainFrame;
import Menu.MainMenu;
import Misc.DialogMessage;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.util.Hashtable;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Add_Mobile extends JPanel {
	private JTextField mobile_Id;
	private JTextField mobile_Name;
	private JTextField Mobile_Quantity;
	private JTextField Mobile_Price;
	HashTable table = HashTable.getInstance();

	/**
	 * Create the panel.
	 */
	public Add_Mobile() {
		setLayout(null);

		JLabel lblAddProducts = new JLabel("Add Mobile");
		lblAddProducts.setForeground(SystemColor.desktop);
		lblAddProducts.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblAddProducts.setBounds(134, 13, 218, 50);
		add(lblAddProducts);

		JLabel lblProductId = new JLabel("Mobile ID:");
		lblProductId.setForeground(SystemColor.desktop);
		lblProductId.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblProductId.setBounds(45, 71, 163, 23);
		add(lblProductId);

		JLabel lblProductName = new JLabel("Mobile Name:");
		lblProductName.setForeground(SystemColor.desktop);
		lblProductName.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblProductName.setBounds(45, 120, 191, 23);
		add(lblProductName);

		JLabel lblProductQuantity = new JLabel("Quantity");
		lblProductQuantity.setForeground(SystemColor.desktop);
		lblProductQuantity.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblProductQuantity.setBounds(45, 175, 175, 23);
		add(lblProductQuantity);

		JLabel lblProductPrice = new JLabel("Price:");
		lblProductPrice.setForeground(SystemColor.desktop);
		lblProductPrice.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblProductPrice.setBounds(45, 227, 175, 23);
		add(lblProductPrice);

		JButton btnInsert = new JButton("INSERT");

		btnInsert.setForeground(SystemColor.desktop);
		btnInsert.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnInsert.setBounds(74, 290, 131, 25);
		add(btnInsert);

		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.backHome();
				mobile_Id.setText("");
				mobile_Name.setText("");
				Mobile_Price.setText("");
				Mobile_Quantity.setText("");
			}
		});
		btnBack.setForeground(SystemColor.desktop);
		btnBack.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnBack.setBounds(252, 292, 131, 25);
		add(btnBack);

		mobile_Id = new JTextField();
		mobile_Id.setForeground(SystemColor.desktop);
		mobile_Id.setFont(new Font("Arial", Font.BOLD, 15));
		mobile_Id.setColumns(10);
		mobile_Id.setBounds(278, 73, 116, 22);
		add(mobile_Id);

		mobile_Name = new JTextField();
		mobile_Name.setForeground(SystemColor.desktop);
		mobile_Name.setFont(new Font("Arial", Font.BOLD, 15));
		mobile_Name.setColumns(10);
		mobile_Name.setBounds(278, 122, 116, 22);
		add(mobile_Name);

		Mobile_Quantity = new JTextField();
		Mobile_Quantity.setForeground(SystemColor.desktop);
		Mobile_Quantity.setFont(new Font("Arial", Font.BOLD, 15));
		Mobile_Quantity.setColumns(10);
		Mobile_Quantity.setBounds(278, 177, 116, 22);
		add(Mobile_Quantity);

		Mobile_Price = new JTextField();
		Mobile_Price.setForeground(SystemColor.desktop);
		Mobile_Price.setFont(new Font("Arial", Font.BOLD, 15));
		Mobile_Price.setColumns(10);
		Mobile_Price.setBounds(278, 229, 116, 22);
		add(Mobile_Price);

		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int product_id = Integer.parseInt(mobile_Id.getText());
				String product_name = mobile_Name.getText();
				int product_quantity = Integer.parseInt(Mobile_Quantity.getText());
				int product_price = Integer.parseInt(Mobile_Price.getText());
				table.insert(product_id, product_name, product_quantity, product_price);
				DialogMessage.showInfoDialog("Inserted");
				mobile_Id.setText("");
				mobile_Name.setText("");
				Mobile_Price.setText("");
				Mobile_Quantity.setText("");

			}
		});

	}
}
