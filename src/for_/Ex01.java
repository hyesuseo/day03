package for_;

public class Ex01 {

	public static void main(String[] args) {
		int i ;

//		for (i =1; i<=10; i++ ) {
//			System.out.println(i+" ");	
//		}
//		//		System.out.println(i);
//		//		i++; 이 반복되는 식이므로 반복문을 사용한다
//		System.out.println("");	

//		int num = 1;
//		//1부터 10까지 수 중 짝,홀수를 출력
//		for (/*생략가능*/; num<=10 ; num++) {
//			if(num%2 ==0) {
//				System.out.println("짝수: "+num);
//			}
//			else if(num%2==1) {
//				System.out.println("홀수: "+num);
//			}
//		}
//		
		//반복문 없이 & 반복문 넣어서 만들어보기
		//1부터 10까지에 대한 누적합을 구하기
		
//		int sum =0, n=1;
//			sum = sum +n;
//			System.out.println(sum);
//			n++;
//			sum = sum +n;
//			System.out.println(sum);
//			
//			n++;
//			sum = sum +n;
//			System.out.println(sum);
//			
//			n++;
//			sum = sum +n;
//			System.out.println(sum);
//			
			//위 방식이 계속해서 반복이 된다.
			
			
		
		int sum2=0;
		for (int a = 1; a<=10; a++ ) {
			sum2 = sum2+ a;
			System.out.println("a: "+ a);
			System.out.println("sum : "+ sum2); //반복문 안에서 출력할 경우
		}
		
		int sum3=0;
		for (int a = 1; a<=10; a++ ) {
			sum3 = sum3+ a;
			
		}
		System.out.println(sum3); //반복문 밖에서 출력할 경우 최종 결과값만 출력.
		
				
	}

}
