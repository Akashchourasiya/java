class Sales {
	
	public static void main(String args[]) {
			int sales[][] = {{120, 123, 137, 198},
					 {100, 217, 731, 872},
					 {816, 871, 127, 908},
					 {162, 717, 998, 198}};

			int sumRegion[] ={0, 0, 0, 0}; 
			int sumProduct[] ={0, 0, 0, 0};
			int totalSales = 0, highest = sales[0][0], lowest = sales[0][0];
			
			System.out.print("\t");
			for(int i = 0; i < 4; i++)
				System.out.print("region" + (i+1) + " ");
				System.out.print("  Sales Product Wise \n");

			for(int i = 0; i < 4; i++) {
				System.out.print("Product" + (i + 1) + "  ");
				for(int j = 0; j < 4; j++) {
					System.out.print(sales[i][j] + "\t");
					sumProduct[i] += sales[i][j];
				}
				System.out.print("\t" + sumProduct[i]);
				System.out.println();			
			}
		
			for(int j = 0; j < 4; j++) {
				for(int i = 0; i < 4; i++) {
					sumRegion[j] += sales[i][j];
				}
			} 

			System.out.print("Sales     ");
			for(int i = 0; i < 4; i++)
				System.out.print(sumRegion[i] + "\t");

			for(int i = 0; i < 4; i++) {
				for(int j = 0; j < 4; j++) {
					if(sales[i][j] < lowest)
						lowest = sales[i][j];
					if(sales[i][j] > highest)
						highest = sales[i][j];
					totalSales += sales[i][j];
				}
			}
			System.out.println("\n\nHighest = " + highest + "\n\nLowest  = " + lowest + "\n\nTotalSales = " + totalSales);	
	}
}