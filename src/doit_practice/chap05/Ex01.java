package doit_practice.chap05;

import java.util.Scanner;

public class Ex01 {

	//--- 음이 아닌 정숫값 n의 팩토리얼 값을 반환 ---//
	static int factorial(int n) {
		int fact = 1;

		while (n > 1) {
			fact *= n--;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("정수를 입력하세요 : ");
		int   x = stdIn.nextInt();

		System.out.println(x + "의 팩토리얼은 " + factorial(x) + "입니다.");
	}
}
