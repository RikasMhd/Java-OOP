public class Customer extends User{
	Cart cart;
	private int telno;

	public Customer(String name,int telno)
	{
		super(name);
		this.cart = new Cart();
		this.telno=telno;
	}
}