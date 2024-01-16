package day07;

public class Ex04총합과평균그리고짝수 {

	public static void main(String[] args) {

		int[] array = { 55, 57, 56, 12, 13, 9, 8, 11, 72, 99, 24, 11, 3 };
		int sum = 0;
		
		int even = 0;
		String [] array1 = {"가","나","다","라","스"};
		array1[1] = "마";
		System.out.println(array1[2] + array1[1] +array1[4]);
		
		// 문제
		// 콘솔창에 아래와 같이 결과가 나오게 해주세요
		// 총합 : 430
		// 평균 : 33.07692307...
		// 짝수 개수 : 5

		for (int i = 0; i <= 12; i++) {
			sum += array[i];
			
			if (array[i] % 2 == 0) {
				even++;
			}

		}
		System.out.print("총합 : ");
		System.out.println(sum);
		System.out.print("평균 : ");
		System.out.println((double) sum / array.length);
		System.out.print("짝수 개수 : ");
		System.out.println(even);

	}

}
