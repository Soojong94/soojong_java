package day8;

public class Ex04지그재그2 {

	public static void main(String[] args) {

		// 1 10 11 20 21
		// 2 9 12 19 22
		// 3 8 13 18 23
		// 4 7 14 17 24
		// 5 6 15 16 25

		int[][] array = new int[5][5];
		int count = 1;

		/*
		 * 00 = 1 01 = 10 02=11 03=20 04 =21 10 = 2 11 = 9 20 = 3 12 = 8
		 */

		for (int j = 0; j < array.length; j++) {
			if (j % 2 == 0) {
				for (int i = 0; i < array.length; i++) {
					array[i][j] = count;
					count++;
				}
			} else {
				for (int i = array.length - 1; i >= 0; i--) {
					array[i][j] = count;
					count++;
				}
			}

		}
		for (int[] i : array) {
			for (int j : i) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}
	}

}
