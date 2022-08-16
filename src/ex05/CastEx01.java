package ex05;

//캐스팅(중요하다)
public class CastEx01 {
	public static void main(String[] args) {
		int num = 10; //4byte
		System.out.println("Casting before : "+num);
		double d1 = num; //묵시적 형변환(알아서 해준다)
		System.out.println("Casting after : "+d1);
		
		double d2 = 20.5;
		int num2 = (int)d2;
		System.out.println(num2); //명시적 형변환 = down casting
	}
}
