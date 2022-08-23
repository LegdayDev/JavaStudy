package sock.th;

interface Game2{
	void start();
}
class agaggagagagaga implements Game2{

	@Override
	public void start() {
		System.out.println("gamestart");
	}
}
public class ThEx02 {

	public void run(Game2 game) {
		game.start();
	}
	
	public static void main(String[] args) {
		ThEx02 th = new ThEx02();
	
		th.run(new agaggagagagaga());
	}
	
}
