import java.util.*;
import java.util.ArrayList;

public class Menu{
	List <FoodItem> items = new ArrayList <>();
    
    public void addItem(FoodItem item){
		items.add(item);
	}	
	
	public void ShowMenu(){
		System.out.println("Menu\n");
		int i = 1;
		for (FoodItem item : items){
			System.out.println(i+"."+item.name + "  -$" +item.price);
			i+=1;
		}
	}
}

