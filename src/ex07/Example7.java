package ex07;
import java.util.Scanner;
public class Example7 {

	static String userId= "admin";
	static int userPw= 1234;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디를 입력하시오 : ");
		String inputId = sc.next();
		System.out.print("비밀번호를 입력하시오 : ");
		int inputPw = sc.nextInt();
		
		if(userId.equals(inputId) && userPw==inputPw) {
			System.out.println("로그인에 성공하셨습니다.");
		}
		else {
			System.out.println("아이디 혹은 비밀번호가 잘못되었습니다.");
		}
		
		sc.close();
	}
}
