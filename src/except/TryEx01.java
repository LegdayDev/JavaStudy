package except;

//�������� �ƽþ��ΰ� ������ī�� �ѱ����� ����ü�� �ֽ��ϴ�.
abstract class Earth{
	abstract String getName();
}
class Afreeca extends Earth{
	String getName() {
		return "Afreeca";
	}
}
class Asian extends Earth{
	String getName() {
		return "Asian";
	}
}
class Korean extends Asian{
	String getName() {
		return "Korean";
	}
}
class Locket {
	protected void goToMarth(Earth e) {
		System.out.println("ȭ������ "+e.getName()+"�� ����");
	}
}
interface SingleTicket{
	void start(Earth e);
}
//���ּ��� �������� SingleTicket������ start()ȣ��
//start() ���� ���� �����d����.
// start()���δ� ���ּ��� ��ӹ޾� ��ģ���� ����ִ�(goToMarth()) �޼��忡 s�� �ֱ�
public class TryEx01 extends Locket implements SingleTicket{
	@Override
	public void start(Earth e) {
		goToMarth(e);	
	}
	public static void main(String[] args) {
		TryEx01 t1 = new TryEx01();
		Earth s1 = new Afreeca();
		t1.start(s1);		
	}
}