import java.util.Scanner;
class Point{
	protected int x;
	protected int y;
	
	public Point(){
	}
	public Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	public int getX(){
		return x;
	}
	public void setX(int x){
		this.x=x;
	}
	public int getY(){
		return y;
	}
	public void setY(int y){
		this.y=y;
	}
	public void acceptData(){
		Scanner a=new Scanner(System.in);
		System.out.println("enter X");
		x=a.nextInt();
		System.out.println("enter Y");
		y=a.nextInt();
	}
	public void showData(){
		System.out.println("X"+x);
		System.out.println("Y"+y);
	}
	public static void main(String args[]){
		Point p=new Point();
		Point p1=new Point(10,0);
		p.showData();
		p1.showData();
	}
} 
	