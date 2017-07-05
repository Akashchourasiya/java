class Array2 {
	
	public static void main(String args[]) {
		
		int sum = 0;
		float avg = 0f;
		int numbers[] = {10, 22, 33, 34, 12, 122, 23, 45, 56, 11};
		
		System.out.println("The numbers are as follows - ");
		for(int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i] + " ");
			sum = numbers[i] + sum;
		}

		avg = (float)sum/numbers.length;
		System.out.println("\n Sum    : " + sum);
		System.out.println("\nAverage : " + avg);
	}
}