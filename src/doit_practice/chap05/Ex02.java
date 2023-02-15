package doit_practice.chap05;

import java.util.Scanner;

public class Ex02 {
	
	//--- 정숫값x, y의 최대 공약수를 비재귀적으로 구하여 반환 ---//
	static int gcd(int x, int y) { // 9, 6
		
		while (y != 0) {
			int temp = y;
			System.out.println("y0: "+ y); //6 -> 3
			System.out.println("t0: "+ temp); // 6 -> 3
			y = x % y;
			System.out.println("y1: "+ y); //3 -> 0
			System.out.println("x1: "+ x); //9 -> 6
			x = temp;
			System.out.println("y2: "+ y); //3 -> 0
			System.out.println("x2: "+ x); //6 -> 3
			System.out.println("t2: "+ temp); // 6 -> 3
			System.out.println();
		}
		return x;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("두 정수의 최대 공약수를 구합니다.");

		System.out.print("정수를 입력하세요 : ");   int x = stdIn.nextInt();
		System.out.print("정수를 입력하세요 : ");   int y = stdIn.nextInt();

		System.out.println("최대 공약수는 " + gcd(x, y) + "입니다.");
	}

}
