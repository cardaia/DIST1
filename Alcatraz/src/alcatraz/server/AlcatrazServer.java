package alcatraz.server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import alcatraz.common.Alcatraz;
import alcatraz.spread.SConnection;

public class AlcatrazServer {

	  public static void main(String args[]) {
		    try {
		      System.out.println("Starting up Alcatraz server...");
		      Alcatraz c = new AlcatrazImpl();
		      LocateRegistry.createRegistry(1099);
		      Naming.rebind("rmi://localhost:1099/AlcatrazService", c);
		      System.out.println("Alcatraz server up and running.");
		      
		      SConnection con = new SConnection();
		      con.connect();
		      
		    } catch (Exception e) {
		      System.out.println("Trouble!");
		      e.printStackTrace();
		      System.exit(1);
		    }
		  }

}
