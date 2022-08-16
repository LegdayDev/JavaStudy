package ex07;

//1. 상태(변수)를 만들어야 한다.(이름, 성별, 나이, 돈)
class People{
	String name = "호날두";
	String gender = "남";
	int age = 37; 
	int money = 100000000;
}

public class OpEx01 {
	//OP:Object Oriented Programming(객체지향 프로그래밍)
	public static void main(String[] args) {
		
		People p = new People();
		People p2 = new People();
		
		p.name="메시";
		p.age=35;
		p.money=200000000;
		
		System.out.println(p2.name);
		System.out.println(p2.gender);
		System.out.println(p2.age);
		System.out.println(p2.money);

		System.out.println("-------------------");

		System.out.println(p.name);
		System.out.println(p.gender);
		System.out.println(p.age);
		System.out.println(p.money);
	}
}
