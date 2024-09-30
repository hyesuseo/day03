package switch_;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		//
		
		Scanner sc= new Scanner(System.in);
		
		int num;
		System.out.print("수 입력: ");
		num = sc.nextInt();
		
		switch(num) {
			case 1: System.out.println("1 입력 "); break;
			//break가 있으면 이거 switch문을 실행하고 빠져나감
			case 2: System.out.println("2 입력 "); break;
			default: System.out.println("그 외의 값");
		}
		//더 이상 실행할 값이 없을때는 break를 생략해도 되지만...
		//헷갈리면 그냥 깔끔하게 쓰자.
		System.out.println("다음 문장들 실행...");
		System.out.println();
		
		
		
		//아래와 같이 if문으로 사용할 수도 있다.
		if (num==1) {
			System.out.println("1입력");
		}else if (num==2) {
			System.out.println("2 입력");
		}else {
			System.out.println("그 외의 값");
		}
		System.out.println();
		
		//문자열 switch문도 궁금해서 한번 해봄  
		String manage;
		System.out.print("권한 입력: (관리자/게스트)");
		manage = sc.next();
		
		switch(manage) {
			case "관리자" : System.out.println("관리자모드 "); break; 
			case "손님": //두 개의 케이스에 걸 수도 있음
			case "게스트": System.out.println("게스트 모드"); break;
			default: System.out.println("잘못된 입력입니다");
		}
		System.out.println("다음 문장들 실행...");
		
		System.out.println();
		System.out.println();
		
		
		System.out.println("짝 홀 구분");
		System.out.print("수 입력: ");
		num = sc.nextInt();
		
		switch(num %2) {
			case 0 : System.out.println("짝수"); break;
			//break가 있으면 이거 switch문을 실행하고 빠져나감
			default: System.out.println("홀수");
		}
		
		
	}

}
