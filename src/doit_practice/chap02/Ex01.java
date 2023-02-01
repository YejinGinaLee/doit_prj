package doit_practice.chap02;

import java.util.Random;
import java.util.Scanner;

public class Ex01 {

    //--- 배열 a의 최댓값을 구하여 반환 ---//
    static int maxOf(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] > max)
                max = a[i];
        return max;
}

    public static void main(String[] args) {
        Random rand = new Random();
//        Scanner stdIn = new Scanner(System.in);

        System.out.println("키의 최댓값을 구합니다1.");
        System.out.print("사람 수: ");
        
//        int num = stdIn.nextInt();                // 배열의 요솟수를 입력받음
        int num = 1 + rand.nextInt(10); //1추가 이유: nextInt(n): 0~n-1

        int[] height = new int[num];              // 요솟수가 num인 배열을 생성

        System.out.println("키의 최댓값을 구합니다2.");
        for (int i = 0; i < num; i++) {
            height[i] = 100 + rand.nextInt(90);        // 요솟값을 난수로 결정
            System.out.println("height[" + i + "] : " + height[i]);
        }
        
        System.out.println("사람수: " + num);
        System.out.println("최댓값은 " + maxOf(height) + "입니다.");
    }
}