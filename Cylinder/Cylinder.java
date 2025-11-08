public class Cylinder{
	private Circle top;
	private double height;
	private Circle bottom;
	
	public Cylinder(Circle top,double height,Circle bottom){
		this.top=top;
		this.height=height;
		this.bottom=bottom;
	}
	public double getHeight(){
		return this.height;
	}
	public Circle getTop(){
		return this.top;
	}
	public Circle getBottom(){
		return this.bottom;
	}
	public double area(){
		return 2*this.getBottom().getRadius()*this.getHeight()*Math.PI;
	}
	public double volume(){
		return this.getBottom().getRadius()*this.getBottom().getRadius()*this.getHeight()*Math.PI;
	}
	
}