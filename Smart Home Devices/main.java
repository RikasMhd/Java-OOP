public class main{
	public static void main(String [] args){
		Light L1=new Light("LED",55);
		Fan F1=new Fan("Bajaj",4);
		Room R1=new Room("Living Room",L1,F1);
		
		R1.showDevice();
		System.out.println("");
		R1.activate();
	}
}