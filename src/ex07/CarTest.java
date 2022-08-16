package ex07;

class Car{ //설계도(오브젝트) Car라는 클래스명도 잘못되었다. 실체화가 가능한 이름으로 해야한다.
	String color;
	int speed;
	int gear;
	void print() {
		System.out.println("color : "+color);
		System.out.println("speed : "+speed+"km/h");
		System.out.println("gear : "+gear +"단");
	}
}
public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car(); //heap에 적재하는 것을 인스턴스화 
		
		myCar.color="red";
		myCar.speed = 120;
		myCar.gear = 1;
		myCar.print();
		
		myCar.gear++; // 이부분도 문법적으로 맞으나, 객체지향적으로는 잘못된 코드이다.
	}

}
