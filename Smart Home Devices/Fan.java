public class Fan extends Device{
	private int speed;
	
	public Fan(String name,int speed){
		super(name);
		this.speed=speed;
	}
	@Override
	public void performFunction(){
		if(isOn){
			System.out.print(super.getName()+" is running at "+this.speed+" Speed");
		}
		else{
			System.out.print(super.getName()+" is Off.");
		}
		
	}
	
}