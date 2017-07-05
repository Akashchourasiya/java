import java.util.Scanner;
class Circle1 extends Point{
	private float radius;
	
	public Circle1(){
		super(10,10);
		radius=10f;	
	}
	public Circle1(int x,int y){
		super(x,y);
		radius=10f;
	}
	public Circle1(float radius){
		super(10,10);
		this.radius=radius;
	}
	public Circle1(int x,int y,float radius){
		super(x,y);
		this.radius=radius;	
	}
	public Circle1(Point p,float radius){
		super(p.getX(),p.getY());
		this.radius=radius;
	}
	public Circle1(Point p){
		super(p.getX(),p.getY());
		radius=0f;
	}
	public void showData(){
		super.showData();
		System.out.println("Radius"+radius);
	}
	public void acceptData(){
		super.acceptData();
		Scanner a=new Scanner(System.in);
		System.out.println("enter radius");
		radius=a.nextFloat();
	}
	
	public float getRadius(){
		return  radius;
	}
	public float getArea(){
		return (float)(3.14f*(radius)*(radius));
	}
	public Point getCenter(){
		int x=getX();
		int y=getY();
		Point p=new Point(x,y);
		return p;
	}
	public static void main(String args[]){
		Circle1 c1=new Circle1(10,15,20f);
		Point p=new Point(1,2);
		Circle1 c2=new Circle1(p,2f);
		c1.showData();
		c2.showData();
		Point p2=c2.getCenter();
		p2.showData();
		c2.getCenter().showData();
		System.out.println("Area is:"+c1.getArea());
	}
} 
	