package doit_practice.chap05;

import java.util.Scanner;

public class Ex04 {

	//--- 재귀 메서드 ---//
	static void recur(int n) {
		if (n > 0) {
			System.out.println("n0: "+ n);
			recur(n - 2);
			System.out.println("n1: "+ n);
			recur(n - 1);
			System.out.println("n2: "+ n);
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("정수를 입력하세요 : ");
		int x = stdIn.nextInt();

		recur(x);
	}
}
