package ex09;

class 햄버거{
	int price;
	String name;
	public 햄버거() {
		this(1000,"대리버거");
	}
	
	public 햄버거(int price, String name) {
		this.price = price;
		this.name = name;
	} //디폴트 생성자는 안생긴다.
}

public class ConEx01 {

	public static void main(String[] args) {
		햄버거 h = new 햄버거(3000,"상하이치즈치킨버거");
		햄버거 s = new 햄버거();
		System.out.println(s.price);
		System.out.println(s.name);
		
		System.out.println();
		
		System.out.println(h.price);
		System.out.println(h.name);

	}

}
