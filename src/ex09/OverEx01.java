package ex09;

//문법 : 오버로딩(같은 이름의 메서드르 만들 수 있따) -과적재
public class OverEx01 {
	static void hello() {
		System.out.println("hello()");
	}
	static void hello(int num) { //매개변수를 가지면 같은이름의 함수라도 다른함수가 된다.
		System.out.println("hello(int num)");
	}
	static void hello(double num) { //함수이름이 같고 매개변수 타입이 다르면 다른함수다.
		System.out.println("hello(double num)");
	}
	static void hello(int num, String str) { 
		System.out.println("hello(int num, String str)");
	}
	public static void main(String[] args) {
		hello();
		hello(3);
		hello(3.0);
		hello(3,"hi");	
	}
}
