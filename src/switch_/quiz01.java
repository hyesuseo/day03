package switch_;

import java.util.Scanner;

public class quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int day = 0;
			System.out.print("날짜 입력:");
			day = sc.nextInt();

			switch (day%7) {
			case 1: System.out.println("월요일"); break;
			case 2: System.out.println("화요일"); break;
			case 3: System.out.println("수요일"); break;
			case 4: System.out.println("목요일"); break;
			case 5: System.out.println("금요일"); break;
			case 6: System.out.println("토요일"); break;
			case 0: System.out.println("일요일"); break;
			default: System.out.println("매칭되는 요일이 없음");
	
		}
		

		}


	}

}
