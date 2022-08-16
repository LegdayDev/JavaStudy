package ex08;

class Car2{
	private String color; //색상
	private int speed; //속도
	private int gear; //기어
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	
	void print() {
		System.out.println("color : "+color);
		System.out.println("speed : "+speed);
		System.out.println("gear : "+gear);
	}
	
}
public class CarTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 myCar = new Car2();
		
		myCar.setColor("red");
		myCar.setSpeed(80);
		myCar.setGear(3);
		
		myCar.print();
	}

}
