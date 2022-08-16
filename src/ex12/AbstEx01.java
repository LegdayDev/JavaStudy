package ex12;

abstract class Animal{ 
	//DIP(Dependency Inversion Principle) : 의존성역전원칙 ( 추상적인거에 의존한다 )
	//구체적인것부터 설계후 공통적인 부분을 묶어서 추상클래스를 설계 ( 추상클래스부터 설계하지 않는다)
	//추상클래스 : 미완성설계도 라고 생각하면 된다.
	// 목적 1) 자식클래스의 공통적인 부분을 끌어올리기 위해
	// 목적 2) 구체적인 행위를 모를때 
	abstract void sound(); 
	public void run() {System.out.println("달린다");}
}

class Dog extends Animal{
	public void sound() {System.out.println("멍");}
}

class Cat extends Animal{
	public void sound() {System.out.println("야옹");}
}

public class AbstEx01 {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		Cat c = new Cat();
		
		d.sound();
		c.sound();
		//new Animal(); //추상화 클래스 선언시 객체생성오류
	}
}
