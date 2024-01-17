package day11;

public class PiggyBankMain {

	public static void main(String[] args) {

		
		//저금통 클래스를 불러와서 돈을 저금하고 인출하고
		//잔액을 볼 수 있는 클래스
		//deposit / withdraw /showmoney
		//Object(객체, 결과물) ->실제 결과물을 만들 것이라서 실행할 main () 필요
		
		PiggyBank pig = new PiggyBank();
		pig.deposit(1500);
		pig.deposit(700);
		pig.showmoney();
		
		pig.withdraw(500);
		pig.showmoney();
		
		pig.deposit(2099900000);
		pig.showmoney();
	}

}
