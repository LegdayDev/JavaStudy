package ex09;

//���� : �����ε�(���� �̸��� �޼��帣 ���� �� �ֵ�) -������
public class OverEx01 {
	static void hello() {
		System.out.println("hello()");
	}
	static void hello(int num) { //�Ű������� ������ �����̸��� �Լ��� �ٸ��Լ��� �ȴ�.
		System.out.println("hello(int num)");
	}
	static void hello(double num) { //�Լ��̸��� ���� �Ű����� Ÿ���� �ٸ��� �ٸ��Լ���.
		System.out.println("hello(double num)");
	}
	static void hello(int num, String str) { 
		System.out.println("hello(int num, String str)");
	}
	public static void main(String[] args) {
		hello();
		hello(3);
		hello(3.0);
		hello(3,"hi");	
	}
}
