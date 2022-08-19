package except;

abstract class Animal{}

class Dog extends Animal{
	void print() {System.out.println("������");}
}

class Maltiz extends Dog{}

class Chiwawa extends Dog{}

public class TryEx02 {

	public static void main(String[] args) {
		Animal s1 = new Dog(); //chiwawa�� maltiz�� �ȶ�
		Dog s2 = null;
		try {
			s2 = (Maltiz)s1; // �ٿ�ĳ����(DownCasting) , compile�� ������ ������	
		} catch (Exception e) {
			System.out.println(e.getMessage());
			s2 = new Maltiz();
			//1) ��������
			//2) ���Ϸ� �α�
			//3) print������ �޽�������
			//System.out.println("Ŭ���� �ٿ� ĳ���ý� ���� �߻�");
		}
		
		s2.print();
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
		
		
		
		
	}

}
