public class MotorBike extends Vehicle{
	private int engineCC;
	
	public MotorBike(String model,String brand,double baseRate,int engineCC){
		super(model,brand,baseRate);
		this.engineCC=engineCC;
	}
	@Override 
	public double calculateRent(int days){
		double rent=days*super.getBaseRate();
		if(engineCC>500){
			rent+=rent*15/100;
		}
		
		return rent;
	}
	@Override
	public String getDescription(){
		return super.getDescription()+"\n"+engineCC+"CC Bike";
	} 
	// public static void main(String [] args){
		// Vehicle v1=new MotorBike("sdfg","sdfg",2000,520);
		// System.out.println(v1.calculateRent(5));
	// }
}