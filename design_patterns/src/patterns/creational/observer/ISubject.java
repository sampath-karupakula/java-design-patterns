package patterns.creational.observer;

public interface ISubject {
	
	void register(Observer observer);
	void unregister(Observer observer);
	void notifyObservers();

}
