package for_;

import java.util.Scanner;

public class quiz02 {

	public static void main(String[] args) {
		//1. 
		
		Scanner sc=new Scanner(System.in);
		int n, times;
		System.out.println("몇 회: ");
		times = sc.nextInt();
		for (n=1; n<=times; n++) {
			System.out.println(n+". hello");
			
		}
		
		

	}

}
