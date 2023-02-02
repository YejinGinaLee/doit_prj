package doit_practice.chap02;

import java.util.Scanner;

public class Ex06 {	
    //--- 정숫값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어 두고 자릿수를 반환 ---//
    static int cardConv(int x, int r, char[] d) {
    	
//    	-----------------------수정할부분----------------------
    	int n = ((Integer)x).toString().length();		// 변환 전의 자릿수
    	
        int digits = 0;                        // 변환 뒤 자릿수
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.printf(String.format("%%2d | %%%dd\n", n), r, x);
        do {
        	
        	System.out.printf("   +");
			for (int i = 0; i < n + 2; i++)
			System.out.print('-');
			System.out.println(); //여기까지 모양 만들기
			

			if (x / r != 0)
				System.out.printf(String.format("%%2d | %%%dd    ... %%d\n", n),
												r, x / r, x % r);
			else
				System.out.printf(String.format("     %%%dd    ... %%d\n", n), x / r, x % r);
        	
            d[digits++] = dchar.charAt(x % r);    // r로 나눈 나머지를 저장
            x /= r;
        } while (x != 0);
//    	-----------------------수정할부분----------------------

        
        for (int i = 0; i < digits / 2; i++) {    // 배열 d의 숫자 문자열을 역순 정렬
            char t = d[i];
            d[i] = d[digits - i - 1];
            d[digits - i - 1] = t;
        }

        return digits;
	}

	 public static void main(String[] args) {
	        Scanner stdIn = new Scanner(System.in);
	        int no;                       // 변환할 정수
	        int cd;                       // 기수
	        int dno;                      // 변환 뒤 자릿수
	        int retry;                    // 다시 한 번?
	        char[] cno = new char[32];    // 변환 후 각 자리의 숫자를 넣어 두는 문자 배열

	        System.out.println("10진수를 기수 변환합니다.");
	        do {
	            do {
	                System.out.print("변환하는 음이 아닌 정수: ");
	                no = stdIn.nextInt();
	            } while (no < 0);

	            do {
	                System.out.print("어떤 진수로 변환할까요?(2-36): ");
	                cd = stdIn.nextInt();
	            } while (cd < 2 || cd > 36);

	            dno = cardConv(no, cd, cno);            // no를 cd 진수로 변환

	            System.out.print(cd + "진수로 ");
	            for (int i = 0; i < dno; i++)            // 순서대로 표시
	                System.out.print(cno[i]);
	            System.out.println("입니다.");

	            System.out.print("다시 한 번 할까요? (1…예/0…아니오): ");
	            retry = stdIn.nextInt();
	        } while (retry == 1);
	    }
}
