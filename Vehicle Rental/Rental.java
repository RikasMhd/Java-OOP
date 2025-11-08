public class Rental{
	private Customer customer;
	private Vehicle vehicle;
	private int days;
	
	public Rental(Customer customer,Vehicle vehicle,int days){
		this.customer=customer;
		this.vehicle=vehicle;
		this.days=days;
	}
	
	public void printInvoice(){
		System.out.println("-----------Invoice Bill--------------");
		System.out.println("Customer Info:");
		System.out.println(customer);
		System.out.println("");
		
		System.out.println("Vehicle description:");
		System.out.println(vehicle.getDescription());
		System.out.println("");
		
		System.out.println("Days & Total Rent:");
		System.out.println("Days : "+this.days+"\nTotal Rent : "+vehicle.calculateRent(days));
		System.out.println("");
		
		
	}
}