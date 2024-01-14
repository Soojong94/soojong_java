package day8;

public class Ex01이차원배열 {

	public static void main(String[] args) {

		// 이차원 배열
		// -배열 안에 배열이 존재하는 배열
		// array ->
		// [1, 2, 3, 4]
		// [5, 6, 7, 8]
		// [9, 10, 11, 12]

		int[][] array = new int[3][4];

		int cnt = 1; // 이차원 배열 안에 저장될 값

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = cnt;
				cnt++;
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

//		 for(int i = 0; i < array.length; i++) {
//	         for(int j = 0; j < array[i].length; j++) {
//	            System.out.print(array[i][j] + "\t");
//	         }
//	         System.out.println();
//	      }

		/////////////////////////////////////////////
		
//		System.out.print(array[0][0] + " ");
//		System.out.print(array[0][1] + " ");
//		System.out.print(array[0][2] + " ");
//		System.out.print(array[0][3] + " ");
	}

}
