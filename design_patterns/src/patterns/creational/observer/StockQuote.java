package patterns.creational.observer;

import java.util.ArrayList;

public class StockQuote implements IStockQuote {

	private Stock stock = null;
	
	private ArrayList<IBroker> brokers = new ArrayList<IBroker>();
	
	public StockQuote(Stock stock) {
		this.stock = stock;
	}
	
	@Override
	public void unregister(IBroker broker) {
		brokers.remove(broker);
		
	}
	
	@Override
	public void setPrice(double price) {
		stock.setPrice(price);
		notifyBrokers();
		
	}
	
	@Override
	public void register(IBroker broker) {
		brokers.add(broker);
	}
	
	@Override
	public void notifyBrokers() {
		for(IBroker b : brokers){
			b.notify(stock);
		}
	}

}
