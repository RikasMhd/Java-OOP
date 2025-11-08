public class Shape{
	 private String color;
	 
	 public Shape(String color){
		 this.color=color;
	 }
	 
	 public double getArea()
	 {
		 System.out.println("aw snap! my Area is not defined");
		 return 0;
	 }
	 
	 public String toString()
	 {
		 return "Circle colour is "+this.color;
	 }
}