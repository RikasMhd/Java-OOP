public class TestDriver{
	public static void main(String [] args){
		Customer cus=new Customer("Rikas","B08176492");
		Vehicle B1=new MotorBike("bike","b1532",2500,150);
		Vehicle B2=new MotorBike("bike","b1532",2800,550);
		
		Vehicle C1=new Car("car","c1532",4280,true);
		Vehicle C2=new Car("car","c1532",3150,false);
		
		Rental RB1=new Rental(cus,B1,3);
		Rental RB2=new Rental(cus,B2,5);
		
		Rental RC1=new Rental(cus,C1,2);
		Rental RC2=new Rental(cus,C2,6);
		
		System.out.println("");
		System.out.println("For Motor Bike(CC<500):");
		RB1.printInvoice();
		System.out.println("");
		
		System.out.println("");
		System.out.println("For Motor Bike(CC>500):");
		RB2.printInvoice();
		System.out.println("");
		
		System.out.println("");
		System.out.println("For Car(Luxury):");
		RC1.printInvoice();
		System.out.println("");
		
		System.out.println("");
		System.out.println("For Car(Standard):");
		RC2.printInvoice();
		System.out.println("");
		
	}
}