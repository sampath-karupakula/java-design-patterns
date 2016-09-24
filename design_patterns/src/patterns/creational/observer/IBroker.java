package patterns.creational.observer;


/**
 * Broker interface to represent all brokers.
 *
 */
public interface IBroker {
	void notify(Stock stock);
}
