package doit_practice.chap07;

import java.util.Scanner;

public class Ex01 {


    //--- 브루트-포스법에 의한 문자열 검색 ---//
    static int bfMatch(String txt, String pat) {
        int pt = 0;        // txt 커서
        int pp = 0;        // pat 커서
        int cnt = 0;
        int k = -1; // 이건뭐지

        while (pt != txt.length() && pp != pat.length()) {
        	
        	//검사 인덱스
        	if (k == pt - pp) // 패턴 2번째 자리부터 (인덱스X)
				System.out.print("    ");
			else { 
				System.out.printf("%2d  ", pt - pp); // 패턴 첫번째 자리 (인덱스O)
				k = pt - pp;
			} 
        	
        	//텍스트 나타내기
        	for (int i = 0; i < txt.length(); i++) {
				System.out.print(txt.charAt(i) + " ");
        	}
			System.out.println();
			
			//true false 나타내기
			for (int i = 0; i < pt * 2 + 4; i++) {
				System.out.print(" ");
			}
			System.out.print(txt.charAt(pt) == pat.charAt(pp) ? '+' : '|');
			System.out.println();
			
			//패턴 위치 조정
			for (int i = 0; i < (pt-pp) * 2 + 4; i++) {
				System.out.print(" ");
			}
			
			//패턴 나타내기, 카운트세기
			for (int i = 0; i < pat.length(); i++) {
				System.out.print(pat.charAt(i) + " ");
			}
			System.out.println();
			System.out.println();
			cnt++;
        	
			//없으면 무한루프..
            if (txt.charAt(pt) == pat.charAt(pp)) {
                pt++;
                pp++;
            } else {
                pt = pt - pp + 1;
                pp = 0;
            }
        }
        
        System.out.printf("비교를 %d회 했습니다.\n", cnt);
        
        if (pp == pat.length())        // 검색 성공
            return pt - pp;
        return -1;                     // 검색 실패
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("텍스트: ");
        String s1 = stdIn.next();                     // 텍스트용 문자열

        System.out.print("패  턴: ");
        String s2 = stdIn.next();                     // 패턴용 문자열

        int idx = bfMatch(s1, s2);    // 문자열 s1에서 문자열 s2를 브루트-포스법으로 검색

        if (idx == -1)
            System.out.println("텍스트 안에 패턴이 없습니다.");
        else {
            // 일치하는 문자 바로 앞까지의 문자 개수를 반각 문자로 환산하여 구함
            int len = 0;
            for (int i = 0; i < idx; i++)
                len += s1.substring(i, i + 1).getBytes().length;
            len += s2.length();

            System.out.println((idx + 1) + "번째 문자부터 일치합니다.");
            System.out.println("텍스트: " + s1);
            System.out.printf(String.format("패  턴: %%%ds\n", len), s2);
        }
    }
}
