import java.util.Scanner;
class Interest{
	public static void main(String args[]){
		 int principle,rate,time,si=1,ci=0;
		Scanner a=new Scanner(System.in);
		System.out.println("enter a principle");
		principle=a.nextInt();
		System.out.println("enter a rate");
		rate=a.nextInt();
		System.out.println("enter a time");
		time=a.nextInt();
		si=principle*rate*time/100;
		ci=principle*(1+rate)^time;
		System.out.println("simple interest="+si+"\ncompound interest="+ci);
	}
}