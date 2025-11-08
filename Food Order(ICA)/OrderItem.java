public class OrderItem{
	private Product product;
	private int quantity;
	
	public OrderItem(Product product,int quantity){
		if(quantity<=0) throw new IllegalArgumentException("Quantity Must be >0");
		this.product=product;
		this.quantity=quantity;
	}
	public Product getProduct(){
		return this.product;
	}
	public int getQuantity(){
		return this.quantity;
	}
	public double lineTotal(){
		return Product.price()*quantity;
	}
	public String kitchenLine(){
		//polymorphic call to prepNote()
		return String.format("%dx %s -> %s",quantity,product,getName(),product.prepNote());
	}
}