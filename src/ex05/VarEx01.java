package ex05;

public class VarEx01{
	public static void main(String[] args) {
		int n1 = 2000000000; //정수는 그냥 int형 쓰면댐, 최대는 21억
		System.out.println(n1);
		
		double d1 = 3.141592; //실수형은 그냥 double형 쓰면댐
		System.out.println(d1);
		
		long lo1 = 30000000000L; //int형보다 큰 숫자는 long타입을 쓴다. 할당값 뒤에 L기입.
		System.out.println(lo1);
		
		boolean b1 = true; //boolean 은 1아니면 0 을 저장. 1이외의 전부 0으로 해석
		System.out.println(b1);
		System.out.println(10>5);
		System.out.println(10<5);
	}
}
