package ex10;

class 지구인{
	int armCount = 2;
	int legCount = 2;
	public void hello() {;
		System.out.println("hello()지구인");
	}
}

class 아시아인 extends 지구인{ 
	String hairColor = "검정";
	public void hello() {;
		System.out.println("hello()아시아인");
	}
}

class 한국인 extends 아시아인{
	String faceColor = "황토";
	public void hello() {;
		System.out.println("hello()한국인");
	}
}
public class Extends01 {

	public static void main(String[] args) {
		
		지구인 a = new 아시아인();
		
		a.hello();
		System.out.println(a.armCount);
		//한국인 h1 = new 한국인();
		
//		System.out.println(h1.faceColor);
//		System.out.println(h1.hairColor);
//		System.out.println(h1.armCount);
//		System.out.println(h1.legCount);
		
		//한국인 h2 = h1; //복제가 아닌 a2가 a공간을 가르킨다(reference type)
		/*
		System.out.println("바꾸기 전 : "+a.faceColor);
		a2.faceColor="황금색";
		System.out.println(a.faceColor);
		System.out.println(a2.faceColor);//같은 주소를 공유하기 때문에 a2에서 바꿔도 a1이 바뀐다.
		*/
		
		//아시아인 a1 = h2;
		//지구인 han1 = new 한국인(); //지구인클래스로 선언해서 한국인클래스가 상속받고 가지고있는걸 다쓴다.
		//한국인 han2 = new 아시아인(); //아시아인클래스를 heap에 적재했기 때문에 지구인,아시아인 객체밖에 못쓴다.
	
		
		
		
	}
}
