package patterns.creational.observer;

public class Observer {
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void update(int state){
		System.out.printf("State updated to %d \n",state);
	}
	
	

}
