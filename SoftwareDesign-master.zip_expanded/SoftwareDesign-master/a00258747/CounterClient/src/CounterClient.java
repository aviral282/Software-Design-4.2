import java.rmi.Naming;
import java.util.Scanner;

public class CounterClient {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		try{
		String url = "rmi:///";
		Counter c= (Counter) Naming.lookup(url+"toaster");
		System.out.println("Counter Application");
		System.out.println("===================");
		System.out.println("1.Increment");
		System.out.println("2.Decrement");
		System.out.println("3.Read Value");
		System.out.println("4.Exit");
		System.out.print("\nPlease enter a value-->");
		int choice=sc.nextInt();

		while(choice!=4){
			if(choice==1){ c.increment();}
			if(choice==2){c.decrement();}
			if(choice==3){
				int res=c.read_value();
				System.out.println("Value = "+res);
				}
			System.out.println("\nCounter Application");
			System.out.println("===================");
			System.out.println("1.Increment");
			System.out.println("2.Decrement");
			System.out.println("3.Read Value");
			System.out.println("4.Exit");
			System.out.print("\nPlease enter a value-->");
			choice=sc.nextInt();
			}
		}catch(Exception e){ System.out.println("Error "+e);}
		}
}
