package ex08;

class Car4{
	private int speed;
	//�ߺ� �޼ҵ� : ���� ����
	public void setSpeed(int s) {
		speed = s;
		System.out.println("���� ���� ȣ��" + speed);
	}
	//�ߺ� �޼ҵ� : �Ǽ� ����
	public void setSpeed(double s) {
		speed = (int)s;
		System.out.println("�Ǽ� ���� ȣ��");
	}
}
public class CarTest04 {

	public static void main(String[] args) {
		Car4 myCar = new Car4();
		myCar.setSpeed(100);
		myCar.setSpeed(79.2);
	}
}
