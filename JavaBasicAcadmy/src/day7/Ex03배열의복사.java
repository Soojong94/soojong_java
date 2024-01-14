package day7;

public class Ex03배열의복사 {

	public static void main(String[] args) {

		// 일반 변수의 복사
		int num1 = 100;
		int num2 = num1;
		// 일반 변수의 복사는 기존 변수의 ★값★을 복사를 함( num1=100; - 기존 유지)

		// 길이가 3인 정수형 배열 값은 100 200 300이 들어간 배열 array 만들기

		int[] array = new int[3];
		array[0] = 100;
		array[1] = 200;
		array[2] = 300;

		// 배열을 만드는 두번째 방법(길이와 값을 알고 있을 때)

		int[] array1 = { 100, 200, 300 };
		System.out.println(array[2]);
		int[] array2 = array1;
		System.out.println(array2[0]);
		array2[0] = 999;
		System.out.println(array2[0]);
		System.out.println(array1[0]);

		// 배열은 값이 아닌 ★주소★를 복사함 = 배열 안의 값을 바꾸면 복사한 주소가 가르키는 값도 달라짐
		
		

	}

}
