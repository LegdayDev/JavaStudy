package sock.th;

class RealThread implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("RealThread : "+(i+1));
			try {
				Thread.sleep(1000); // 1/1000��
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
		//start()�޼���� os�� run�޼��� �����ϰ� ���ο� ������ ������ ��û
		
		for(int i=0;i<10;i++) {
			System.out.println("���ν����� : "+(i+1));
			try {
				Thread.sleep(1000); // 1/1000��
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
