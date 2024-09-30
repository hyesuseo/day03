package if_;

import java.util.Scanner;

public class quiz02 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int jung;
		System.out.print("정수를 입력: ");
		jung = sc.nextInt();
		
		
//		if(jung %3 ==0 && jung%4==0 && jung !=0) { // jung %12 ==0으로 써도 ok
//			System.out.println("3의배수이면서, 4의 배수에도 해당합니다");
//		}else if(jung %3==0 && jung !=0) {
//			System.out.println("3의 배수에만 해당합니다");
//		}else if(jung %4 ==0 && jung !=0) {
//			System.out.println("4의 배수에만 해당합니다");
//		}else if(jung %4 !=0 || jung %3 !=0 && jung !=0) {
//			System.out.println("3의 배수도, 4의 배수도 해당안됩니다");
//		}else if (jung ==0){
//			System.out.println("0은 잘못입력했습니다");
//		}
		
		//순서를 바꾸는 방식으로도 적용가능하다

		if(jung ==0 ) { // jung %12 ==0으로 써도 ok
		System.out.println("0이다");
		}else if (jung %12 ==0){
			System.out.println("3과 4의 배수이다");
		}else if(jung %3==0 && jung !=0) {
			System.out.println("3의 배수에만 해당합니다");
		}else if(jung %4 ==0 && jung !=0) {
			System.out.println("4의 배수에만 해당합니다");
		}else if(jung %4 !=0 || jung %3 !=0 && jung !=0) {
			System.out.println("3의 배수도, 4의 배수도 해당안됩니다");
		
		}
		
		
		
	}

}
