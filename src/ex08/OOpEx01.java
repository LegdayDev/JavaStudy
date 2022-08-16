package ex08;

class 앨리스{
	private int 갈증 = 100;
	
	//setter
	void 물마시기() {
		갈증 -=20;
	}
	int 갈증확인() {
		return 갈증;
	}
}
public class OOpEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		앨리스 e = new 앨리스();
		
		e.물마시기();
		System.out.println("앨리스의 갈증 지수는 : " + e.갈증확인());
	}

}
