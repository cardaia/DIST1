package alcatraz.spread;

import spread.AdvancedMessageListener;
import spread.SpreadException;
import spread.SpreadMessage;

public abstract interface SAdvancedMessageListener extends AdvancedMessageListener {

	public void membershipMessagereceived(SpreadMessage msg) throws SpreadException;
	
	public void regularMessagereceived(SpreadMessage msg) throws SpreadException;
}
