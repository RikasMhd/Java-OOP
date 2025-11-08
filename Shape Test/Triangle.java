public class Triangle extends Shape{
	private int base;
	private int height;
	
	public Triangle(int base,int height,String colour){
		super(colour);
		this.base=base;
		this.height=height;
	}
	public int getBase(){
		return this.base;
	}
	public int getHeight(){
		return this.height;
	}
	@Override
	public double getArea(){
		return (double)0.5*getBase()*getHeight();
	}
	public String toString(){
		return "Colour of the Triangle is "+super.getColour()+"\nBase of the Triangle is "+getBase()+"\nHeight of the Triangle is "+getHeight()+"\nArea of the Triangle is "+getArea();
	}
	
	public static void main(String [] args){
		Triangle T1=new Triangle(10,19,"Blue");
		System.out.println(T1);
	}
}