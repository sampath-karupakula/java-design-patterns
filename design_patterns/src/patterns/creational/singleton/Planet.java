package patterns.creational.singleton;

public class Planet {

	private String name;
	
	public Planet() {
		// TODO Auto-generated constructor stub
	}
	
	public Planet(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return this.name;
	}
	
}
