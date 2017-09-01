package alcatraz.common;

public class AlcatrazException extends Exception {
	
	public AlcatrazException() {
	  }
	
	public AlcatrazException(String msg) {
	    super(msg);
	}
	
	public AlcatrazException(String msg, Throwable cause) {
	    super(msg,cause);
	  }
	
	  public AlcatrazException(Throwable cause) {
		    super(cause);
		  }
}
