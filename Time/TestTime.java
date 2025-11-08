public class TestTime{
	public static void main(String args []){
		Time ob1 = new Time(2,42,23);
		Time currentTime = new Time(23,59,60);
		System.out.println(currentTime.toString());
		System.out.println(ob1.toString());
	}
}