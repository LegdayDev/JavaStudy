package ex07;

import java.util.Scanner;
public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String inputStr = sc.next();
		
		int start=inputStr.length()-1;
		
		for(int i=start;i>=0;i--) {
			System.out.print(inputStr.charAt(i));
		}
		
		sc.close();
	}

}
