package ex07;

class Movie{
	private String title; //��ȭ����
	private double rate; //����
	private String prod; //�����̸�
	private int year; //��ǥ����
	
	Movie(String t, double r, String p, int y){
		title=t;
		rate=r;
		prod=p;
		year=y;
	}
	
	public void print() {
		System.out.println("��ȭ ���� : "+title);
		System.out.println("��ȭ ���� : "+rate+"��");
		System.out.println("���� �̸� : "+prod);
		System.out.println("��ǥ ���� : "+year+"��");
	}
}
public class Example4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie m = new Movie("�����",4.5,"����ȣ",2020);
		
		m.print();
	}
}
