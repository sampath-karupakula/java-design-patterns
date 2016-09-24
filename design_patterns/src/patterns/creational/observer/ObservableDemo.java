package patterns.creational.observer;

import java.util.concurrent.TimeUnit;

public class ObservableDemo {

	public static void main(String[] args) throws InterruptedException {
		ISubject sub = new Subject();
		
		Observer obsvr = new Observer();
		sub.register(obsvr);
		
		for(int i = 1; i <= 10; i++){
			TimeUnit.SECONDS.sleep(3);
			((Subject)sub).set_state(i);
			if(i == 5)
				sub.unregister(obsvr);
		}
		
	}
}
