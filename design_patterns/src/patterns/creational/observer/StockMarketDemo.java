package patterns.creational.observer;

public class StockMarketDemo {

	public static void main(String[] args) {
		Stock google = new Stock("google", 120);
		Stock facebook = new Stock("facebook", 120);
		
		IStockQuote gstock = new StockQuote(google);
		IStockQuote fstock = new StockQuote(facebook);
		
		IBroker b1 = new Broker("b1");
		IBroker b2 = new Broker("b2");
		
		System.out.println("broker b1 buys google stock");
		gstock.register(b1);
		gstock.setPrice(150);
		
		System.out.println("buyer b2 buys facebook stock");
		fstock.register(b2);
		fstock.setPrice(150);
		
		System.out.println("buyer b1 buys facebook stock and buyer b2 buys google stock");
		gstock.register(b2);
		fstock.register(b1);
		
		
		System.out.println("stock updated");
		fstock.setPrice(158);
		gstock.setPrice(158);
		
		
		System.out.println("buyer b1 sells facebook stock and buyer b2 sells google stock");
		fstock.unregister(b1);
		gstock.unregister(b2);
		
		fstock.setPrice(200);
		gstock.setPrice(200);
		
	}
}
