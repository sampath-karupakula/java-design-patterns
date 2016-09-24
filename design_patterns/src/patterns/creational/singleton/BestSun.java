package patterns.creational.singleton;

public class BestSun {
	
	//only one instance is created when we load the class and it loads faster. This is a standard approach in Java.
	private static class BillPughHelper {// Bill Pugh approach to cover all scenarios like multi-threaded and single instance.
		private final static BestSun _singleton= new BestSun();
	}
	
	private BestSun(){}// restrict object creation from outside of class.
	
	private String name = "Best sun";
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public static BestSun getInstance(){ //returns only one instance on each call.
		return BillPughHelper._singleton;
	}

}
