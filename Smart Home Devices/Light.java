public class Light extends Device{
	private int brightness;
	
	public Light(String name,int brightness){
		super(name);
		this.brightness=brightness;
	}
	@Override
	public void performFunction(){
		if(isOn){
			System.out.print(super.getName()+" is Shining at "+this.brightness+" %Brightness");
		}
		else{
			System.out.print(super.getName()+" is Off.");
		}
		
	}
	
}