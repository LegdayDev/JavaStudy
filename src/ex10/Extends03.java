package ex10;

class ����{
	public void sound() {
		System.out.println("�����Ҹ�");
	}
}
class ������ extends ����{
	public void sound() {
		System.out.println("�������Ҹ�");
	}
}
class ����� extends ����{

}

public class Extends03 {

	public static void main(String[] args) {
		������ u1 = new ������();
		u1.sound(); //�̰Ŵ� �������̵��̶� �������.
		

		
		���� u3 = new �����();
		u3.sound();
	}

}
