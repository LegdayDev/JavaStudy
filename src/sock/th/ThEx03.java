package sock.th;

class RealThread implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("RealThread : "+(i+1));
			try {
				Thread.sleep(1000); // 1/1000초
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
public class ThEx03 {
	
	public static void main(String[] args) {

		Thread t1 = new Thread(new RealThread());
		t1.start(); 
		//start()메서드는 os에 run메서드 실행하게 새로운 스레드 생성을 요청
		
		for(int i=0;i<10;i++) {
			System.out.println("메인스레드 : "+(i+1));
			try {
				Thread.sleep(1000); // 1/1000초
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
