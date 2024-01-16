package day03;

public class Ex04Opr {

	public static void main(String[] args) {

		// 5. 논리 연산자
		// ! (Not)
		// && (And) : Shift + 7
		// || (Or) : Shift + \
		
	 	// 1) ! (Not)
		// boolean 결과를 반대로 뒤집는다
	    System.out.println(!true); //false
	    System.out.println(!false); //true
	    
	    boolean isRainy = false;
	    
	    // isRainy에 true 가 들어있다면
	    // false 를 대입
	    // false 가 들어있다면
	    // true 를 대입
	    
	    isRainy = !isRainy;
	    
	   // 2) && (And)
	   // (피연산자) && (피연산자)
	    
	    
	    // Q1. 지금 비가 오나요 ? false
	    // Q2. 오늘은 금요일입니다 ? false
	    // Q3. 지금 비가 안 오나요 ? true
	    // Q4. 오늘은 목요일 입니다? true
	    
	    
	    // true && true -> true
	    // true && false -> false
	    // false && true -> false
	    // false && false -> false
	    
	    // 둘다 true 여야만 결과가 true
	    
	    // 논리곱 
	    // ture (1) / false (0)      
	    // 1 && 1 -> 1(true)
	    // 1 && 0 -> 0(false)
	    // 0 && 1 -> 0(false)
	    // 0 && 0 -> 0(false)
	    
	    // 3) || (Or)
	    // ture || true -> true
	    // true || false -> true
	    // false || true -> true
	    // false || false -> false
	    
	    // 논리합
	    // 양수는 true로 취급
	    
	    // ! (NOT) -> boolean 뒤집기
	    // && (And) -> 둘 다 true일때만 true
        // || (Or) -> 둘 다 false일때만 false
	    
	    
	    
	    
	}

}
