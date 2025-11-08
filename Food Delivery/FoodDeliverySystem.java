//main system
public class FoodDeliverySystem{
	public static void main (String []args){
		// create a restaurent and menu
		Restaurant r = new Restaurant ("Pizza Hub.");
		
		
		r.menu.addItem(new FoodItem("Margherita",1000.00,12,'m'));
		r.menu.addItem(new FoodItem("Veggie Burger",600.00,8,'m'));
		r.menu.addItem(new FoodItem("Pasta",1050.00,10,'l'));
		
		r.menu.ShowMenu();
		
		//create customer
		
		Customer c = new Customer("Alice",007);
		c.cart.addToCart(new FoodItem("Veggie Burger",600.00,12,'m'));
		c.cart.addToCart(new FoodItem("Pasta",1050.00,10,'m'));
		
		//Place order
		
		Order order = new DeliveringOrder(c,r,c.cart);
		double total = order.calculateTotal();
		System.out.println("\nOrder placed by "+ c.name+ ":\nTotal = $"+ total+".");
		
		//payment
		
		Payable payment = new CreditCardPayment();
		payment.pay(total);
		
		//delivery
		
		Delivering_Person dp = new Delivering_Person("Bob");
		dp.delivery("123,MainStreet,Negombo.");
		
	}
}