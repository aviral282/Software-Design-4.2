package hashtable;



	import javax.swing.JOptionPane;

	public class DialogMessage {

		public static void showWarningDialog(String message) {
			JOptionPane.showMessageDialog(null, message, "Warning",JOptionPane.WARNING_MESSAGE);
		}
		
		public static void showInfoDialog(String message) {
			JOptionPane.showMessageDialog(null, message, "Information",JOptionPane.INFORMATION_MESSAGE);
		}
	}
