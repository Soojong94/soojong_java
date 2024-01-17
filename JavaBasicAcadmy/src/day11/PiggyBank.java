package day11;

public class PiggyBank {

	// 저금통 설계도 클래스

	// Class (설계도 , 틀) -> 설계만 하는 것이라서 코드를 실행할 필요가 없음
	// 즉, main 메소드 필요 없음

	// 필드
	// 자본 : money

	int money = 0;

	// 메소드
	
	// 저금
	public void deposit(int money) {
		
		this.money += money;
		System.out.println("입금 금액 : " + money);
	}

	// 출금
	public void withdraw(int money) {
	
		this.money -= money;
		System.out.println("출금 금액 : " + money );
	}

	// 잔액
	public void showmoney() {
		System.out.println("현재 잔액 : " + this.money );
	}

}
