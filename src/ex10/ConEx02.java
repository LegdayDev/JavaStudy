package ex10;

class �ܹ�{
	String name;
	
	public �ܹ�() {
	}
	public �ܹ�(String name) {
		this.name = name;
	}
}

class ����ġ���ܹ� extends �ܹ�{
	
	public ����ġ���ܹ�(String name) {
		super(name);
	}
	public ����ġ���ܹ�() {
		super("");
	}
}
public class ConEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		����ġ���ܹ� s = new ����ġ���ܹ�("����ġ��");
		System.out.println(s.name);
		
		����ġ���ܹ� h = new ����ġ���ܹ�();
		System.out.println(h.name);
	}

}
