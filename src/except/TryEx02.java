package except;

abstract class Animal{}

class Dog extends Animal{
	void print() {System.out.println("강아지");}
}

class Maltiz extends Dog{}

class Chiwawa extends Dog{}

public class TryEx02 {

	public static void main(String[] args) {
		Animal s1 = new Dog(); //chiwawa와 maltiz가 안뜸
		Dog s2 = null;
		try {
			s2 = (Maltiz)s1; // 다운캐스팅(DownCasting) , compile시 오류가 터진다	
		} catch (Exception e) {
			System.out.println(e.getMessage());
			s2 = new Maltiz();
			//1) 문자전송
			//2) 파일로 로그
			//3) print문으로 메시지띄우기
			//System.out.println("클래스 다운 캐스팅시 문제 발생");
		}
		
		s2.print();
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
		
		
		
		
	}

}
