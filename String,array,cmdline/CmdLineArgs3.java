class CmdLineArgs3 {
	public static void main(String args[]) {

		try {	
			if(args.length < 5) {
				System.out.print("Please Enter 5 numbers. Numbers Aborting!!!!");
				System.exit(0);
			}
		
			int num[] = new int[args.length];
				
			for(int i = 0; i < args.length; i++)
					num[i] = Integer.parseInt(args[i]);
			int sumArgs = 0;
			float avgArgs = 0;
			
			for(int i = 0; i < num.length; i++) {
				sumArgs = sumArgs + num[i];
			}

			avgArgs = (float)sumArgs/num.length;
			System.out.println("SUM : = " + sumArgs);
			System.out.println("AVERAGE : = " + avgArgs);

			for(int i = 0; i < num.length; i++) {
				for(int j = 0; j< (num.length-1); j++) {
					if(num[i] < num[j]) {
						int temp = num[i];
						num[i] = num[j];
						num[j] = temp;
					}
				}
			}
			
			System.out.println("The Numbers in Ascending Order are:");			
			for(int i =0; i < num.length; i++)
				System.out.print(num[i] + " ");

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