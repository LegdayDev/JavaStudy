package ex07;
import java.util.Scanner;
public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char []arrayStr= {'a','e','i','o','u'};
		String inputStr = sc.next();
		
		String changeStr = inputStr.toLowerCase(); //������ �ҹ��ڷ� ��ü���༭ �˻�
		int count = 0; // ��������
		for(int i=0;i<changeStr.length();i++) {
			for(int j=0;j<arrayStr.length;j++) {
				if(changeStr.charAt(i)==arrayStr[j])
					count++;
			}
		}
		System.out.println("�������� : "+count);
		System.out.println("�������� : "+(changeStr.length()-count));
		
		sc.close();
	}

}
