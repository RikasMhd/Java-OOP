abstract public class Product{
	private String name;
	private double bestPrice;
	
	public Product(String name){
		this.name=name;
		this.bestPrice=500;
	}
	
	public Product(double bestPrice){
		this.name="Coffee";
		this.bestPrice=bestPrice;
	}
	public Product(String name,double bestPrice){
		this.name=name;
		this.bestPrice=bestPrice;
	}
	public String getName(){
		return this.name;
	}
	public double getBasePrice(){
		return this.bestPrice;
	}
	
	abstract public double price();
	abstract public String prepNote();
	
	public String toString(){
		return "Product Name is "+this.name+".Price is "+String.format("%.2f",this.price());
	}
}