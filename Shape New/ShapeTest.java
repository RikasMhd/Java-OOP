abstract class Shape{
    abstract void draw();
}

interface Colorable{
    void setColor(String color);
}

class Circle extends Shape implements Colorable{
    protected String color;

    @Override
    public void draw(){
        System.out.println("Drawing a Circle with color: "+color);
    }
    @Override
    public void setColor(String color){
        this.color=color;
    }
}

class Rectangle extends Shape implements Colorable{
    protected String color;

    @Override
    public void draw(){
        System.out.println("Drawing a Rectangle with color: "+color);
    }
    @Override
    public void setColor(String color){
        this.color=color;
    }
}
public class ShapeTest {
    public static void main(String[] args) {
        Shape [] sha =new Shape[2];

        Circle C1=new Circle();
        Rectangle R1=new Rectangle();

        C1.setColor("Red");
        R1.setColor("Blue");

        sha[0]=C1;
        sha[1]=R1;

        for(Shape s : sha ){
            s.draw();
        }
    }

    /*public class ShapeTest{
    public static void main(String[] args) {
        Shape[] shapes = { new Circle(), new Rectangle() };

        ((Colorable) shapes[0]).setColor("Red");
        ((Colorable) shapes[1]).setColor("Blue");

        for (Shape s : shapes) {
            s.draw();
        }
    }
}*/
}
