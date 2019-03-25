import java.rmi.Naming;
import java.util.Scanner;

public class AccountClient {
	public static void main( String args[] ) throws Exception{

        //String url =  "rmi:///";
        
     String url= "rmi://192.168.24.69/";      // if object located remotely
        Account a = ( Account ) Naming.lookup( url + "toaster" );
        int choice = 1;
		Scanner sc = new Scanner(System.in);
		
		while(choice!=5)
		{
         	 System.out.println();
		 System.out.println("1.Deposit");
		 System.out.println("2.Withdraw");
		 System.out.println("3.Check Balance");
		 System.out.println("4.Print Number of Tracsactions");
		 System.out.println("5.Exit");
			System.out.print("\nPlease enter a value-->");
			choice=sc.nextInt();
			if(choice==1)
			{   
			   System.out.print("Enter Amount in Euro: ");
			   int e=sc.nextInt();
				a.deposit(e);
			}
			else if(choice==2)
			{
				   System.out.print("Enter Amount in Euro: ");
				   int e=sc.nextInt();
				boolean res=a.withdraw(e);
				if (res==false){
					System.out.println("Sorry- Insufficient Funds");}
			}
			else if(choice==3)
			{
				System.out.println("Balance="+a.read_bal());}
			else if(choice==4)
			{
				System.out.println("Read Transactions="+a.read_transactions());}
		}  // end whi
}
}