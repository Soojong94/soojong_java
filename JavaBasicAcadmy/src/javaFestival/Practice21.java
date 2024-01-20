package javaFestival;

public class Practice21 {

	public static void main(String[] args) {

//		두개의 숫자를 뽑아 서로의 거리를 비교한 후 거리가 가장 작은 숫자의 위치를 출력하시오

		int[] point = { 92, 32, 52, 9, 81, 2, 68 };
		int distance = 0; // 지금까지 계산한 거리 중에 제일 짧은 거리를 발견했을 때 앞쪽에 있는 인덱스 번호를 기억
		int distance2 = 0; // 뒤쪽에 있는 인덱스 번호 기억
		int len = Math.abs(point[0] - point[1]);
		; // 지금까지 본 거리 중에 제일 짧은 거리 기억

		for (int i = 0; i < point.length - 1; i++) {
			for (int j = 1 + i; j < point.length; j++)
				if (Math.abs(point[i] - point[j]) < len) { // 절대값 사용 (사용 안 하려면 if 문 써서 추가 로직 만들어주면 됨) - 큰 수 / 작은 수 저장할 변수 2개 추가로 필요함
					distance = i;
					distance2 = j;
					len = Math.abs(point[i] - point[j]);
				}
		}
		System.out.printf("result = [ %d , %d ] ", distance, distance2);

	}

}
