package ex12;

interface Callable{
	abstract void �丮��();
}

class ��� implements Callable{ //attack : �����
	public void ���񹰴��() {}
	public void �������ø���() {}
	public void ���ѱ�() {}
	public void ������ֱ�() {}
	
	@Override
	public void �丮��() {
		// TODO Auto-generated method stub
		���񹰴��();
		�������ø���();
		���ѱ�();
		������ֱ�();
		System.out.println("����� �ϼ��Ǿ����ϴ�.");
	}
}

class ��ġ� implements Callable{	
	public void ���񹰴��() {}
	public void �������ø���() {}
	public void ���ѱ�() {}
	public void ��ġ�߰�() {}
	public void �κ��߰�() {}
	
	@Override
	public void �丮��() {
		���񹰴��();
		�������ø���();
		���ѱ�();
		��ġ�߰�();
		�κ��߰�();
		System.out.println("��ġ��� �ϼ��Ǿ����ϴ�.");
	}
}


public class InterEx02 {

	public static void main(String[] args) {
		Callable c1 = new ���();
		Callable c2 = new ��ġ�();
		
		c1.�丮��();
		c2.�丮��();
	}

}
