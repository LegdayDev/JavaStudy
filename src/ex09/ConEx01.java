package ex09;

class �ܹ���{
	int price;
	String name;
	public �ܹ���() {
		this(1000,"�븮����");
	}
	
	public �ܹ���(int price, String name) {
		this.price = price;
		this.name = name;
	} //����Ʈ �����ڴ� �Ȼ����.
}

public class ConEx01 {

	public static void main(String[] args) {
		�ܹ��� h = new �ܹ���(3000,"������ġ��ġŲ����");
		�ܹ��� s = new �ܹ���();
		System.out.println(s.price);
		System.out.println(s.name);
		
		System.out.println();
		
		System.out.println(h.price);
		System.out.println(h.name);

	}

}
