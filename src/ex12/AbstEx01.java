package ex12;

abstract class Animal{ 
	//DIP(Dependency Inversion Principle) : ������������Ģ ( �߻����ΰſ� �����Ѵ� )
	//��ü���ΰͺ��� ������ �������� �κ��� ��� �߻�Ŭ������ ���� ( �߻�Ŭ�������� �������� �ʴ´�)
	//�߻�Ŭ���� : �̿ϼ����赵 ��� �����ϸ� �ȴ�.
	// ���� 1) �ڽ�Ŭ������ �������� �κ��� ����ø��� ����
	// ���� 2) ��ü���� ������ �𸦶� 
	abstract void sound(); 
	public void run() {System.out.println("�޸���");}
}

class Dog extends Animal{
	public void sound() {System.out.println("��");}
}

class Cat extends Animal{
	public void sound() {System.out.println("�߿�");}
}

public class AbstEx01 {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		Cat c = new Cat();
		
		d.sound();
		c.sound();
		//new Animal(); //�߻�ȭ Ŭ���� ����� ��ü��������
	}
}
