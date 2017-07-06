package test.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
 
public class MutexEvenGenerator extends IntGenerator{
	
	private Lock lock = new ReentrantLock();
	private int currentEvenValue = 0;
	
	public int next(){
		lock.lock();
		try{
			++currentEvenValue;
			Thread.yield();
			++currentEvenValue;
			return currentEvenValue;
		}finally{
			lock.unlock();
		}
	}
	public static void main(String[] args){
		EvenChecker.test(new MutexEvenGenerator());
	}

}
