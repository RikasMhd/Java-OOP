import java.util.*;
import java.util.ArrayList;
public class Cart{
	private List <FoodItem> items = new ArrayList <>();
    
    public void addToCart(FoodItem item){
		items.add(item);
	}	
	public double getTotal() {
        double total = 0.0;
        for (FoodItem it : items) {
            total += it.getPrice();
        }
        return total;
    }
    public List<FoodItem> getItems() {
        return items;
    }
}
