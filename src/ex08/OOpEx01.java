package ex08;

class �ٸ���{
	private int ���� = 100;
	
	//setter
	void �����ñ�() {
		���� -=20;
	}
	int ����Ȯ��() {
		return ����;
	}
}
public class OOpEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		�ٸ��� e = new �ٸ���();
		
		e.�����ñ�();
		System.out.println("�ٸ����� ���� ������ : " + e.����Ȯ��());
	}

}
