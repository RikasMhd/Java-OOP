public class TestDate1
{
	public static void main (String args[])
	{
		Date1 d1 = new Date1(29,02,2024);
		System.out.println(d1.thisDay());
		d1.findTomorrow();
	}
}