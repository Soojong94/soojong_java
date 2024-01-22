package day1;

public class Practice21 {

	public static void main(String[] args) {

		int[] point = { 1, 3, 9, 8, 20, 39, 48, 75 };
		int index = 0;
		int index2 = 0;
		int distance = Math.abs(point[0] - point[1]);

		for (int i = 0; i < point.length - 1; i++) {
			for (int j = 1 + i; j < point.length; j++) {
				if (Math.abs(point[i] - point[j]) < distance) {
					index = i;
					index2 = j;
					distance = Math.abs(point[i] - point[j]);
				}
			}

		}
		System.out.println("result = " + index + "," + index2);

	}

}
