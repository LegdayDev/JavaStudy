package ex08;

class Car3{
	private String color; //����
	private int speed; //�ӵ�
	private int gear; //���
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
	@Override
	public String toString() {
		return "Car3 [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
	}
	
}
public class CarTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car3 myCar = new Car3();
		
		myCar.setColor("red");
		myCar.setSpeed(80);
		myCar.setGear(3);
		
		System.out.println(myCar.toString());
		
	}

}
