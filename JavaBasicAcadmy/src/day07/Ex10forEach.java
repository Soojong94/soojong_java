package day07;

public class Ex10forEach {

	public static void main(String[] args) {
		
		//확장 for 문
		
		String[] foods = { "광어" , "우럭", "참치" , "삼치" , "수육" , "족발" , "곱창"};
		
		//기존 배열 안에 있는 값을 출력문으로 꺼내기
		
		for(int i = 0; i < foods.length; i++) {
			System.out.println(foods[i]);
		}
		
		// 배얄 안에 모든 인덱스에 접근할 때는 for each 를 사용하는 게 더 편리
		
		for (String food : foods) {
			System.out.print(food);
		}
	}

}
