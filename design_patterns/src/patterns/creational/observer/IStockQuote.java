package patterns.creational.observer;

public interface IStockQuote {
	
	void register(IBroker broker);
	void unregister(IBroker broker);
	void notifyBrokers();
	void setPrice(double price);
}
