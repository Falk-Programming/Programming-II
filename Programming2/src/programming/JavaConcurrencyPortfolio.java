package programming;

public class JavaConcurrencyPortfolio {
	
	
	public static void main(String[] args) {
		//Creating an instance of CountTo that the thread can run
		CountTo countTo = new CountTo();
		//Creating an instance of CountFrom that the thread can run 
		CountFrom countFrom = new CountFrom();
		
		//Thread creation and connection to the CountTo() and CountFrom() classes
		Thread threadTo =  new Thread(countTo);
		Thread threadFrom = new Thread(countFrom);
		threadTo.start();
		
		//In order to wait for the first thread to finish. Second thread needs to activate after first.
		while(threadTo.isAlive()) {
			continue;
		}
			threadFrom.start();
		
	}

}
