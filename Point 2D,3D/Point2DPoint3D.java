public class Point2DPoint3D{
	public static void main(String [] args){
		
		//Print Point2D Outputs
		System.out.println("Print Point2D Outputs:");
		Point2D p2a=new Point2D(1,2);
		System.out.println(p2a);
		System.out.println("");
		
		//Print Point3D Outputs
		System.out.println("Print Point3D Outputs:");
		Point3D p3b=new Point3D(1,2,3);
		System.out.println(p3b);
		System.out.println("");
		
		//Change Point2D values
		System.out.println("After Change Point2D values:");
		p2a.setX(5);
		p2a.setY(9);
		System.out.println(p2a);
		System.out.println("");
		
		//Print Point x,y,z 
		System.out.println("Print Point x,y,z ");
		System.out.println("X is "+p2a.getX());
		System.out.println("Y is "+p2a.getY());
		System.out.println("Z is "+p3b.getZ());
		
		
		
	}
}