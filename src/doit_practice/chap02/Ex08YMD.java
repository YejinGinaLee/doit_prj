package doit_practice.chap02;

import java.util.Calendar;
import java.util.Scanner;

public class Ex08YMD {
	int y; //년
	int m; //월
	int d; //일
	
	Ex08YMD (int y, int m, int d) {
		this.y = y;
		this.m = m;
		this.d = d;
	}
	
	Ex08YMD after(int n) {
		
		if (n < 0) {
			return before(-n);
		}
		
		 Calendar cal = Calendar.getInstance();
		   
		   cal.set(Calendar.YEAR, this.y);
		   cal.set(Calendar.MONTH, this.m -1); 
		   cal.set(Calendar.DATE, this.d);
		   
		   cal.add(Calendar.DATE, n);

		   int year = cal.get(Calendar.YEAR);
		   int month = (cal.get(Calendar.MONTH)+1);
		   int date = cal.get(Calendar.DATE);
		   
		   this.y = year;
		   this.m = month;
		   this.d = date;
		   
		   Ex08YMD ymd = new Ex08YMD(y, m, d);
		   
		   return ymd;
		   
	}
	
	
	Ex08YMD before(int n) {
		if (n < 0) {
			return after(-n);
		}
		
		 Calendar cal = Calendar.getInstance();
		   
		   cal.set(Calendar.YEAR, this.y);
		   cal.set(Calendar.MONTH, this.m -1); 
		   cal.set(Calendar.DATE, this.d);
		   
		   cal.add(Calendar.DATE, (-n * 2));

		   int year = cal.get(Calendar.YEAR);
		   int month = (cal.get(Calendar.MONTH)+1);
		   int date = cal.get(Calendar.DATE);
		   
		   this.y = year;
		   this.m = month;
		   this.d = date;
		   
		   Ex08YMD ymd = new Ex08YMD(y, m, d);

		   return ymd;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("날짜를 입력하세요.\n");
		System.out.print("년 : ");  int y = stdIn.nextInt();
		System.out.print("월 : ");  int m = stdIn.nextInt();
		System.out.print("일 : ");  int d = stdIn.nextInt();
				
		Ex08YMD date = new Ex08YMD(y, m, d);
		
		System.out.print("며칠 전/후의 날짜를 구할까요? : ");
		int n = stdIn.nextInt();
		
		Ex08YMD d1 = date.after(n);
		System.out.printf("%d일 후의 날짜는 %d년%d월%d일입니다.\n", n, d1.y, d1.m, d1.d);

		Ex08YMD d2 = date.before(n);
		System.out.printf("%d일 전의 날짜는 %d년%d월%d일입니다.\n", n, d2.y, d2.m, d2.d);

    }

}
