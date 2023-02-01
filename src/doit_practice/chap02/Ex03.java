package doit_practice.chap02;

import java.util.Arrays;
import java.util.Random;

public class Ex03 {
	
	static int sumOf(int[] a) {
		int sum = 0;
		for(int i = 0; i<a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int num = rand.nextInt(10);
		
		
		int[] x = new int[num];
		
		for(int i = 0; i<num; i++) {
			x[i] = rand.nextInt(10);
			System.out.println("x["+i+"] : " + x[i]);
		}
		
		sumOf(x);
		
		System.out.println("합계: " + sumOf(x));
 		
	}
}
