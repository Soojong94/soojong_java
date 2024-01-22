package day1;

public class Practice23 {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];
		int count = 1;

		for (int j = 0; j < arr.length; j++) {
			for (int i = arr.length - 1; i >= 0; i--) {
				arr[i][j] = count;
				count++;
			}
		}
		for (int[] i : arr) {
			for (int j : i) {
				System.out.print(j + "\t");

			}
			System.out.println();
		}
	}

}
