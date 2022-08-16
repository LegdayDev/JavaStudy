package ex09;

public class MethodEx01 {
	static int add(int a, int b) {return a+b;}
	static int minus(int a, int b) {return a-b;}
	
	public static void main(String[] args) {		
		System.out.println(minus(add(10,5),10));
	}
}
