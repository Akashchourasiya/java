class CmdLineArgs2 {
	public static void main(String args[]) {
		
		try {	if(args.length > 1) {
				System.out.print("More than one number not allowed. Aborting!!!!");
				System.exit(0);
			}

			int num = Integer.parseInt(args[0]);
			for(int i = 1; i<=10; i++) {
			System.out.println(num + " * " + i + " = " + i*num);
			}

		}

		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Invalid Index");
		}

		catch(NumberFormatException ne) {
			System.out.println("Invalid Format");
		}

		catch(Exception e) {
			System.out.println("Runtime Error found");
		}		

	}
}