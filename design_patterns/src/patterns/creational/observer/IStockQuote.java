package patterns.creational.observer;

/**
 * Quote details. acts as a Publisher or subject
 *
 */
public interface IStockQuote {

	// register the subscriber/observer
	void register(IBroker broker);

	// unregister the subscriber / observer
	void unregister(IBroker broker);

	// notify the all subscribers
	void notifyBrokers();

	// update the state
	void setPrice(double price);
}
