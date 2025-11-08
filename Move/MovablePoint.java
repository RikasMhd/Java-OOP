public class MovablePoint implements Movable{
	private int x,y,xSpeed,ySpeed;
	
	public MovablePoint(){
		this.x=5;
		this.y=4;
		this.xSpeed=9;
		this.ySpeed=3;
	}
	public MovablePoint(int x,int y,int xSpeed,int ySpeed){
		this.x=x;
		this.y=y;
		this.xSpeed=xSpeed;
		this.ySpeed=ySpeed;
	}
	public String toString(){
		return "Speed of X : "+this.x+"\nSpeed of Y : "+this.y;
	}
	
	@Override
	public void moveUp(){
		this.y+=this.ySpeed;
	}
	
	@Override
	public void moveDown(){
		this.y-=this.ySpeed;
	}
	
	@Override
	public void moveLeft(){
		this.x-=this.xSpeed;
	}
	
	@Override
	public void moveRight(){
		this.x+=this.xSpeed;
	}
}