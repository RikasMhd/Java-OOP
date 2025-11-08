public class Point3D extends Point2D{
	private int z;
	
	public Point3D(int x,int y,int z){
		super(x,y);
		this.z=z;
	}
	public Point3D(){
		super(5,3);
		this.z=9;
	}
	public int getZ(){
		return this.z;
	}
	public void setZ(int z){
		this.z=z;
	}
	@Override
	public String toString(){
		return super.toString()+"\nZ is "+getZ();
	}
	
}