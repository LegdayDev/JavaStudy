package ex07;

class Car{ //���赵(������Ʈ) Car��� Ŭ������ �߸��Ǿ���. ��üȭ�� ������ �̸����� �ؾ��Ѵ�.
	String color;
	int speed;
	int gear;
	void print() {
		System.out.println("color : "+color);
		System.out.println("speed : "+speed+"km/h");
		System.out.println("gear : "+gear +"��");
	}
}
public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car(); //heap�� �����ϴ� ���� �ν��Ͻ�ȭ 
		
		myCar.color="red";
		myCar.speed = 120;
		myCar.gear = 1;
		myCar.print();
		
		myCar.gear++; // �̺κе� ���������� ������, ��ü���������δ� �߸��� �ڵ��̴�.
	}

}
