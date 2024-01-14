package day7;

public class Ex01배열 {

	public static void main(String[] args) {

		// 배열
		// -동일한 자료가 순차적으로 저장된 것
		// -저장된 데이터를 가져오거나 넣기 위해 번호 매김(인덱스)
		// -인덱스는 0부터 시작하고 길이는 1부터 시작한다
		// -배열의 길이는 배열을 생성할 때 지정하며 변경할 수 없다. 
		
		// 정수를 저장할 수 있는 길이가 5인 배열 array 생성
		int [] array = new int[15];
		// 레퍼런스 변수 :  값을 저장하지 않고 주소를 저장함
		// (call by reference)
		// 각 인덱스 안에 1~5까지 저장
		// 배열의 길이를 알 수 있는 방법
		// 배열 이름.length

		
		//각 인덱스값 출력
		for(int i = 0; i<array.length ; i++) {
		array [i] = i+1;
		System.out.println(array[i]);
		}
		String [] array2 = new String [2];
		array2[0] = "A";
		array2[1] = "B";
		
		System.out.println(array2[0]);
		
		
				

	}

}
