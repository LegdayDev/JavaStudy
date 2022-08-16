package ex12;

interface Callable{
	abstract void 요리해();
}

class 라면 implements Callable{ //attack : 물방울
	public void 냄비물담기() {}
	public void 가스에올리기() {}
	public void 불켜기() {}
	public void 스프면넣기() {}
	
	@Override
	public void 요리해() {
		// TODO Auto-generated method stub
		냄비물담기();
		가스에올리기();
		불켜기();
		스프면넣기();
		System.out.println("라면이 완성되었습니다.");
	}
}

class 김치찌개 implements Callable{	
	public void 냄비물담기() {}
	public void 가스에올리기() {}
	public void 불켜기() {}
	public void 김치추가() {}
	public void 두부추가() {}
	
	@Override
	public void 요리해() {
		냄비물담기();
		가스에올리기();
		불켜기();
		김치추가();
		두부추가();
		System.out.println("김치찌개가 완성되었습니다.");
	}
}


public class InterEx02 {

	public static void main(String[] args) {
		Callable c1 = new 라면();
		Callable c2 = new 김치찌개();
		
		c1.요리해();
		c2.요리해();
	}

}
