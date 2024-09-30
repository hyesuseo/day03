package for_;

public class Ex02 {
	public static void main (String [] args) {
		
		//아래 세 가지가 모두 동일하게 표현됨
		// 1.
		for(int i =0; i<=10; i++) {
			System.out.print(i+" ,");
		}
		System.out.println();
		
		// 2.
		int i =0; // for 문 밖에서 변수 선언하면
		for(; i<=10; i++) { //for문 안에서 초기화문의 변수선언을 생략할 수 있음
			System.out.print(i+" ,");
		}
		System.out.println();
		
		
		// 3.
		i =0; //위에서  
		for(; i<=10; ) { 
			System.out.print(i+" ,");
			i++; // 증감식이 여기에 들어와도 동일하게 표현됨! 
			//종속문장 다 실행하고 
		}
		System.out.println();
		
		// 4.
		  
		//for( ; ; ) { //무한반복 동작 //while(true)와 동일함
			while(true) {
				System.out.println(i+" ,");
			i++; 
			
		}
		
		
		
	}
}
