import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class sample1Q1 extends Thread {

	static int val1 = 9, val2 = 2, delay = 10;
	//static final Lock lock = new  ReentrantLock();  

	void Go() {
		//lock.lock();
		if (val2 != 0) {
			try {
				Thread.sleep(delay);
			} catch (Exception e) {
			}
			System.out.println(val1 / val2);
			val2 = 0;
		} else {
			System.out.println("Val2=0");
		}
	//	 lock.unlock();
		
	}

	public void run() {
		Go();

	}

	public static void main(String[] args) throws InterruptedException {
		{
			sample1Q1 t1 = new sample1Q1();
			sample1Q1 t2 = new sample1Q1();
			val1 = 9;
			val2 = 2;
			t1.start();
			delay = 1;
			t2.start();
		}
	}
}
