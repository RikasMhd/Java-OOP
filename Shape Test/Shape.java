public class Shape{
	private String colour;
	
	public Shape(String colour){
		this.colour=colour;
	}
	public String getColour(){
		return this.colour;
	}
	public double getArea(){
		return 200;
	}
	public String toString(){
		return "Colour of the shape is "+getColour()+"\nArea of the Shape is "+getArea()+"sq.";
	}
	
	public static void main(String [] args){
		Shape S1=new Shape("Blue");
		System.out.println(S1);
	}
}