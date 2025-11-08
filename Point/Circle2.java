public class Circle2{
	private double radius;
	private String colour;
	private Point center2;
	
	public Circle2(){
		radius=1.0;
		colour="red";
	}
	public Circle2(double radius,String colour,Point center2)
	{
		this.radius=radius;
		this.colour=colour;
		this.center2=center2;
	}
	public double getRadius(){
		return this.radius;
	}
	public String getColour(){
		return this.colour;
	}
	public Point getCenter(){
		return this.center2;
	}
	public double getArea(){
		return this.radius*this.radius*Math.PI;
	}
	public String toString(){
		return "Radius is "+this.getRadius()+"\nColour is "+this.getColour()+"\nCenter Point is ("+this.getCenter().getX()+","+this.getCenter().getY()+")";
	}
	
	
}
