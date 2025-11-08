public class TestMove{
	public static void main(String [] args){
		Movable m1=new MovablePoint();
		
		System.out.println("Before Giving Speed");
		System.out.println(m1);
		System.out.println("");
		
		System.out.println("After Giving Speed Y for Up");
		m1.moveUp();
		System.out.println(m1);
		System.out.println("");
		
		System.out.println("After Giving Speed Y for Down");
		m1.moveDown();
		System.out.println(m1);
		System.out.println("");
		
		System.out.println("After Giving Speed X for Right");
		m1.moveRight();
		System.out.println(m1);
		System.out.println("");
		
		System.out.println("After Giving Speed X for Left");
		m1.moveLeft();
		System.out.println(m1);
	}
}