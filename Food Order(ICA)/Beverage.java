public class Beverage extends Product{
	public enum Size{SMALL,MEDIUM,LARGE}
	private Size size;
	private boolean iced;
	
	public Beverage(String name,double basePrice,Size size,boolean iced){
		super(name,basePrice);
		this.size=size;
		this.iced=iced;
	}
	
	private double sizeMultiplier(){
		switch(size){
			case SMALL : return 1.0;
			case MEDIUM : return 1.25;
			case LARGE : return 1.5;
			default : return 0.0;
			
		}
	}
	
	@Override
	public double price(){
		double ice=iced ? 0.30 : 0.00;
		return getbasePrice()*sizeMultiplier()+ice;
	}
	
	@Override
	public String prepNote(){
		return String.format("%S-%S,%S",
				getName(),
				iced ? "Hot" : "Cold") ;
	}
}