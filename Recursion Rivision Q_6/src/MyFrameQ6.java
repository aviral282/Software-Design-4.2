
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.*;

class MyFrameQ6 extends JFrame implements ActionListener {
	private JLabel l0 = new JLabel("  Recursion  Application  ");
	private JLabel l1 = new JLabel("             List");
	private JTextField t1 = new JTextField("0", 15);
	private JButton b1 = new JButton("Add Element");
	private JTextField t2 = new JTextField("0", 15);
	private JLabel l12 = new JLabel("Enter Target");
	private JTextField t22 = new JTextField("0", 15);
	private JButton b2 = new JButton("Count > Target");
	private JTextField t3 = new JTextField("0", 15);
	private JPanel p1 = new JPanel();
	ArrayList<Integer> list = new ArrayList<Integer>();
//optum, cerner,s3 conected health
	//redmed,boston scintific,stryker, novartis, medtronics,sanofi
	// cyber ireland, forcepoint, symantec, mcafee
	// accenture,sap,nuritas, master card,
	// analog devices, dell emc, veritas, intel,
	// 
	
	
	/*
	 * cv- organized, consistent, complete, current,
	 * created, devised, enjoyed, relished, helped,negotiated, motivated
	 * training and volunteering
	 * */
	/*
	 * sovial media
	 * volunteer
	 * reseach on the company
	 * 
	 * */
	/*
	 * Research th ecompany
	 * review rhier website
	 * know cv
	 * dcide what to wear
	 * know who you meet
	 * 
	 * */
	/*
	 * tell me about a time you worked in a team
	 * tell me about a time you prove excellent cutomer experience
	 * */
	
	public static int countGreater(ArrayList list, int tar) { 
		if (list.size() == 0)
			return 0;
		else {
			int first = (int) list.get(0);
			list.remove(0);
			if (first > tar)
				return 1+countGreater(list, tar);
			else
				return countGreater(list, tar);
		}

	}

	public MyFrameQ6(String s) {
		super(s);
		Container content = getContentPane();
		Collections.addAll(list, 4, 2, 6, 2, 8, 6, 2);
		displayList();
		content.setLayout(new FlowLayout());
		Font f = new Font("TimesRoman", Font.BOLD, 20);
		p1.setLayout(new GridLayout(4, 2));
		l0.setFont(f);
		l1.setFont(f);
		content.add(l0);
		p1.add(l1);
		p1.add(t1);
		p1.add(b1);
		p1.add(t2);
		p1.add(l12);
		p1.add(t22);
		p1.add(b2);
		p1.add(t3);
		content.add(p1);
		b1.addActionListener(this);
		b2.addActionListener(this);
		setSize(390, 200);
		setVisible(true);
	}

	public void displayList() {
		StringBuffer str = new StringBuffer("[ ");
		if (list.isEmpty() == false)
			str.append(list.get(0));
		for (int i = 1; i < list.size(); i++) {
			str.append(" ," + list.get(i));
		}
		str.append("]");
		t1.setText(str.toString());
	}

	public void actionPerformed(ActionEvent e) {

		Object target = e.getSource();
		if (target == b1) {
			int v1 = Integer.parseInt(t2.getText());
			list.add(v1);
			displayList();
		}

		if (target == b2) {
			int tar = Integer.parseInt(t22.getText());
			int res = countGreater(new ArrayList(list), tar);
			t3.setText("" + res);
		}
	}
}
