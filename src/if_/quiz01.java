package if_;

import java.util.Scanner;

public class quiz01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int coffee =0;
		int sum=0;
		System.out.print("커피 개수를 입력: ");
		coffee= sc.nextInt();
		
		if (coffee<=10) {
			sum= 2000*coffee;
			
		}else if (coffee> 10) {
			sum = 2000*10 + 1500 * (coffee-10) ;
			
		}
		System.out.println("커피"+ coffee +"잔의 가격은 "+ sum +"원 입니다");
		
		
		
		
	}

}
