package ex06;
import java.util.Scanner;

public class ExampleTest02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputChar = sc.next();

		
		switch (inputChar.charAt(0)) {
		case 'A':
			System.out.println("����");
			break;
		case 'E':
			System.out.println("����");
			break;
		case 'I':
			System.out.println("����");
			break;
		case 'O':
			System.out.println("����");
			break;
		case 'U':
			System.out.println("����");
			break;
		default:
			System.out.println("����");
			break;
		}
		sc.close();
	}

}
