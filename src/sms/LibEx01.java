package sms;


import java.util.Random;

public class LibEx01 {

	public static void main(String[] args) {
		Random r = new Random();
		
//		int n = r.nextInt(5); //0~4까지
		
		int temp=0;
		for(int i=0;i<10;i++) {
			
			int a = r.nextInt(5)+1; // 1~5까지
			if(temp==a)	a = r.nextInt(5)+1;
			System.out.println(a);
			temp=a;
		}
		
	
	}

}
