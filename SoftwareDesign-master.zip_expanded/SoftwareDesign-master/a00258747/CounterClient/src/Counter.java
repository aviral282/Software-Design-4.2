import java.rmi.*;
interface Counter extends Remote {



public void increment() throws RemoteException;
public void decrement() throws RemoteException;
public int read_value() throws RemoteException;
  public void reset_value() throws RemoteException;
}

