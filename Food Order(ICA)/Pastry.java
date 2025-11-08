public class Pastry extends Product{
	private boolean gluntenFree,warmed;
	
	public pastry(String name,double basePrice,boolean gluntenFree,boolean warmed){
		super(name,basePrice);
		this.gluntenFree=gluntenFree;
		this.warmed=warmed;
		
	}
	@Override
	public double price(){
		double gf=glutenFree ? 0.50 : 0.00;
		double warm=warmed ? 0.20 : 0.00;
		return getBasePrice()+bf+warm;
		
	}

	public String prepNote(){
		return String.format("%S-%S,%S",
				getName(),
				glutenFree ? "glutenFree" : "regular",
				warmed ? "Warm Slightly" : "No warming") ;
	}
}