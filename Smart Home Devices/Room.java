public class Room{
	private String roomName;
	private Light light;
	private Fan fan;
	
	public Room(String roomName,Light light,Fan fan){
		this.roomName=roomName;
		this.light=light;
		this.fan=fan;
	}
	public void showDevice(){
		System.out.println("Room is "+this.roomName);
		System.out.println(light.getStatus());
		System.out.println(fan.getStatus());
		
	}
	public void activate(){
		System.out.println("Room is "+this.roomName);
		light.turnOn();
		light.performFunction();
		System.out.println("");
		fan.turnOn();
		fan.performFunction();
		
	}
}