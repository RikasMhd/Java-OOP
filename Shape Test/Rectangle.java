public class Rectangle extends Shape{
	private int length;
	private int width;
	
	public Rectangle(int length,int width,String colour){
		super(colour);
		this.length=length;
		this.width=width;
	}
	public int getLength(){
		return this.length;
	}
	public int getWidth(){
		return this.width;
	}
	@Override
	public double getArea(){
		return (double)getLength()*getWidth();
	}
	public String toString(){
		return "Colour of the Triangle is "+super.getColour()+"\nLength of the Rectangle is "+getLength()+"\nWidth of the Rectangle is "+getWidth()+"\nArea of the Shape is "+getArea()+"sq.";
	}
	public static void main(String [] args){
		Rectangle R1=new Rectangle(51,23,"Grey");
		System.out.println(R1);
	}
}