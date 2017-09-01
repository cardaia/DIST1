package alcatraz.spread;

import java.io.InterruptedIOException;
import java.util.Random;

import alcatraz.common.AlcatrazException;
import spread.AdvancedMessageListener;
import spread.SpreadConnection;
import spread.SpreadException;
import spread.SpreadGroup;
import spread.SpreadMessage;

public class SConnection {

	SpreadConnection connection;
	
	public SConnection(){
		super();
		connection = new SpreadConnection();
	}
	
	public void add(AdvancedMessageListener listener) throws SpreadException{
		connection.add(listener);
	}
	
	public void connect()throws SpreadException{
		
		Random rndgen = new Random();
		int rnd = rndgen.nextInt(100);
		String privateName = "Alcatraz" +rnd;
		
		try
		{
		    connection.connect(null,1099,privateName,false,true);
		}
		catch (SpreadException e)
		{
		    e.printStackTrace();
		    System.exit(1);
		}
		
	}
	
	public void disconnect() throws Exception
    {
		try
		{
		    connection.disconnect();
		}
		catch (SpreadException e)
		{
		    throw new AlcatrazException(e.getMessage(), e.getCause());
		}
    }
	
    public SpreadMessage receive() throws Exception, InterruptedIOException
    {
		SpreadMessage message = new SpreadMessage();
	
		try
		{
		    message = connection.receive();
		}
		catch (SpreadException e)
		{
		    throw new AlcatrazException(e.getMessage(), e.getCause());
		}
	
		return message;
    }
    
    public void multicast(SpreadMessage message) throws Exception
	    {
		try
		{
		    connection.multicast(((SpreadMessage) message));
		}
		catch (SpreadException e)
		{
		    throw new AlcatrazException(e.getMessage(), e.getCause());
		}
    }
	
	public SpreadGroup getPrivateGroup() throws Exception
    {
		SpreadGroup group = connection.getPrivateGroup();
		return group;
    }
}
