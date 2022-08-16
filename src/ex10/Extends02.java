package ex10;


class Animal{
	int num =10;
}
class Dog extends Animal{
	int num = 20;
}
public class Extends02 {

	public static void main(String[] args) {
		Dog d1 = new Dog(); //heap메모리에 (d1->)Dog클래스,Animal클래스 적재
		System.out.println(d1.num); //Dog클래스의 num이 나온다.
		
		Animal d2 = new Dog(); //heap메모리에 Dog클래스,(d2->)Animal클래스 적재
		System.out.println(d2.num); //포인터가 Animal클래스니까 10이 나온다.
	}

}
