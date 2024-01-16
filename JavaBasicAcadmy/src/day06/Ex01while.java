package day06;

public class Ex01while {

	public static void main(String[] args) {

//		 while , do - while 
//		반복 횟수가 정해지지 않았을 때 주로 활용
//		나무 넘어뜨리기
		int treeHp = 100;
		int axPower = 30;
		int count = 0 ;

		while (treeHp > 0) {
			System.out.println("웃쌰!");
			treeHp -= axPower;
			count++;
		}
		System.out.println(count + " 번만에 나무가 쓰러졌다!");

	}

}
