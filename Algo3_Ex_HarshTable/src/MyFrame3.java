
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class MyFrame3 extends JFrame implements ActionListener{
	private JLabel l0 = new JLabel("Person");
	private JLabel l1 = new JLabel("ID");
	private JLabel l2 = new JLabel("Name");
	private JLabel l3 = new JLabel("Age");
	private JTextField t1=new JTextField("",9);
	private JTextField t2=new JTextField("",9);
	private JTextField t3=new JTextField("",9);

	private JButton b1=new JButton("Insert");
	private JButton b2=new JButton("Search");
	private JButton b4=new JButton("Print");
	private JButton b3=new JButton("Close");
	private JPanel p1=new JPanel();
	private HashTable table=new HashTable();//This is new
	private int current=0; //This is new

//CONSTRUCTOR
	public MyFrame3(String s){
		super(s);
		table.insert(1,"J.Smith",22);
		table.insert(2,"T.Black",24);
		table.insert(3,"M.Gray",24);
		table.insert(4,"T.Shine",42);
		table.insert(12,"T.Whyte",54);
		table.insert(13,"M.Gren",64);
		Container content=getContentPane();
		content.setLayout(new FlowLayout());
		Font f=new Font("TimesRoman", Font.BOLD,20);
		p1.setLayout(new GridLayout(5,2));
		l0.setFont(f);  l1.setFont(f);
		content.add(l0);		
		p1.add(l1); p1.add(t1);
		p1.add(l2); p1.add(t2);
		p1.add(l3); p1.add(t3);
		p1.add(b1); p1.add(b2);
		p1.add(b4); p1.add(b3);
		content.add(p1);
		b1.addActionListener(this);b2.addActionListener(this);b3.addActionListener(this);
		b4.addActionListener(this);
		   //Horiz , Vert
		setSize(250,220);    setVisible(true);}



	public void actionPerformed(ActionEvent e){

	  	Object target=e.getSource();
	 	if (target==b1)
	 		{    int id=Integer.parseInt(t1.getText());
	 		     String nm= t2.getText();
	 		     int ag=Integer.parseInt(t3.getText());
	 		     table.insert(id, nm, ag);
	         }

	     if (target==b2)
	     	{
	    	 int id=Integer.parseInt(t1.getText());
	    	 HNode temp=table.search(id);
	    	 if (temp==null){  t2.setText("Unknown");
	    	                   t3.setText("");}
	    	 else       { t1.setText(""+temp.readKey());
	    	              t2.setText(""+temp.readName());
	    	              t3.setText(""+temp.readAge());
	    	            }
	     	}
	     if (target==b4)
	     	{System.out.println();
	    	 System.out.println("\n\nNew Table");
	    	 System.out.print("----------------");
	    	 table.printTable();
	     	}
	     if (target==b3)
	     	{
	    	 this.setVisible(false);
	     	}
	     
	     
          }
}

