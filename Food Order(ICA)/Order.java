import java.util.ArrayList;
import java.util.List;
public class Order{
	private final Customer customer;
	private final List<OrderItem>items=new ArrayList<>();
	public Order(Customer customer){
		this.customer=customer;
	}
	public void addItem(Product p,inr qty){
		items.add(new OrderItem(p.qty));
	}
	public double subTotal(){
		return items.stream().mapToDouble(OrderItem::lineTotal).sum();
	}
	public double discount()){
		return subTotal()*customer.getCard().discountRate();
	}
	public double total(){
		return subTotal()-discount();
	}
	public void printReceipt(){
		System.out.println("===Campus Cafe Receipt ====");
		System.out.println("Customer : "+customer.getName()+"["+customer.getCard().getTier());
		System.out.println("---------------------------------");
		for(OrderItem item:items){
			Product p=item.getproduct();     //polymorphism in price()
			double line=item.lineTotal();
			System.out.printf("%dx %-18s %7.2f%n",
						item.getQuantity(),p.getName(),line);
						
		}
		
		System.out.println("---------------------------------");
		System.out.printf("Sub Total:                     %7.2f%n",subTotal());
		System.out.printf("Discount:                	  %7.2f%n",discount());
		System.out.printf("Total:                         %7.2f%n",total());
		System.out.println("===============================\n");
		
	}
	public void printKitchenPrepList(){
		System.out.println("===Kitchen Prep List===");
		for(OrderItem item: items){
			System.out.println(item.kitchenLine());//polymorphic prepNote()
			}
			System.out.println("================================");
	}
}