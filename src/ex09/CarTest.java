package ex09;

class Car{
	private String color;
	private int speed;
	private int gear;
	
	//������(�������� �ʾƵ� �ִ°��̴�), ���´� �޼����̴�.
	public Car(String color, int speed, int gear) {
		super();
		this.color = color;
		this.speed = speed;
		this.gear = gear;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
	}
}

public class CarTest {

	public static void main(String[] args) {
		Car myCar = new Car("red",50,2);
		System.out.println(myCar.toString());
	}

}
