import java.util.Scanner; 
class Table1{
	public static void main(String args[]){
		int i,n,c=1;
		Scanner a=new Scanner(System.in);
		System.out.println("enter a mumber");
		n=a.nextInt();
		for(i=1;i<=10;i++){
			c=i*n;
			System.out.println("table = "+c);		
		}
	}
}
