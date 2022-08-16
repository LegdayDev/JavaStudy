package ex09;

class Car{
	private String color;
	private int speed;
	private int gear;
	
	//생성자(선언하지 않아도 있는것이다), 형태는 메서드이다.
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
