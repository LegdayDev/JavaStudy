package ex07;
import java.util.Scanner;
public class Example7 {

	static String userId= "admin";
	static int userPw= 1234;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̵� �Է��Ͻÿ� : ");
		String inputId = sc.next();
		System.out.print("��й�ȣ�� �Է��Ͻÿ� : ");
		int inputPw = sc.nextInt();
		
		if(userId.equals(inputId) && userPw==inputPw) {
			System.out.println("�α��ο� �����ϼ̽��ϴ�.");
		}
		else {
			System.out.println("���̵� Ȥ�� ��й�ȣ�� �߸��Ǿ����ϴ�.");
		}
		
		sc.close();
	}
}
