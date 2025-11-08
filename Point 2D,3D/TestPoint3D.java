public class TestPoint3D{
	public static void main(String [] args){
		
		//Print Point3D Outputs
		System.out.println("Print Point3D Outputs:");
		Point3D p3a=new Point3D(21,14,13);
		System.out.println(p3a);
		System.out.println("");
		
		//Print Point3D Outputs
		System.out.println("Print 2D and 3D Outputs:");
		Point2D p3b=new Point3D();
		System.out.println(p3b);
		System.out.println("");
		
		//Change Point2D values
		System.out.println("After Change Point 2D,3D values:");
		p3a.setX(19);
		p3a.setY(30);
		p3a.setZ(17);
		System.out.println(p3a);
		System.out.println("");
		
		//Print Point x,y,z 
		System.out.println("Print Point x,y,z ");
		System.out.println("X is "+p3a.getX());
		System.out.println("Y is "+p3a.getY());
		System.out.println("Z is "+p3a.getZ());
		
		
		
	}
}