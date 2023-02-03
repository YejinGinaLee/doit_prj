package doit_practice.chap03;

import java.util.Arrays;
import java.util.Scanner;



public class Ex03 {
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		//-----------수정할 곳--------------------------------------
		int cnt = 0;
		for(int i=0; i < n; i++) {
			if(a[i] == key) {
				idx[cnt++] = i;
			}			
		}
		return cnt;
		//-----------수정할 곳--------------------------------------
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("요솟수 : ");
		int num = stdIn.nextInt();
		int[] x = new int[num];					// 요솟수가 num 인 배열 
		int[] y = new int[num];					// 요솟수가 num 인 배열 

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		System.out.print("검색 값 : "); 					// 키값을 입력받음
		int ky = stdIn.nextInt();
		
		//-----------수정할 곳--------------------------------------

		int count = searchIdx(x, num, ky, y);		// 배열 x안의 값이 ky인 요소를 y에 copy 

		int[] arr = new int[count];
		
		if (count == 0) {
			System.out.println("그 값의 요소는 존재하지 않습니다.");
			
		} else {
			int i = 0;
			
			
			for (i = 0; i < count; i++) {
				
				arr[i] = y[i];
			}
			System.out.println("idx"+Arrays.toString(arr));
			System.out.println("총 개수: "+ count);
		}
		//-----------수정할 곳--------------------------------------
	}
}
