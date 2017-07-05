class P10{
	public static void main(String args[]){
		int i,j;
		for(i=1;i<=5;i++){
		for(j=1;j<=6-i;j++)
			System.out.print(6-j);
		for(j=i;j>=2;j--)
			System.out.print(" ");
		for(j=3;j<=i;j++)
			System.out.print(" a");
			System.out.print("\n");
		}
		
	}
}