package doit_practice.chap02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex04 {
	
	static void copy(int[] a, int[] b) {
		
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
        
        copy(a,b);
        
        for (int i=0; i < arrA; i++) {        	
        }
        System.out.println("카피 후 a[]: " + Arrays.toString(a));
       
    }

}
