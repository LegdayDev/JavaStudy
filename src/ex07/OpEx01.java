package ex07;

//1. ����(����)�� ������ �Ѵ�.(�̸�, ����, ����, ��)
class People{
	String name = "ȣ����";
	String gender = "��";
	int age = 37; 
	int money = 100000000;
}

public class OpEx01 {
	//OP:Object Oriented Programming(��ü���� ���α׷���)
	public static void main(String[] args) {
		
		People p = new People();
		People p2 = new People();
		
		p.name="�޽�";
		p.age=35;
		p.money=200000000;
		
		System.out.println(p2.name);
		System.out.println(p2.gender);
		System.out.println(p2.age);
		System.out.println(p2.money);

		System.out.println("-------------------");

		System.out.println(p.name);
		System.out.println(p.gender);
		System.out.println(p.age);
		System.out.println(p.money);
	}
}
