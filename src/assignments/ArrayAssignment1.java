package assignments;

public class ArrayAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Create a 1D array of integers with a length of 5. Populate the array with
		 * values of your choice and print each element of the array to the console. For
		 * the 1D array of integers, you could use: {4, 7, 2, 9, 5}.
		 */
		int[] arr = { 4, 7, 2, 9, 5 };
		System.out.println("1D Array of integers are : " + arr[0] + " , " + arr[1] + " , " + arr[2] + " , " + arr[3]
				+ " & " + arr[4]);
		System.out.println("***************************************");

		/**
		 * Create a 1D array of strings with a length of 3. Populate the array with your
		 * favorite colors and print each element of the array to the console.For the 1D
		 * array of strings, you could use: {"red", "green", "blue"}.
		 */
		String[] arr1 = new String[3];
		arr1[0] = "red";
		arr1[1] = "green";
		arr1[2] = "blue";
		System.out.println("My favorite colors : " + arr1[0] + " , " + arr1[1] + " & " + arr1[2]);
		System.out.println("***************************************");

		/**
		 * Create a 2D array of integers with a size of 3x3. Populate the array with
		 * values of your choice and print each element of the array to the console.For
		 * the 2D array of integers, you could use: {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}.
		 */
		int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("2D array of integers : ");
		System.out.println(arr2[0][0] + "  " + arr2[0][1] + "  " + arr2[0][2]);
		System.out.println(arr2[1][0] + "  " + arr2[1][1] + "  " + arr2[2][2]);
		System.out.println(arr2[2][0] + "  " + arr2[2][1] + "  " + arr2[2][2]);
		System.out.println("***************************************");

		/**
		 * Create a 2D array of strings with a size of 2x2. Populate the array with your
		 * favorite foods and print each element of the array to the console.For the 2D
		 * array of strings, you could use: {{"pizza", "pasta"}, {"burger", "fries"}}.
		 */
		String [][] arr3 = {{"pizza", "pasta"}, {"burger", "fries"}};
		System.out.println("My favorite foods are : ");
		System.out.println(arr3[0][0] + " , " + arr3[0][1]);
		System.out.println(arr3[1][0] + " , " + arr3[1][1]);

	}

}
