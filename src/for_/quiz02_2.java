package for_;

public class quiz02_2 {

	public static void main(String[] args) {
		int i, sum=0;
		for (i=1; sum<528; i++) {
			sum += i;
			if (sum ==528) {
				System.out.println("sum : "+sum+"\n"+"i : "+i);
		}
		
		}
		
		int j , sum2 = 0;
		
		for (j =1; j<=100; j++) {
			sum2 = sum2+j;
			
		} if (sum2 ==528) {
			System.out.println("j의 값: "+j);	
			// for문 바깥에서 걸면 if가 안걸림
		}
		
	}

}
