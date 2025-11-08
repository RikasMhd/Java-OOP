public abstract class Device implements Controllable{
	protected String name;
	protected boolean isOn;
	
	public Device(String name){
		this.name=name;
		this.isOn=false;
	}
	public String getName(){
		return this.name;
	}
	@Override
	public void turnOn(){
		if(!isOn){
			isOn=true;
			System.out.println(this.name+" is On Now");
		}
		else{
			System.out.println(this.name+" is Already On");
		}
	}
	@Override
	public void turnOff(){
		if(isOn){
			isOn=false;
			System.out.println(this.name+" is Off Now");
		}
		else{
			System.out.println(this.name+" is Already Off.");
		}
	}
	@Override
	public String getStatus(){
		return getName()+" Device is "+(isOn ? "On":"Off");
	}
	public abstract void performFunction();
}