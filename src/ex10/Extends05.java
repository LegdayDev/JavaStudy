package ex10;

abstract class ���{
	abstract String getName();
	abstract int getPrice();
	abstract void setPrice(int price);
}

class ����� extends ���{
	String name = "�����";
	int price = 1000;
	
	public String getName() {return name;}
	public int getPrice() {return price;}
	public void setPrice(int price) {this.price=price;}
}

class �Ŷ�� extends ���{
	String name = "�Ŷ��";
	int price = 1500;
	public String getName() {return name;}
	public int getPrice() {return price;}
	public void setPrice(int price) {this.price=price;}
}

public class Extends05 {

	//���� : 
	static void print(��� lamun) {
		System.out.println(lamun.getName());
		System.out.println(lamun.getPrice());
		lamun.setPrice(3000);
		System.out.println(lamun.getPrice());
	}
	public static void main(String[] args) {
		����� samyang = new �����();
		�Ŷ�� sin = new �Ŷ��();
		
		print(samyang);
		print(sin);
	}

}
