public abstract class Vehicle implements Rentable{
	private String model,brand;
	private double baseRate;
	
	public Vehicle(String model,String brand,double baseRate){
		this.model=model;
		this.brand=brand;
		this.baseRate=baseRate;
	}
	public String getBrand(){
		return this.brand;
	}
	public String getModel(){
		return this.model;
	}
	public double getBaseRate(){
		return this.baseRate;
	}
	@Override
	public String getDescription(){
		return "Brand : "+getBrand()+"\nModel : "+getModel();
	}
	@Override
	public abstract double calculateRent(int days);
}