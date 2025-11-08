class Delivering_Person extends User implements Deliverable{
	public Delivering_Person(String name){
		super(name);
	}
	
	public void delivery(String address){
		System.out.println("Delivery Person " + name  + " is delivering to "+ address);
	}
}