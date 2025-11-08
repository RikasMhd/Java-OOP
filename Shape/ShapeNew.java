abstract public class ShapeNew{
	private String color;
	 
	public ShapeNew(String color){
		this.color=color;
	}
	 
	abstract public double getArea();
	//abstract public double getPerimeter();
	
	//abstract public void drawShape();
	 
	public String toString(){
		return "Circle colour is "+this.color;
	}
}