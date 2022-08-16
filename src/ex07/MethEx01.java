package ex07;

class myCal{
	//static void plus() {System.out.println("plus 메서드가 호출되었습니다.");}  2번방법
	
	int a;	// myCal에 a변수는 heap에 저장되기 때문에 오류가 안난다. 
			//calMinus에 있는 a변수는 메서드가 실행 시에 stack에 저장되어서 실행된다 
	int b;
				 
	void calPlus() {System.out.println("calPlus 메서드가 호출되었습니다.");} //1번 방법
	void calMinus(int a, int b) {System.out.println(a+" - "+b+" = "+(a-b));} //a,b 변수는 지역변수 이기 때문에 stack에 저장한다
	//void calMinus() {System.out.println(a+" - "+b+" = "+(a-b)); //이 함수로 실행하면 a,b 변수가 heap공간에 쓸떼없이 계속 유지된다는 단점이다.
	
	int calMinus2(int a, int b) { //함수 타입과 반환타입은 동일하게 
		return a-b;
	}
	double calMulti(int a, int b) {
		return a*b;
	}
	double calDivi(int a, int b) {
		return a/(double)b;
	}
}

public class MethEx01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myCal m = new myCal(); 
		//m.calPlus();	//1번방법 heap공간에 m이라는 주소의 객체를 생성하여 호출하는방법
						//한번 쓰고 버릴 것이라면 1번방법이 맞다.
		
		//myCal.plus();	//2번방법 plus()메서드에 static을 붙혀 호출하는 방법
						//static은 모두가 공유할 수 있을때 쓰는게 좋다.
		
		//m.calMinus(30,20);
		//int res=m.calMinus2(5, 10); //return값이 res값에 담긴다. 이때도 return타입과 저장하는 공간의 타입을 동일하게 맞춘다.
		//System.out.println(res);
		
		double myMul=m.calMulti(10, 30);
		double myDiv=m.calDivi(10, 30);
		
		System.out.println("10 * 30 = "+myMul);
		System.out.println("10 / 30 = "+String.format("%.3f", myDiv));
	}
}
