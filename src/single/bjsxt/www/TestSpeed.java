package single.bjsxt.www;

import java.text.Normalizer.Form;
import java.util.concurrent.CountDownLatch;

public class TestSpeed {

	/**
	 * @param args
	 * @author liuhaijiao
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		long start=System.currentTimeMillis();
		final CountDownLatch cc=new CountDownLatch(10);
		for (int i = 0; i < 10; i++) {
			new Thread(new Runnable() {
				
				public void run() {
					for (int j = 0; j <100000; j++) {
						Object hungry=Hungry.getInstance();
					}
					cc.countDown();
				}
			}).start();
		}
		cc.await();
		long end=System.currentTimeMillis();
		System.out.println(end-start);
	}

}
