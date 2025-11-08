public class TestPoint{
	public static void main(String [] args){
		Point p1=new Point(2,5);
		Point p2=new Point(8,6);		
		
		// System.out.println("Point 1 is P1("+p1.findpoint());
		// System.out.println("Point 2 is P2("+p2.findpoint());
		p1.findDistance(p2.getX(),p2.getY());
	}
}