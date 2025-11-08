abstract class Order{
	
	// abstract void setTakeawyOrder();
	// abstract void setDeliveringOrder();
	
	Customer customer;
	Restaurant restaurant;
	Cart cart;
	
	public Order(Customer c, Restaurant r, Cart cart){
		this.customer = c;
		this.restaurant=r;
		this.cart=cart;
	}
	public abstract double calculateTotal(); 
}


 