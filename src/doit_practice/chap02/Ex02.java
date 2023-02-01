package doit_practice.chap02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex02 {
	//--- 배열 요소 a[idx1]과 a[idx2]의 값을 바꿈 ---//
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];  
        a[idx1] = a[idx2];  
        a[idx2] = t;
    }

    //--- 배열 a의 요소를 역순으로 정렬 ---//
    static void reverse(int[] a) {
    	System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length /2; i++) {
    	System.out.println("a[" + i + "]와" + "a[" + (a.length - i -1) + "]을 교환합니다");	
        swap(a, i, a.length - i - 1);
        
        System.out.println(Arrays.toString(a));
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        

        int num = rand.nextInt(10);

        int[] x = new int[num];            // 요솟수가 num인 배열

        for (int i = 0; i < num; i++) {
            x[i] = rand.nextInt(10);
            
        
        }

        reverse(x);        // 배열 a의 요소를 역순으로 정렬

        System.out.println("역순 정렬을 마쳤습니다.");
    }
}
