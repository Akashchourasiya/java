import java.util.Scanner;
class Calculator{
	public static void main( String args[]){
		int i,j,add,sub,mul,div;
		Scanner a=new Scanner(System.in);

		System.out.println("enter number");
		i=a.nextInt();
		System.out.println("enter another number");
		j=a.nextInt();

		add=i+j;
		sub=i-j;
		mul=i*j;
		div=i/j;

		System.out.println("addition is ="+add);
		System.out.println("subtraction is ="+sub);
		System.out.println("multiply is="+mul);
		System.out.println("divide is ="+div);
	}
}