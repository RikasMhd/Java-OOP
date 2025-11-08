public class FoodItem{
	String name;
	double price;
	int ID;
	char size;
	
	FoodItem(String name, double price, int ID, char size){
		this.name = name;
		this.price = price;
		this.ID = ID;
		this.size = size;
	}
	
	public String getName() { return name; }
    public double getPrice() { return price; }
    public int getID() { return ID; }
    public char getSize() { return size; }
	
	
}