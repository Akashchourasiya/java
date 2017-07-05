import java.util.Scanner; 
class Prime{
	public static void main(String args[]){
		int i,n;
		Scanner a=new Scanner(System.in);
		System.out.println("enter a number");
		n=a.nextInt();
		for(i=2;i<=n-1;i++){
		if(n%i==0)
		System.out.println("no.is not prime");
		break;
		}
		if(i==n)
		System.out.println("no.is prime");		
		}
	}
}