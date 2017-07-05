class Array3 {
	
	public static void main(String args[]) {
		
		int numbers[][] = {{11, 22, 33, 14, 45},
				   {61, 73, 82, 19, 10},
				   {11, 12, 33, 24, 15},
				   {61, 71, 48, 29, 30},
				  };
		
		int sumColumns[] = {0, 0, 0, 0, 0};
		int sumRows[] = {0, 0, 0, 0};
		int sumMatrix = 0;

		for(int i = 0; i < 6; i++)
			System.out.print("\t");
		System.out.print("sum\n\n");

		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers[i].length; j++) {
					System.out.print("\t" + numbers[i][j] + "  ");
					sumRows[i] = sumRows[i] + numbers[i][j];
				}
			System.out.print("\t" + sumRows[i]);
			System.out.println();	
		}

		System.out.print("Sum\t");
		for(int j = 0; j < 5; j++) {
			for(int i = 0; i < 4; i++) {
					sumColumns[j] = sumColumns[j] + numbers[i][j];
				}
			System.out.print(sumColumns[j] + "\t");
		}
		

		/* for(int i = 0; i < 4; i++) {
			for(int j =0; j< 5; j++) {
					sumMatrix = sumMatrix + numbers[i][j];
			}
		}
		System.out.println("The sum of matrix is = " + sumMatrix); */

		for(int i = 0; i < sumRows.length; i++) {
			sumMatrix = sumMatrix + sumRows[i];
		}
		System.out.println("\n\n The sum of matrix is = " + sumMatrix);	
	}
}
