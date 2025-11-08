public class Rectangle extends ShapeNew{
	
	private int length;
	private int width;
	
	public Rectangle(String color, int length, int width){
		super(color);
		this.length=length;
		this. width=width;
	}
	
	@Override
	public double getArea(){
		return this.length*this.width;
	}
	
	public String toString(){
		return "The Rectangle: "+super.toString();
	}
} 