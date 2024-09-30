package for_;

import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	int money, num, price=0, amount=0, sum=0, sum2=0;
	
	money= sc.nextInt();
	num = sc.nextInt();
		for(int i=1; i<=num; i++) {
			price= sc.nextInt();
			amount=sc.nextInt();
			sum = price * amount;
			sum2 += sum;
			}
			System.out.println(sum2);
		if (sum2 == money) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
			
		
		

	}

}
