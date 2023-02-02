package doit_practice.chap02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex05 {
	
	//--- 배열 요소 a[idx1]과 a[idx2]의 값을 바꿈 ---//
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];  
        a[idx1] = a[idx2];  
        a[idx2] = t;
    }
	
	static void rcopy(int[] a, int[] b) {
		
		for (int i = 0; i < b.length /2; i++) {
//	    	System.out.println("b[" + i + "]와" + "b[" + (b.length - i -1) + "]을 교환합니다");	
	        swap(b, i, b.length - i - 1);
	        }
		System.out.println("역순정렬 후: " + Arrays.toString(b));
		
		int num = a.length <= b.length ? a.length : b.length;
		for (int i = 0; i < num; i++) {
			a[i] = b[i];
		}
	}
	
	public static void main(String[] args) {
        Random rand = new Random();
        
        int arrB = rand.nextInt(10);
        int[] b = new int[arrB];
        for (int i = 0; i < arrB; i++) {
        	b[i] = rand.nextInt(10);
        }
        System.out.println("b[]:" + Arrays.toString(b));

        int arrA = rand.nextInt(10);
        int[] a = new int[arrA];
        for (int i = 0; i < arrA; i++) {
        	a[i] = rand.nextInt(10);
        }
        System.out.println("a[]: " + Arrays.toString(a));
        
        rcopy(a,b);
        
        for (int i=0; i < arrA; i++) {        	
        }
        System.out.println("카피 후 a[]: " + Arrays.toString(a));
       
    }

}
