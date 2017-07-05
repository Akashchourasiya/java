import java.util.Scanner;
	class St1a{
		public static void main(String args[]){
			Scanner a=new Scanner(System.in);
			String str=new String("betty got a bit of bitter better butter ");
			int x=str.indexOf("b");
			int y=str.indexOf("b",x+1);
			int z=str.indexOf("b",y+1);
			int p=str.indexOf("b",z+1);
			int q=str.indexOf("b",p+1);
			int r=str.indexOf("t");
			int s=str.indexOf("t",r+1);
			int u=str.indexOf("t",s+1);
			int v=str.indexOf("t",u+1);
			int l=str.indexOf("t",v+1);
			int m=str.indexOf("t",l+1);
			int n=str.indexOf("t",m+1);
			int o=str.indexOf("t",n+1);
			int k=str.indexOf("t",o+1);
			int j=str.indexOf("t",k+1);
			System.out.println(" index of b="+x);
			System.out.println(" index of b="+y);
			System.out.println(" index of b="+z);
			System.out.println(" index of b="+p);
			System.out.println(" index of b="+q);
			System.out.println("index of t="+r);
			System.out.println("index of t="+s);
			System.out.println("index of t="+u);
			System.out.println("index of t="+v);
			System.out.println("index of t="+l);
			System.out.println("index of t="+m);
			System.out.println("index of t="+n);
			System.out.println("index of t="+o);
			System.out.println("index of t="+k);
			System.out.println("index of t="+j);

		}
}