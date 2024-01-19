package 상속2;

public class PhoneMain {

	public static void main(String[] args) {

		Phone p1 = new Phone();
		p1.call();
		p1.callBack();
		
		System.out.println();
		
		PayPhone pp1 = new PayPhone();
		pp1.coin();
		pp1.call();
		
		System.out.println();
		
		SmartPhone sp1 = new SmartPhone();
		sp1.call();
		sp1.callBack();
		sp1.interNet();
		sp1.playMusic();
		
	}

}
