package ex10;

abstract class �ܹ���{
	String name = "�ܹ���";
	abstract String getName();
}

class ����ġ���ܹ��� extends �ܹ���{
	String name = "����ġ���ܹ���";
	String getName() {return name;}
}

public class Extends04 {

	public static void main(String[] args) {
		�ܹ��� s = new ����ġ���ܹ���();
		System.out.println(s.name);
		System.out.println(s.getName());
	}

}
