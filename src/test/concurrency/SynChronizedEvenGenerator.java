package test.concurrency;

public class SynChronizedEvenGenerator extends IntGenerator{
	
	private int currentEvenValue = 0;
	
	public  synchronized int next(){
		++currentEvenValue;
		Thread.yield();
		++currentEvenValue;
		return currentEvenValue;
		
	}

	public static void main(String[] args) {
		EvenChecker.test(new SynChronizedEvenGenerator());		

	}

}
