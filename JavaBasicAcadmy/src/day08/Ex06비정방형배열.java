package day08;

public class Ex06비정방형배열 {

	public static void main(String[] args) {

		// 1 2
		// 3 4 5
		// 6 7 8 9

		int[][] array = new int[3][];

		array[0] = new int[2];
		array[1] = new int[3];
		array[2] = new int[4];

//		i < array.length   /   i+2 (j)

		int cnt = 1;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = cnt;
				cnt++;
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
