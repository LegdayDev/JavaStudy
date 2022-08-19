package except;

//지구인은 아시아인과 아프리카인 한국인의 구현체가 있습니다.
abstract class Earth{
	abstract String getName();
}
class Afreeca extends Earth{
	String getName() {
		return "Afreeca";
	}
}
class Asian extends Earth{
	String getName() {
		return "Asian";
	}
}
class Korean extends Asian{
	String getName() {
		return "Korean";
	}
}
class Locket {
	protected void goToMarth(Earth e) {
		System.out.println("화성으로 "+e.getName()+"이 날라감");
	}
}
interface SingleTicket{
	void start(Earth e);
}
//우주선을 날릴려면 SingleTicket구현후 start()호출
//start() 내부 내가 구현햏야함.
// start()내부는 우주선을 상속받아 그친구가 들고있는(goToMarth()) 메서드에 s에 넣기
public class TryEx01 extends Locket implements SingleTicket{
	@Override
	public void start(Earth e) {
		goToMarth(e);	
	}
	public static void main(String[] args) {
		TryEx01 t1 = new TryEx01();
		Earth s1 = new Afreeca();
		t1.start(s1);		
	}
}