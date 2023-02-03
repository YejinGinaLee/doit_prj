package doit_practice.chap03;

import java.util.Scanner;

public class Ex02 {
	
	static int seqSearch(int[] a, int n, int key) {
		
		System.out.print("   |");
		for(int i = 0; i < n; i++) {
			System.out.printf("%2d", i);
//			System.out.print(i);
		}
		System.out.println();
		
		System.out.print("---+");
		
		for(int j = 0; j < n; j++) {
			System.out.print("---");
		}
		System.out.println();
		
		for(int i = 0; i < n; i++) {
			System.out.print("   |");
			System.out.printf(String.format("%%%ds*", (i * 2) + 1), "");
			System.out.println();
			System.out.printf("%3d|", i);
			
			for(int k=0; k<n; k++){
				System.out.printf("%2d", a[k]);
			}
			System.out.println();
			if (a[i] == key) {
				return i;
			}
		}		
		return -1;
	}
	
	
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("요솟수 : ");
		int num = stdIn.nextInt();
		int[] x = new int[num + 1];						// 요솟수가 num + 1인 배열 

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}

		System.out.print("검색 값 : ");			// 키값을 입력받음
		int ky = stdIn.nextInt();

		int idx = seqSearch(x, num, ky);		// 배열 x에서 값이 ky인 요소를 검색

		if (idx == -1) 
			System.out.println("그 값의 요소는 존재하지 않습니다.");
		else
			System.out.println("그 값은 x[" + idx + "]에 있습니다.");
	}

}
