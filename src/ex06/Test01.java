package ex06;
import java.util.Scanner;
public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String srt[]= {"�Ͽ���","������","ȭ����","������","�����","�ݿ���","�����"}; //������ ���ϱ����� �迭
		int month_day[]= {31,28,31,30,31,30,31,31,30,31,30,31};// �� ��¥�� �ϼ�
		
		System.out.print("������ �Է��Ͻÿ� : ");
		int year=sc.nextInt();
		System.out.print("���� �Է��Ͻÿ� : ");
		int month=sc.nextInt();
		System.out.print("���� �Է��Ͻÿ� : ");
		int date=sc.nextInt();
		
		int total_days=0;
		total_days+=(year-1900)*365;
		total_days+=(year-1900)/4; //������ Ƚ���� ���ؼ� ���Ѵ�.
		if(((year%4==0 && year%100!=0)|| year%400==0) && (month==1 || month==2))	//�����̰� 1���̳� 2���̸� 1�� ���ش�.
			total_days-=1;
		for(int i=0;i<month-1;i++) {
			total_days+=month_day[i]; //���ϴ� �� �ޱ����� �ϼ��� �� �����ش�.
		}
		
		total_days+=date; //���ϴ� ���� �ϼ��� ���Ѵ�.
		total_days= total_days%7;
		System.out.println(year + "�� "+month + "�� "+date+"���� "+srt[total_days]+"�Դϴ�.");
		
		sc.close();
	}
}


