import java.util.Scanner;
class Rectangle1 extends Point{
	protected int width;
	protected int height;

	public Rectangle1(){
		super(10,10);
		width=20;	
		height=20;
	}
	public Rectangle1(int x,int y){
		super(x,y);
		width=10;
		height=10;
	}
	public Rectangle1(int x,int y,int width,int height){
		super(x,y);
		this.width=width;	
		this.height=height;
	}
	public Rectangle1(Point p,int width,int height){
		super(p.getX(),p.getY());
		this.width=width;	
		this.height=height;
	}
	public Rectangle1(Point p){
		super(p.getX(),p.getY());
		width=20;	
		height=20;
	}
	
	public void acceptData(){
		super.acceptData();
		Scanner a=new Scanner(System.in);
		System.out.println("enter width");
		width=a.nextInt();
		System.out.println("enter height");
		height=a.nextInt();
	}
	public void showData(){
		super.showData();
		System.out.println("Width"+width);
		System.out.println("Height"+height);
	}
	public int getWidth(){
		return  width;
	}
	public int getHeight(){
		return height;
	}
	public Point getCenter(){
		int x=getX();
		int y=getY();
		Point p=new Point(x,y);
		return p;
	}
	public static void main(String args[]){
		Rectangle1 r1=new Rectangle1(10,15,20,21);
		Point p=new Point(1,2);
		Rectangle1 r2=new Rectangle1(p,20,24);
		r1.showData();
		r2.showData();
	}
} 
	