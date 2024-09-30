package for_;

import java.util.Scanner;

public class quiz05 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int a, b, times =0;
		
		System.out.print("Test 횟수: ");
		times = sc.nextInt();
		
		for (int i=1;i<=times;i++) {
		
			System.out.print("a,b 입력: ");
			a= sc.nextInt();
			b= sc.nextInt();
			System.out.println("a + b의 합:" +(a+b));
		}
		
	}

}
