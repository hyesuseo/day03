package if_;

public class Ex01 {

	public static void main(String[] args) {
		//중첩된 if 문 
		//if문 안에 또 if 문을추가할 수 있다
		
		
		int num= 10;
		if(num>0 && num<=100) {
			System.out.println("0~100사이의 수");
		}else {
			System.out.println("그외의값");
		}
		System.out.println("다음 문장들 실행!!!");
		
		System.out.println();
		
		num=100;
		if(num>0) {
			if(num<=100) {
				System.out.println("0~100사이의 수");
			}else {
				System.out.println("100보다 큰 양수");
			}
		}else {
			System.out.println("음수입니다");
		}
		System.out.println("다음 문장들 실행!!!");
		

	}

}
