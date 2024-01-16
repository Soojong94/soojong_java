package day08;

public class Ex03지그재그 {

	public static void main(String[] args) {

		// 아래와 같이 2차원 배열에 값을 넣고 출력하시오
		// 1 2 3 4 5
		// 10 9 8 7 6
		// 11 12 13 14 15
		// 20 19 18 17 16
		// 21 22 23 24 25

		int[][] array = new int[5][5];

		int count = 1;

//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array[i].length; j++) {
//				if (i % 2 == 0) {
//					array[i][j] = count;
//					count++;
//				} else if (i % 2 == 1) {
//					count--;
//					array[i][j] = count;
//				}
//			}
//			count += array.length;
//		}
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array[i].length; j++) {
//				System.out.print(array[i][j] + "\t");
//			}
//			System.out.println();
//		}

		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < array[i].length; j++) {
					array[i][j] = count;
					count++;
				}
			} else {
				for (int j = array[i].length - 1; j >= 0; j--) {
					array[i][j] = count;
					count++;
				}
			}
		}
///////////////////////출력문/////////////////

//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array[i].length; j++) {
//				System.out.print(array[i][j] + "\t");
//			}
//			System.out.println();
//			
//		} 
		for (int[] i : array) {
			for (int j : i)
			System.out.print(j + "\t");
		System.out.println();
		}

	}

}
