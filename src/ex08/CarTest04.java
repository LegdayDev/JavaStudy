package ex08;

class Car4{
	private int speed;
	//중복 메소드 : 정수 버전
	public void setSpeed(int s) {
		speed = s;
		System.out.println("정수 버전 호출" + speed);
	}
	//중복 메소드 : 실수 버전
	public void setSpeed(double s) {
		speed = (int)s;
		System.out.println("실수 버전 호출");
	}
}
public class CarTest04 {

	public static void main(String[] args) {
		Car4 myCar = new Car4();
		myCar.setSpeed(100);
		myCar.setSpeed(79.2);
	}
}
