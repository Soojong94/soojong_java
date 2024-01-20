package 보충수업;

public class Ex01배열 {

	public static void main(String[] args) {

//		1. 배열 참조변수 선언 : 배열의 참조값을 저장할 공간만 만들어라!
		int[] arr;
		
//		2. 배열 생성(5)
		arr = new int [5]; // 크기 지정 필수!
		
//		System.out.println(arr); //배열을 찾아갈 수 있는 참조값(주소값)만 확인 가능
		
		arr[0] = 0; // 0번 인덱스에 값 할당
		arr[1] = 1; 
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		
// 연속적인 공간을 할당 받는다! -> 순서를 가지고 있다
//	반복문(for) -> 범위가 정해져 있음(0~)
		
		for(int i : arr) {
			System.out.print(i + "\t");
		}
		
		
	}

}
