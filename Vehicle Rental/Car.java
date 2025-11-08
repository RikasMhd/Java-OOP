public class Car extends Vehicle{
	private boolean luxury;
	
	public Car(String model,String brand,double baseRate,boolean luxury){
		super(model,brand,baseRate);
		this.luxury=luxury;
	}
	@Override 
	public double calculateRent(int days){
		double rent=days*super.getBaseRate();
		if(luxury){
			rent+=rent*20/100;
		}
		
		return rent;
	}
	@Override
	public String getDescription(){
		return super.getDescription()+" & "+(luxury ? "Luxury Car":"Standard Car");
	} 
	// public static void main(String [] args){
		// Vehicle v1=new Car("sdfg","sdfg",2000,true);
		// System.out.println(v1.calculateRent(5));
	// }
}