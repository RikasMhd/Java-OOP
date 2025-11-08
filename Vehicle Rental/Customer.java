public class Customer{
	private String name,licenceNumber;
	
	public Customer(String name,String licenceNumber){
		this.name=name;
		this.licenceNumber=licenceNumber;
	}
	public String getName(){
		return this.name;
	}
	public String getLicenceNumber(){
		return this.licenceNumber;
	}
	public String toString(){
		return "Name : "+this.getName()+"\nLicence Number : "+this.getLicenceNumber();
	}
}