class DeliveringOrder extends Order{
	
	private static final double DELIVERY_FEE = 5.0;
	public DeliveringOrder(Customer c, Restaurant r, Cart cart){
		super(c,r,cart);
	}
	
	public double calculateTotal(){
		return cart.getTotal() + DELIVERY_FEE ; 
	}
}