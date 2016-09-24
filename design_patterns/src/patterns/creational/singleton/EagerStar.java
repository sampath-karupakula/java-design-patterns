package patterns.creational.singleton;

public class EagerStar {

	//to hold the instance of Eagerstar and initialized on declaration itself. 
	private static EagerStar _sun = new EagerStar();
	
	private String name = "early initialized surya";

	private EagerStar() {//restricted the object creation from outside the class.
	}

	//public method to access the instance.
	public static synchronized EagerStar getInstance() {
		return _sun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
