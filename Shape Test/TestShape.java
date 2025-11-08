public class TestShape
{
	public static void main(String args[])
	{
		System.out.println("For Shape");
		Shape s1=new Shape("Red");
		System.out.println(s1);
		System.out.println("============================");
		System.out.println("For Triangle");
		Shape T1=new Triangle("Blue",14,19);
		System.out.println(T1);
		System.out.println("============================");
		Shape R1=new Rectangle("Blue",22,13);
		System.out.println(R1);
		
		
		
		
		
	}
}