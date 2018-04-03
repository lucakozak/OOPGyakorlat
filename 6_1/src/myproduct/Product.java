package myproduct;

public class Product {
	private String name;
	private int netPrice;
	private int percentage;
	
	public Product(String name, int netPrice, int percentage) {
		this.name = name;
		this.netPrice = netPrice;
		this.percentage = percentage;
	}
	
	public int  getGrossPrice () {
		return this.netPrice + (netPrice * (netPrice* (int)(percentage/100)));
	}
	
	public String toString() {
		return "Nev: " + this.name + "Brutto ar: " +getGrossPrice();
	}
	
	public void netPriceIncrease(int percentageIn) {
		this.netPrice = (this.netPrice * (percentageIn/100));
	}
	public int productCompare(Product other) {
		if(this.getGrossPrice() > other.getGrossPrice())
			return 1;
		else if(this.getGrossPrice() < other.getGrossPrice())
			return -1;
		else return 0;
	}
	
}
