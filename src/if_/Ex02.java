package if_;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.print("수 입력:");
		num=sc.nextInt();
		
		if(num>100) {
			System.out.println("100보다 크다");
		} else if(num>50) {//&& num<100) {
			System.out.println("50보다 크다");
		} else if(num>0) {// && num<50) {
			System.out.println("0보다크다");
		}else {
			System.out.println("그 외의 값");
		}
		//else if로 묶여있으면 그 중에서 하나만 입력되고
		//if 문을다중으로 쓰면 첫번째 if가 참이던 거짓이던 또 실행됨
		
		System.out.println("키보드가 너무 안됨....");	
	}

}
