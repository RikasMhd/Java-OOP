abstract public class Monster{
	private String name;
	
	public Monster(String name){
		this.name=name;
	}
	
	abstract public String attack();
	// public String toString(){
		// return "Name is "+this.name;
	// }
}