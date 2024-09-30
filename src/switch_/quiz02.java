package switch_;

import java.util.Scanner;

public class quiz02 {

	public static void main(String [] args) {

		
		Scanner sc=new Scanner(System.in);
		int choice=0;
		String home=null, office=null;
		//초기화가 필요한 문제
		
		
		while (true) {
			System.out.println();
			System.out.println("1. 우리집 등록");
			System.out.println("2. 회사 등록");
			System.out.println("3. 등록 보기");
			System.out.println("4. 종료");
			System.out.print(">>>: ");
			choice = sc.nextInt();	

			switch(choice) {
			case 1: System.out.print("우리집 목적지 입력: ");
			home =sc.next();
			System.out.println("등록 성공"); break;


			case 2: System.out.print("회사 목적지 입력: ");
			office = sc.next();
			System.out.println("등록 성공"); break;


			case 3: 
				if (home ==null ) {
					System.out.println("집주소가 입력되지 않음");
				}else if (office ==null) {
					System.out.println("회사주소 입력되지 않음");

				}else {
					System.out.println("집주소: "+home);
					System.out.println("회사: "+ office); 
				} break;

			case 4: System.out.println("시스템 종료"); 
			return;

			}

		}


	}

}
