public class TestShape1
{
	public static void main(String args[])
	{
		System.out.println("About Triangle:");
		Triangle T1= new Triangle("Red",10,15);
		System.out.println(T1);
		System.out.println("");
		System.out.println("About Rectangle:");
		Rectangle R1= new Rectangle("Blue",20,5);
		System.out.println(R1);
		System.out.println("");
		System.out.println("About Shape:");
		Shape s1=new Shape("Green");
		System.out.println(s1);
		
		
	}
}