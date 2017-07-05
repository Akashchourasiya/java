import java.util.Scanner;
	class Employee{
		private String name;
		private String code;
		
		public Employee(){
			name=new String();
			code=new String();
		}
		public void acceptdata(){
		Scanner a=new Scanner(System.in);
		System.out.println("enter name of employee");
		name=a.nextLine();
		System.out.println("enter code");
		code=a.nextLine();
			}
		public void displaydata(){
		System.out.println("name"+name);
		System.out.println("code"+code);			
			}
		public static void main(String args[]){
			Employee E=new Employee();
			E.acceptdata();
			E.displaydata();
		}
}
class PerEmp extends Employee{
		char grade;
		int days;

		public void acceptdata(){
		super.acceptdata();
		Scanner a=new Scanner(System.in);
		System.out.println("enter grade");
		grade=a.nextLine().charAt(0);
		System.out.println("enter number of days ");
		days=a.nextInt();
		}

		public void displaydata(){
		super.displaydata();
		System.out.println("garde is"+grade);
		System.out.println("days is"+days);
		}

		public static void main(String args[]){
		Employee E1=new Employee();
		PerEmp P=new PerEmp();
		P.acceptdata();
		P.displaydata();
		}
	}