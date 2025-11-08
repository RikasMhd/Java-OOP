class TakeawayOrder extends Order{
	public TakeawayOrder(Customer c, Restaurant r, Cart cart){
		super(c,r,cart);
	}
	
	public double calculateTotal(){
		return cart.getTotal(); // no delivery fee
	}
}