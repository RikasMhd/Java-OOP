public class TestMonster{
	public static void main(String [] args){
		FireMonster f1=new FireMonster("Rikas");
		WaterMonster w1=new WaterMonster("Mayiz");
		StoneMonster s1=new StoneMonster("Mahriz");
		System.out.println(f1.attack());
		System.out.println(w1.attack());
		System.out.println(s1.attack());
		
	}
}