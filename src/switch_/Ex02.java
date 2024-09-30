package switch_;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		String name=null; 
		int num =3;
		switch( num ) {
		case 1: System.out.println("이름저장");
		 name = "홍길동"; break;
		 //1번이 아니면 name값이 입력이 안됨
		case 2: System.out.println("출력");
		}
		System.out.println("이름 :" + name);
		
		//이렇게만 해두면 name이라는 변수가 초기화 되지 않아서 출력이 불가능함
		
		Scanner sc=new Scanner(System.in);
		
		int i=0;
		while (true) 
		{
			i++;
			System.out.print(i+".이름 입력:");
			name = sc.next();
//			System.out.println("출력: "+ name);
			switch( name ) {
			case "홍길동": System.out.println("반갑다"); break;
			default: System.out.println("존재하지 않는 이름입니다");
			}
		}
		
		

	}

}
