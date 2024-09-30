package for_;

import java.util.Scanner;

public class quiz02_4 {

	public static void main (String [] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("몇 단: ");
		int dan = sc.nextInt();
		
		for (int a =1; a<=9; a++) {
			System.out.printf("%d * %d = %d\n", dan, a, dan*a);
		}
		
		
	}
}
