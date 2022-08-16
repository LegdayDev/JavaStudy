package ex10;

class 동물{
	public void sound() {
		System.out.println("동물소리");
	}
}
class 강아지 extends 동물{
	public void sound() {
		System.out.println("강아지소리");
	}
}
class 고양이 extends 동물{

}

public class Extends03 {

	public static void main(String[] args) {
		강아지 u1 = new 강아지();
		u1.sound(); //이거는 오버라이딩이랑 상관없다.
		

		
		동물 u3 = new 고양이();
		u3.sound();
	}

}
