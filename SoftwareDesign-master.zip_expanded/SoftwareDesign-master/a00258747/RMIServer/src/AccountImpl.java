import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AccountImpl extends UnicastRemoteObject implements Account{

	private String name;
	private int number;
	private int transactions;
	private int balance;

	public AccountImpl(String n,int no) throws RemoteException
	{       name=n;
		    number=no;    transactions=0;
		    balance=0;
	}
	public String read_bal()  throws RemoteException
	{   //transactions++;
		return ""+balance;
	}
	public String read_name()  throws RemoteException
	{
		return name;
	}
	public int read_number() throws RemoteException
	{
		return number;
	}
	public int read_transactions() throws RemoteException
		{
			return transactions;
	    }
	public void deposit(int a) throws RemoteException
	{   transactions++;
		balance+=a;
	}
	public boolean withdraw(int a) throws RemoteException
	{   transactions++;
		balance-=a;
		return  true;}
	@Override
	public String getDescription() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}
