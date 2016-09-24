package patterns.creational.observer;

public class Broker implements IBroker {

	private String name;

	public Broker(String name) {
		this.name = name;
	}
	
	@Override
	public void notify(Stock stock) {
		System.out.printf("%s : stock %s updated to %.2f \n",this.name,stock.getName(),stock.getPrice());

	}
	
}
