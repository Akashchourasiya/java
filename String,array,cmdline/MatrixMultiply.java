import java.util.Scanner;

class MatrixMultiply {
	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		int row1, row2, column1, column2;
		
		System.out.println("Enter the Row of Matrix 1:");
		row1 = in.nextInt();
		System.out.println("Enter the Column of Matrix 1:");
		column1 = in.nextInt();
		System.out.println("Enter the Row of Matrix 2:");
		row2 = in.nextInt();
		System.out.println("Enter the Column of Matrix 2:");
		column2 = in.nextInt();

		int array1[][] = new int[row1][column1];
		int array2[][] = new int[row2][column2];

		if(column1 != row2)
			System.out.println("Cannot Perform Multliplication.");
		else {
			int resultArray[][] = new int[row1][column2];
			int sum = 0;	
		
			System.out.println("Enter matrix 1");
			for(int i = 0; i < row1; i++) {
				System.out.print("Enter elements at row " + (i+1) + "\n");
				for(int j = 0; j < column1; j++) {
					array1[i][j] = in.nextInt();
				}
			}

			System.out.println("Enter matrix 2");
			for(int i = 0; i < row2; i++) {
				System.out.print("Enter elements at row " + (i+1) + "\n");
				for(int j = 0; j < column2; j++) {
					array2[i][j] = in.nextInt();
				}
			}

			for(int i = 0; i < row1; i++) {
				for(int j = 0; j < column2; j++) {
						sum = 0;
						for(int k = 0; k < column1; k++)
							sum += (array1[i][k] * array2[k][j]);
							resultArray[i][j] = sum;
				 }	
			}


			for(int i = 0; i < row1; i++) {
					for(int j = 0; j < column2; j++) {
						System.out.print(resultArray[i][j] + " ");
				}
			
				System.out.print("\n");
			}
		}

	}
}