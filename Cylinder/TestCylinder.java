public class TestCylinder{
	public static void main(String [] args){
		Circle c=new Circle(4,"Red");
		Cylinder cyli=new Cylinder(c,10,c);
		
		System.out.println("Cylinder Height is "+cyli.getHeight());
		System.out.println("Cylinder Bottom is "+cyli.getBottom().getRadius());
		System.out.println("Cylinder Top is "+cyli.getTop().getRadius());
		System.out.println("Cylinder Area is "+String.format("%.2f",cyli.area()));
		System.out.println("Cylinder Volume is "+String.format("%.2f",cyli.volume()));
	
	}
}