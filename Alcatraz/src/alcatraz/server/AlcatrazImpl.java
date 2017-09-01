package alcatraz.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import alcatraz.common.Alcatraz;
import alcatraz.common.AlcatrazException;

public class AlcatrazImpl extends UnicastRemoteObject implements Alcatraz {

	  public AlcatrazImpl() throws RemoteException {
		    super();
		  }
		  
		  public long add(long a, long b) throws RemoteException {
		    return a + b;
		  }
		  
		  public long sub(long a, long b) throws RemoteException {
		    return a - b;
		  }
		  
		  public long mul(long a, long b) throws RemoteException {
		    return a * b;
		  }
		  
		  public long div(long a, long b) throws AlcatrazException, RemoteException {
		    if (b == 0) throw new AlcatrazException("Div by zero.");
		    return a / b;
		  }
		  


}
