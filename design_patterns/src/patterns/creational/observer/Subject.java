package patterns.creational.observer;

import java.util.ArrayList;
import java.util.Iterator;

public class Subject implements ISubject{

	private ArrayList<Observer> _observerList = new ArrayList<Observer>();
	
	private int _state = 0;
	
	
	
	public int get_state() {
		return _state;
	}

	public void set_state(int _state) {
		this._state = _state;
		notifyObservers();
	}

	@Override
	public void register(Observer observer) {
		_observerList.add(observer);
		
	}

	@Override
	public void unregister(Observer observer) {
		_observerList.remove(observer);
		
	}

	@Override
	public void notifyObservers() {
		for(Observer obsvr : _observerList)
			obsvr.update(_state);
	}

}
