package day07;

public class Ex09BubbleSort {

	public static void main(String[] args) {

		int[] array = { 35, 5, 7897, 555, 20 ,50,50,50,43,48,489,4897};
		int a = 0;
		
//		if 문을 먼저 작성하고 for 문으로 덮는 게 쉬움

		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array.length - i; j++) {
				if (array[j] > array[j + 1]) {
					a = array[j];
					array[j] = array[j + 1];
					array[j + 1] = a;
				}
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
