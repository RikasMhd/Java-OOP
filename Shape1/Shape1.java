abstract public class Shape1{
    private String colour;
	//this file doesn't work
    public Shape1(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return this.colour;
    }

    abstract public double getArea();

    // abstract public double getPerimeter();

    // abstract public void drawShape();

    @Override
    public String toString() {
        return "Color of Shape is " + this.colour + "\nArea of Shape is " + getArea();
    }
}