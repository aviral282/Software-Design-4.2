package Mobile;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

import Menu.MainFrame;
import Menu.MainMenu;
import Misc.DialogMessage;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Search_Mobile extends JPanel {
	private JTextField m_detail;

	/**
	 * Create the panel.
	 */
	public Search_Mobile() {
		setLayout(null);
		
		JLabel lblProductDetails = new JLabel("Mobile Details");
		lblProductDetails.setForeground(SystemColor.desktop);
		lblProductDetails.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblProductDetails.setBounds(23, 92, 163, 23);
		add(lblProductDetails);
		
		m_detail = new JTextField();
		m_detail.setForeground(new Color(65, 105, 225));
		m_detail.setFont(new Font("Arial", Font.BOLD, 15));
		m_detail.setColumns(10);
		m_detail.setBounds(256, 94, 116, 22);
		add(m_detail);
		
		JButton btnSearchByName = new JButton("Search By Name");
		
		btnSearchByName.setForeground(SystemColor.desktop);
		btnSearchByName.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnSearchByName.setBounds(94, 214, 237, 25);
		add(btnSearchByName);
		
		JLabel lblSearchProducts = new JLabel("Search Mobile");
		lblSearchProducts.setForeground(SystemColor.desktop);
		lblSearchProducts.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblSearchProducts.setBounds(113, 13, 218, 50);
		add(lblSearchProducts);
		
		JButton btnSearchById_1 = new JButton("Search By ID");
		btnSearchById_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int id = Integer.parseInt(m_detail.getText());
				HashTable table1 = HashTable.getInstance();
				HNode temp = table1.searchbyIterator(id);
				if(temp!=null)
				{
					DialogMessage.showInfoDialog("FOUND: "+temp.readProductName());
					m_detail.setText("");
				}
				else
				{
					DialogMessage.showWarningDialog("NOT FOUND");
				}
			}
		});
		btnSearchById_1.setForeground(SystemColor.desktop);
		btnSearchById_1.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnSearchById_1.setBounds(94, 176, 237, 25);
		add(btnSearchById_1);
		
		JButton button = new JButton("BACK");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.backHome();
				m_detail.setText("");
			}
		});
		button.setForeground(SystemColor.desktop);
		button.setFont(new Font("Arial Black", Font.BOLD, 18));
		button.setBounds(151, 252, 131, 25);
		add(button);
		
		btnSearchByName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = m_detail.getText();
				HashTable table1 = HashTable.getInstance();
				HNode temp = table1.searchbyName(name);
				if(temp!=null)
				{
					DialogMessage.showInfoDialog("FOUND: "+temp.readKey()+" "+temp.readProductName());
					m_detail.setText("");
				}
				else
				{
					DialogMessage.showWarningDialog("NOT FOUND");
				}
			}
			
		});

		
	}

}
