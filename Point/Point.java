public class Point{
	private double x;
	private double y;
	
	public Point(double x,double y){
		this.x=x;
		this.y=y;
	}
	public double getX(){
		return this.x;
	}
	public double getY(){
		return this.y;
	}
	
	public String findpoint(){
		return (x+","+y+")");
	}
	
	public void findDistance(double x1,double y1){
		double dX=(this.x)-x1;
		double dY=(this.y)-y1;
		double distance=Math.sqrt((dX*dX)+(dY*dY));
		
		System.out.print("Distance between ("+this.x+","+this.y+"),("+x1+","+y1+") is "+distance);	
	}
	
}