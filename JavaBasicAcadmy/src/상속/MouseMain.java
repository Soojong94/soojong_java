package 상속;

public class MouseMain {

	public static void main(String[] args) {

		Mouse m1 = new Mouse();
		WheelMouse wm1 = new WheelMouse();
		ErgonomicsMouse em1 = new ErgonomicsMouse();
		WheelMouse2 wm2 = new WheelMouse2();
		
		//기본마우스
		m1.leftClick();
		m1.rightClick();
		m1.drag();
		
		System.out.println();
		
		//휠마우스
		wm1.leftClick();
		wm1.rightClick();
		wm1.drag();
		wm1.scroll();
		
		System.out.println();
		
		//인체공학
		em1.drag();
		em1.leftClick();
		em1.rightClick();
		em1.ergonomic();
		
		System.out.println();
		
		//2번 휠마우스
		wm2.rightClick();
		wm2.drag();
		wm2.scroll();
		wm2.scroll2();
	
	
	}

}
