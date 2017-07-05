import java.util.Scanner;
class Temp{
	public static void main(String args[]){
		 float centigrade,farenheight;
		Scanner a=new Scanner(System.in);
		System.out.println("enter a temprature in centigrade");
		centigrade=a.nextFloat();
		farenheight=(centigrade*9/5f)+32;
		System.out.println("temprature in farenheight="+farenheight);
	}
}