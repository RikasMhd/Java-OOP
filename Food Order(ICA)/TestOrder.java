public class TestOrder{
	public static void main(String [] args){
		Customer thabo=new Customer("Thabotharan.K",
			new LoyaltyCard(LoyaltyCard.Tier.GOLD));
			
			//products (inheritance)with different configurations
			Product latte=new Beverage("Cafe Latte",3.50,Beverage.Size.LARGE,false);
			Product icedTea=new Beverage("Iced Tea",2.80,Beverage.Size.MEDIUM,true);
			Product croissant=new Beverage("Butter Croissant",2.20,false,true);
			Product brownieGF=new Beverage("Chocolate Brownie",2.50,true,false);
			
			//order (Composition:order has a customer has a Customer and OrderItems)
			Order.order=new Order(thabo);
			order.addItem(latte,1);
			order.addItem(icedTea,2);
			order.addItem(croissant,1);
			order.addItem(brownieGF,3);
			
			//output
			order.printReceipt();
			order.printKitchenPrepList();
			
	}
}