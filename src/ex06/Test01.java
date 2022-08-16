package ex06;
import java.util.Scanner;
public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String srt[]= {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"}; //요일을 구하기위한 배열
		int month_day[]= {31,28,31,30,31,30,31,31,30,31,30,31};// 각 날짜별 일수
		
		System.out.print("연도를 입력하시오 : ");
		int year=sc.nextInt();
		System.out.print("월을 입력하시오 : ");
		int month=sc.nextInt();
		System.out.print("일을 입력하시오 : ");
		int date=sc.nextInt();
		
		int total_days=0;
		total_days+=(year-1900)*365;
		total_days+=(year-1900)/4; //윤년의 횟수를 구해서 더한다.
		if(((year%4==0 && year%100!=0)|| year%400==0) && (month==1 || month==2))	//윤년이고 1월이나 2월이면 1을 빼준다.
			total_days-=1;
		for(int i=0;i<month-1;i++) {
			total_days+=month_day[i]; //원하는 전 달까지의 일수를 다 더해준다.
		}
		
		total_days+=date; //원하는 달의 일수를 더한다.
		total_days= total_days%7;
		System.out.println(year + "년 "+month + "월 "+date+"일은 "+srt[total_days]+"입니다.");
		
		sc.close();
	}
}


