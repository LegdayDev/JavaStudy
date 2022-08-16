package ex07;

class Person {
	static String name = "Cristiano Ronaldo";
	int waterState = 100; // 0~100

	void waterDrink() {
		waterState -= 10;
	}

	void run(int speed) {
		if (speed < 10)
			waterState += 10;
		else if (speed < 20)
			waterState += 20;
		else
			waterState += 30;
	}
	void state() {
		System.out.println("���� ���� �񸶸� :"+waterState);
	}
}

public class JvmEx01 {
	
	static String name = "Lionel Messi";
	
	public static void main(String[] args) {
		System.out.println("JvmEx01Ŭ���� �� name �� : "+JvmEx01.name);
		System.out.println("PersonŬ���� �� name �� : "+ Person.name);
		Person p = new Person();
		
		p.waterDrink();
		p.waterDrink();
		p.waterDrink();
		
		p.state();
		
		p.run(10);
		p.state();
	}

}
