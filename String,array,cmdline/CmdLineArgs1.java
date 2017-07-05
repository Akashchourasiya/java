class CmdLineArgs1 {
	public static void main(String args[]) {
		
		try {
			if(args.length > 1) {
				System.out.print("More than one number entered. Not Allowed. Aborting!!!!!");
				System.exit(0);
			}
			float num = Float.parseFloat(args[0]);
			System.out.println("Square of the number " + num + " is = " + Math.pow(num,2));
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