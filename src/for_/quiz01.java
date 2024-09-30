package for_;

public class quiz01 {

	public static void main(String[] args) {
		//1~10까지의 합중 짝, 홀수의 합을 구해서 출력
		
		//결과 짝의 합은 30, 홀의 합은 25
		
		int a, jjak=0, hol=0;
		
		
		for (a=1; a<=10; a++) {
			if (a%2==0) {
				jjak = jjak + a;
				System.out.println("짝:"+ a);
				System.out.println("여기까지합"+ jjak);
				
			}else {
				hol = hol + a;
				System.out.println("홀:"+ a);
				System.out.println("여기까지합"+ hol);
			}
		}
		System.out.println("짝수의 합: "+ jjak);
		System.out.println("홀수의 합: " + hol);
		// 짝수는 even, 홀수는 odd 라고 함...^^;;
	}

}
