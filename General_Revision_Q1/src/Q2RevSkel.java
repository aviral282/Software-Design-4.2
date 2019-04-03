import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.lang.annotation.Target;

class Letter1 extends Thread implements ActionListener {
	private int counter;
	private JFrame f1 = new JFrame();
	private boolean suspendFlag = false;
	private JLabel l = new JLabel();
	private Font fnt = new Font("TimesNewRoman", Font.BOLD, 16);
	Container content;
	private JButton b1 = new JButton("Suspend");
	private JButton b2 = new JButton("Resume");

	Letter1() {
		counter = 65;
		content = f1.getContentPane();
		l.setFont(fnt);
		l.setText("Counter:  " + 0);
		f1.setLayout(new FlowLayout());

		f1.setSize(180, 180);
		content.add(l);
		content.add(b1);
		content.add(b2);
		f1.setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}

	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent e) {
		Object lb = e.getSource();
		if (lb == b1) {
			//this.suspend();
			mySuspend();
		}
		if (lb == b2) {
			//this.resume();
			myResume();
		}
	}

	public void run() {
		while (counter < 100) {
			counter++;
			l.setFont(fnt);
			l.setText("Letter:  " + (char) counter);
			try {
				Thread.sleep(1000);
				synchronized (this) {
					while (suspendFlag) {
						wait();
					}
				}

			} catch (Exception e) {
			}
		}
	}

	public void mySuspend() {
		suspendFlag = true;
	}

	public synchronized void myResume() {
		suspendFlag = false;
		notify();
	}

}

public class Q2RevSkel {
	public static void main(String[] args) {
		Letter1 c = new Letter1();
		c.start();
	}
}
