package day7;

public class Ex02큰수찾기 {

	public static void main(String[] args) {

//		길이가 5인 정수형 배열 array 만들기
		int[] array = new int[5];
		array[0] = 12;
		array[1] = 3;
		array[2] = 9;
		array[3] = 15;
		array[4] = 7;
		int max = 0;
//		array 배열 안에서 가장 큰 수를 찾아 출력하시오
//		결과) 가장 큰 수 : 15

		for (int i = 0; i < array.length; i++) {		
			if (max < array[i]) {
				max = array[i];
			}
		}System.out.println(max);
	}
}
