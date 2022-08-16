package ex12;

//인터페이스는 추상메서드만 가진다
//new할당을 못한다.(dart언어에서도 안된다)
//상속과 달리 인터페이스는 다형성을 고려하지 않는다.
//사용자에게 쉬운 메서드를 주기위해서 쓴다(강제성을 부여한다)

interface Move{
	abstract void left();
	void right(); //일반메서드로 적어도 컴파일러가 자동으로 추상화를 해준다.
}

class Game implements Move{

	@Override
	public void left() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		
	}
	
}
public class InterEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
