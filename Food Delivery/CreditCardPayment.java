// Payments (Interface polymorphism)
class CreditCardPayment implements Payable{
	public void pay(double amount){
		System.out.println("Paid $" + amount + "  with credit card.");
	}
}