package ex06;
import java.util.Scanner;

public class ExampleTest02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputChar = sc.next();

		
		switch (inputChar.charAt(0)) {
		case 'A':
			System.out.println("모음");
			break;
		case 'E':
			System.out.println("모음");
			break;
		case 'I':
			System.out.println("모음");
			break;
		case 'O':
			System.out.println("모음");
			break;
		case 'U':
			System.out.println("모음");
			break;
		default:
			System.out.println("자음");
			break;
		}
		sc.close();
	}

}
