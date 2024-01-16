package day06;

public class Ex06dowhile {

	public static void main(String[] args) {

		// do-while 로 하는 나무찍기
		int treeHp = 100;
		int axPower = 50;
		int count =0;
		do {
			//반복작업 코드를 작성할 부분
			// 이 안에 작성된 코드는 무조건 1회 실행
			System.out.println("흐쨔");
			treeHp -= axPower;
			count++;
			
		}while(treeHp > 0 );
		System.out.println(count + "번의 도끼질로 나무가 쓰러졌다");
	}

}
